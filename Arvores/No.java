package Arvores;

public class No {
    public No filho_esquerdo;
    public No filho_direito;
    public No pai;
    public Object elemento;

    // construtor
    public No(Object elemento){
        this.elemento=elemento;
        this.filho_esquerdo=null;
        this.filho_direito=null;
        this.pai=null;
    }

    // getters e setters
    public Object getElemento() {
        return elemento;
    } 

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    public No getFilho_esquerdo() {
        return filho_esquerdo;
    }

    public void setFilho_esquerdo(No filho_esquerdo) {
        this.filho_esquerdo = filho_esquerdo;
    }

    public No getFilho_direito() {
        return filho_direito;
    }

    public void setFilho_direito(No filho_direito) {
        this.filho_direito = filho_direito;
    }
    public No getPai() {
        return pai;
    }
    public void setPai(No pai) {
        this.pai = pai;
    }
}
