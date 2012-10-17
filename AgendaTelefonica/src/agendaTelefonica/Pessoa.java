/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agendaTelefonica;

/**
 *
 * @author samuel
 */
public class Pessoa {
    
    private char[] nome = new char[30];
    private char[] endereco = new char[50];
    private char[] telefone = new char[15];
    private boolean apagado;

    public Pessoa(char[] nome, char[] endereco, char[] telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.apagado = false;
    }

    public char[] getNome() {
        return nome;
    }

    public void setNome(char[] nome) {
        this.nome = nome;
    }

    public char[] getEndereco() {
        return endereco;
    }

    public void setEndereco(char[] endereco) {
        this.endereco = endereco;
    }

    public char[] getTelefone() {
        return telefone;
    }

    public void setTelefone(char[] telefone) {
        this.telefone = telefone;
    }

    public boolean isApagado() {
        return apagado;
    }

    public void setApagado(boolean apagado) {
        this.apagado = apagado;
    }
}
