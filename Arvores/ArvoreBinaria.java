package Arvores;

public class ArvoreBinaria {
    public No raiz; 
    public int tamanho;

    public ArvoreBinaria(){
        raiz = null;
        tamanho = 0;
    }

    public No root(){
        return raiz;
    }

    public No pai(No no){
        return no.getPai();
    }

    public int tamanho(){
        return tamanho;
    }

    public boolean eInterno(No no){
        return (no.getFilho_esquerdo() != null || no.getFilho_direito() != null);
    }

    public boolean eExterno(No no){
        return (no.getFilho_esquerdo() == null && no.getFilho_direito() == null);
    }

    public boolean eRaiz(No no){
        return (no.getPai() == null);
    }

    public Integer profundidade(No no){
        if(eRaiz(no)){
            return 0;
        } else {
            return 1 + profundidade(no.getPai());
        }
    }

    public Object atualizar(No no, Object elemento){
        no.setElemento(elemento);
        return no.getElemento();
    }

    public boolean taVazia(){
        return tamanho == 0;
    }

    public Integer altura(No no){
        if(eExterno(no)){
            return 0;
        }else{
            return 1 + Math.max(altura(no.getFilho_esquerdo()), altura(no.getFilho_direito()));
        }
    }

    public boolean TemFilhoEsquerdo(No no){
        return no.getFilho_esquerdo() != null;
    }

    public boolean TemFilhoDireito(No no){
        return no.getFilho_esquerdo() != null;
    }

    // travessias
    
}