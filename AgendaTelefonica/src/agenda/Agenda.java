/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
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

    public int contarPessoa() {
        int cont = 0;
        try {

            byte[] get = new byte[95];
            RandomAccessFile raf = new RandomAccessFile(this.arquivo, "rw");
            raf.seek(0);
            cont = (int) raf.length();
        } catch (IOException ex) {
            Logger.getLogger(Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cont;
    }

    public boolean salvarPessoa(String nome, String endereco, String telefone, File arquivo) {
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

            File file = new File("dados.txt");
            RandomAccessFile raf;

            raf = new RandomAccessFile(file, "rw");

            raf.seek(file.length());
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
}
