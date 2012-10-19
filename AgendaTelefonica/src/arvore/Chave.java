/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

/**
 *
 * @author samuel
 */
public class Chave {
    private char[] nome = new char[30];
    private int inicio;

    public Chave(char[] nome, int inicio) {
        this.nome = nome;
        this.inicio = inicio;
    }

    public char[] getNome() {
        return nome;
    }

    public void setNome(char[] nome) {
        this.nome = nome;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }
    
}
