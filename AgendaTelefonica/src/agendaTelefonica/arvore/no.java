/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agendaTelefonica.arvore;

/**
 *
 * @author samuel
 */
public class no {

    private int t = 2;
    private int numChaves; //Variavel que armazena o numero total de chaves
    private char chaves[];
    private no filho[];
    private boolean isLeaf;

    public no() {
        this.numChaves = 0;
        this.isLeaf = true;
        this.chaves = new char[2 * t - 1];
        this.filho = new no[2 * t];
    }

    public int busca_binaria(no no, int info) {
        int meio, i, f;

        i = 0;
        f = no.numChaves - 1;

        while (i <= f) {
            meio = (i + f) / 2;
            if (no.chaves[meio] == info) {
                return (meio); //Encontrou. Retorna a posíção em que a chave está.
            } else if (no.chaves[meio] > info) {
                f = meio - 1;
            } else {
                i = meio + 1;
            }
        }
        return (i); //Não encontrou. Retorna a posição do ponteiro para o filho.
    }

    public boolean busca(no raiz, int info) {
        no no;
        int pos; //posição retornada pelo busca binária.

        no = raiz;
        while (no != null) {
            pos = busca_binaria(no, info);
            if (pos < no.numChaves && no.chaves[pos] == info) {
                return (true);
            } else {
                no = no.filho[pos];
            }
        }
        return (false);
    }
}