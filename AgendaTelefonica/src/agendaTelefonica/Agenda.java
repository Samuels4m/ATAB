/**
 * Sistema de Agenda telefonica utilizando árvore B Trabalho de Estrutura de
 * Dados 2012 Professor: Josué Castro Alunos: Gustavo Gargione, Hikar....,
 * Samuel Blum Vorpagel.
 *
 * @version 0.1
 */
package agendaTelefonica;

import agendaTelefonica.arvore.ArvoreB;

/**
 * Classe Principal do projeto
 *
 * @author samuel
 */
public class Agenda {

    /**
     * Metodo Main do projeto
     *
     * @param args
     */
    public static void main(String[] args) {
        ArvoreB arvoreB = new ArvoreB();
        System.out.println(arvoreB.Busca("B", arvoreB.getRaiz()));
        System.out.println(arvoreB.toString());
    }
}
