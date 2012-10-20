/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samuel
 */
public class Agenda {

    private int quantPessoa;
    private File arquivo;

    public Agenda(File arquivo) {
        this.arquivo = arquivo;
        this.quantPessoa = 0;
    }

    public int getQuantPessoa() {
        return quantPessoa;
    }

    public void setQuantPessoa(int quantPessoa) {
        this.quantPessoa = quantPessoa;
    }

    public File getArquivo() {
        return arquivo;
    }

    public void setArquivo(File arquivo) {
        this.arquivo = arquivo;
    }

    /*
     * 
     */
    public int contarPessoa() {
        int cont = 0;
        try {
            RandomAccessFile raf = new RandomAccessFile(this.arquivo, "rw");
            raf.seek(0);
            cont = (int) raf.length();
        } catch (IOException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cont;
    }

    public boolean salvarPessoa(String nome, String endereco, String telefone) {
        try {
            byte[] n = new byte[30];
            byte[] e = new byte[50];
            byte[] t = new byte[15];

            for (int i = 0; i < nome.length(); i++) {
                n[i] = (byte) nome.charAt(i);
            }
            for (int i = 0; i < endereco.length(); i++) {
                e[i] = (byte) endereco.charAt(i);
            }
            for (int i = 0; i < telefone.length(); i++) {
                t[i] = (byte) telefone.charAt(i);
            }


            RandomAccessFile raf;

            raf = new RandomAccessFile(this.arquivo, "rw");

            raf.seek(this.arquivo.length());
            raf.write(n);
            raf.write(e);
            raf.write(t);
            raf.close();

            return true;
        } catch (IOException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void atualizaQuantPessoa() {
        this.quantPessoa = contarPessoa() / 95;
    }

    public boolean removerPessoa(int Pos) {
        boolean mudou = false;
        try {
            byte[] buffer = new byte[95];
            File backup = new File("backup.txt");
            RandomAccessFile raf;
            RandomAccessFile rafB;

            try {
                raf = new RandomAccessFile(this.arquivo, "rw");
                rafB = new RandomAccessFile(backup, "rw");

                raf.seek(0);
                rafB.seek(0);

                for (int i = 0; i < raf.length(); i = i + 95) {
                    raf.read(buffer);
                    if (i != Pos) {
                        rafB.write(buffer);
                    } else {
                        mudou = true;
                    }
                }
                raf.close();
                this.arquivo.delete();
            } catch (IOException ex) {
                Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }

            raf = new RandomAccessFile(this.arquivo, "rw");
            rafB = new RandomAccessFile(backup, "rw");
            for (int i = 0; i < rafB.length(); i = i + 95) {
                rafB.read(buffer);
                raf.write(buffer);
            }
            rafB.close();
            backup.delete();
        } catch (IOException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        return mudou;
    }
}
