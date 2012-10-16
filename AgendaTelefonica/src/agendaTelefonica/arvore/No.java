/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agendaTelefonica.arvore;

import agendaTelefonica.Dado;

/**
 *
 * @author samuel
 */
public class No {

    private int t = 2;
    private int numChaves; //Variavel que armazena o numero total de chaves
    private Dado chaves[];
    private No filho[];
    private boolean isLeaf;

    public No() {
        this.numChaves = 0;
        this.isLeaf = true;
        this.chaves = new Dado[2 * t - 1];
        this.filho = new No[2 * t];
    }

    public String toString (No no, int pos) {
        return no.getChaves()[pos].getDado();
    }
    
    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getNumChaves() {
        return numChaves;
    }

    public void setNumChaves(int numChaves) {
        this.numChaves = numChaves;
    }

    public Dado[] getChaves() {
        return chaves;
    }

    public void setChaves(Dado[] chaves) {
        this.chaves = chaves;
    }

    public No[] getFilho() {
        return filho;
    }

    public void setFilho(No[] filho) {
        this.filho = filho;
    }

    public boolean isIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(boolean isLeaf) {
        this.isLeaf = isLeaf;
    }
    
    

}