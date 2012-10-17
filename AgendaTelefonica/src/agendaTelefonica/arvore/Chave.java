/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agendaTelefonica.arvore;

/**
 *
 * @author samuel
 */
public class Chave {
    private char[] nome = new char[30];
    private int posicao;

    public Chave(char[] nome, int posicao) {
        this.nome = nome;
        this.posicao = posicao;
    }

    public char[] getNome() {
        return nome;
    }

    public void setNome(char[] nome) {
        this.nome = nome;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
    
}
