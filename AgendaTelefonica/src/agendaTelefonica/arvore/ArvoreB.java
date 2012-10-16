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

    private No raiz;

    public ArvoreB() {
    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    /**
     * Busca Recursiva, metodo utiliza a string k a ser buscada, partindo da
     * raiz ponteiro
     *
     * @param k
     * @param ponteiro
     * @return
     */
    public No Busca(String k, No ponteiro) {
        //Se a raiz for null ou seja não tiver nada instanciado nela retorna null
        if (ponteiro != null) {

            for (int i = 0; i < ponteiro.getNumChaves(); i++) {
                if (k.equals(ponteiro.getChaves()[i].getDado())) {
                    return ponteiro;
                } else {
                    if (k.compareTo(ponteiro.getChaves()[i].getDado()) == -1) {
                        return Busca(k, ponteiro.getFilho()[i]);
                    } else {
                        if ((i == (ponteiro.getNumChaves() - 1))
                                && (k.compareTo(ponteiro.getChaves()[i].getDado())) == 1) {
                            return Busca(k, ponteiro.getFilho()[i + 1]);
                        }
                    }
                }
            }
        }
        return null;
    }

    public String toString(No raiz) {
        int i;
        String string = null;
        if (raiz != null) {
            for (i = 0; i < raiz.getNumChaves(); i++) {
                toString(raiz.getFilho()[i]);
                string = string + raiz.toString(raiz, i); //Talvez tenha que tirar o string +, recursividade embanana minha mente :p
                System.out.println(raiz.toString(raiz, i));
            }
            toString(raiz.getFilho()[i]);
            return string;
        } else {
            return null;
        }
        
    }
}
