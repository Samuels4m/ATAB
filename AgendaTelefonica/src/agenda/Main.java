/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.beans.beancontext.BeanContext;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.io.CharToByteASCII;

/**
 *
 * @author samuel
 */
public class Main {

    public static void main(String args[]) {
        try {
            try {
                String nome = "Samuel";
                String end = "Rua";
                String tel = "3030";
                byte[] n = new byte[30];
                byte[] e = new byte[50];
                byte[] t = new byte[15];

                for (int i = 0; i < nome.length(); i++) {
                    n[i] = (byte) nome.charAt(i);
                }
                for (int i = 0; i < end.length(); i++) {
                    e[i] = (byte) end.charAt(i);
                }
                 for (int i = 0; i < tel.length(); i++) {
                    t[i] = (byte) tel.charAt(i);
                }
     

                /*
                 * 
                 */

       

                /*
                 * 
                 */

               
                    File file = new File("dados.txt");
                RandomAccessFile raf;
                    
                    ByteArrayOutputStream bos = new ByteArrayOutputStream();
                    
                    int fim = 0;
                    
                    raf = new RandomAccessFile(file, "rw");
                    
                    raf.seek(fim);
                    raf.write(n);
                    raf.write(e);
                    raf.write(t);
                    raf.close();
                

            
     

                /*
                 * 
                 */


              
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
             File file = new File("dados.txt");
                RandomAccessFile raf;
                    
                    ByteArrayOutputStream bos = new ByteArrayOutputStream();
                    
                    int fim = 0;
                    
                    raf = new RandomAccessFile(file, "rw");
                    byte[] n = new byte[30];
                    raf.seek(fim);
                    raf.read(n);
                    String teste = new String(n, "UTF-8");
                    System.out.println(teste);
                    raf.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
