/**
 * Classe que contem a especificacao, implementacao e metodos de manipulacao da
 * arvore.
 *
 * @version 0.1
 */
package agendaTelefonica.arvore;

/**
 *
 * @author samuel
 */
public class ArvoreB {

    /*
     * const t = 2; 
     typedef struct no_arvoreB arvoreB; 

     struct no_arvoreB { 
     int num_chaves; 
     char chaves[2*t-1];
     arvoreB *filhos[2*t]; 
     bool folha; 
     };
     */
    private int t = 2;
    private int numChaves;
    private Chave[] chave = new Chave[t * 2 - 1];
    private ArvoreB[] filho = new ArvoreB[t * 2];

    public ArvoreB(Chave[] chave, ArvoreB[] filho) {
        this.numChaves = 0;
        this.chave = chave;
        this.filho = filho;
    }

    public int getT() {
        return t;
    }

    public int getNumChaves() {
        return numChaves;
    }

    public void setNumChaves(int numChaves) {
        this.numChaves = numChaves;
    }

    public Chave[] getChave() {
        return chave;
    }

    public void setChave(Chave[] chave) {
        this.chave = chave;
    }

    public ArvoreB[] getFilho() {
        return filho;
    }

    public void setFilho(ArvoreB[] filho) {
        this.filho = filho;
    }
}
