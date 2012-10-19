/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author samuel
 */
public class Pessoa {
    
    private char[] nome = new char[30];
    private char[] endereco = new char[50];
    private char[] telefone = new char[30];
    private boolean excluido;

    public Pessoa(char[] nome, char[] endereco, char[] telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.excluido = false;
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

    public boolean isExcluido() {
        return excluido;
    }

    public void setExcluido(boolean excluido) {
        this.excluido = excluido;
    }
    
    public char[] toChars () {
        int i, j=0;
        char[] pessoa = new char[95];
        for (i = 0; i < nome.length; i++) {
            pessoa[j] = nome[i];
            j++;
        }
        for (i = 0; i < endereco.length; i++) {
            pessoa[j] = endereco[i];
            j++;
        }
        for (i = 0; i < telefone.length; i++) {
            pessoa[j] = telefone[i];
            j++;
        }
        return pessoa;
    }
}
