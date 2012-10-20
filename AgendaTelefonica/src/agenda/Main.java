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
        Pessoa pessoa;
        Agenda agenda = new Agenda(arquivo);
        
        pessoa = new Pessoa("Samuel", "Rua Rio da Paz", "297", false);
        agenda.salvarPessoa(pessoa);
        
        pessoa = new Pessoa("Pelego", "Rua Pelegada", "4321", false);
        agenda.salvarPessoa(pessoa);
        
        pessoa = new Pessoa("Poim", "Rua Pel", "43", false);
        agenda.salvarPessoa(pessoa);
        
        agenda.atualizaQuantPessoa();
        
        pessoa = new Pessoa("Pel", "Pelzim", "3049", true);
        
        System.out.println(agenda.alterarPessoa(pessoa, 96));
    }
}
