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
    
    private String nome;
    private String endereco;
    private String telefone;
    private boolean excluido;

    public Pessoa(String nome, String endereco, String telefone, boolean excluido) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.excluido = excluido;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isExcluido() {
        return excluido;
    }

    public void setExcluido(boolean excluido) {
        this.excluido = excluido;
    }

}
