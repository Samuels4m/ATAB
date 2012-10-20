/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.io.File;

/**
 *
 * @author samuel
 */
public class Main {

    public static void main(String args[]) {
        File arquivo = new File("dados.txt");
        Agenda agenda = new Agenda(arquivo);
       // agenda.salvarPessoa("Samuel", "Rua Rio da Paz", "297");
       // agenda.salvarPessoa("Pelego", "Rua Pelegada", "4321");
        agenda.atualizaQuantPessoa();
        System.out.println(agenda.removerPessoa(0));
    }
}
