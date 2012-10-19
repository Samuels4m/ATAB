/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arvore;

/**
 *
 * @author samuel
 */
public class No {
    /*
     const m = 2;   // ordem da arvore­B

     typedef struct node_Btree Btree; 

     struct node_Btree { 

        int num_keys;     // numero de chaves armazenadas

        char keys[2*m­1]; // vetor de chaves

        Btree *desc[2*m]; // ponteiros para os descendentes

        bool leaf;        // flag folha da arvore

     };
     */
    
    private int ordem = 2;
    private int num_key;
    private Chave[] keys = new Chave[ordem*2-1];
    private No[] filhos = new No[ordem*2];
    private boolean leaf;

    public No() {
        this.num_key = 0;
        this.keys = null;
        this.filhos = null;
        this.leaf = true;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public int getNum_key() {
        return num_key;
    }

    public void setNum_key(int num_key) {
        this.num_key = num_key;
    }

    public Chave[] getKeys() {
        return keys;
    }

    public void setKeys(Chave[] keys) {
        this.keys = keys;
    }

    public No[] getFilhos() {
        return filhos;
    }

    public void setFilhos(No[] filhos) {
        this.filhos = filhos;
    }

    public boolean isLeaf() {
        return leaf;
    }

    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }
    
}
