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

    public boolean salvarPessoa(Pessoa pessoa) {
        try {
            byte[] n = new byte[30];
            byte[] e = new byte[50];
            byte[] t = new byte[15];
            byte b;

            for (int i = 0; i < pessoa.getNome().length(); i++) {
                n[i] = (byte) pessoa.getNome().charAt(i);
            }
            for (int i = 0; i < pessoa.getEndereco().length(); i++) {
                e[i] = (byte) pessoa.getEndereco().charAt(i);
            }
            for (int i = 0; i < pessoa.getTelefone().length(); i++) {
                t[i] = (byte) pessoa.getTelefone().charAt(i);
            }
            if (pessoa.isExcluido()) {
                b = (byte) '0';
            } else {
                b = (byte) '1';
            }
            

            RandomAccessFile raf;

            raf = new RandomAccessFile(this.arquivo, "rw");

            raf.seek(this.arquivo.length());
            raf.write(n);
            raf.write(e);
            raf.write(t);
            raf.write(b);
            raf.close();

            return true;
        } catch (IOException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void atualizaQuantPessoa() {
        this.quantPessoa = contarPessoa() / 96;
    }

    public boolean removerPessoa(int Pos) {
        boolean mudou = false;
        try {
            byte[] buffer = new byte[96];
            File backup = new File("backup.txt");
            RandomAccessFile raf;
            RandomAccessFile rafB;

            try {
                raf = new RandomAccessFile(this.arquivo, "rw");
                rafB = new RandomAccessFile(backup, "rw");

                raf.seek(0);
                rafB.seek(0);

                for (int i = 0; i < raf.length(); i = i + 96) {
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
            for (int i = 0; i < rafB.length(); i = i + 96) {
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
    
    public boolean alterarPessoa (Pessoa pessoa, int pos) {
        if (removerPessoa(pos)) {
            if (salvarPessoa(pessoa)) {
                return true;
            }
        }
        
        return false;
    }
    
}
