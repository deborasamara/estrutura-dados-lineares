package ArvoreBinariaPesquisa;

public class No {
    // variáveis
    private Object elemento;
    private No pai;
    private No filho_esquerdo;
    private No filho_direito;

    // construtor
    public No(Object elemento, No pai, No filho_esquerdo, No filho_direito) {
        this.elemento = elemento;
        this.pai = pai;
        // Referência apenas ao filho esquerdo e direito porque é uma árvore binária de pesquisa
        this.filho_esquerdo = filho_esquerdo;
        this.filho_direito = filho_direito;
    }

    // getters e setters
    public Object getElemento() {
        return elemento;
    }

    public No getPai() {
        return pai;
    }

    public No getEsquerdo() {
        return filho_esquerdo;
    }

    public No getDireito() {
        return filho_direito;
    }

    public void setElemento(Object o) {
        elemento = o;
    }

    public void setPai(No p) {
        pai = p;
    }

    public void setEsquerdo(No e) {
        filho_esquerdo = e;
    }

    public void setDireito(No d) {
        filho_direito = d;
    }
}
