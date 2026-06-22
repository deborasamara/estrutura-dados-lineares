package ArvoreBinariaPesquisa;

public class ArvoreBinariaPesquisa {
    No raiz;
    int tamanho;

    public ArvoreBinariaPesquisa(Object o){
        raiz = new No(o, null, null, null);
        this.tamanho = 1;
    }

    // Genéricos
    public int size(){
        return tamanho;
    }
    
    public int height(No v){
        if(isExternal(v)){
            return 0;
        }else{
            int alturaEsquerda = height(v.getEsquerdo());
            int alturaDireita = height(v.getDireito());
            return 1 + Math.max(alturaEsquerda, alturaDireita);
        }
    }
    public boolean isEmpty(){
        return (tamanho == 0);
    }

    // Acesso
    public No root(){
        return raiz;
    }
    
    public No parent(No v){
        return v.getPai();
    }

    public No filhoDaDireita(No v){
        return v.getDireito();
    }
    
    public No filhoDaEsquerda(No v){
        return v.getEsquerdo();
    }

    public boolean isInternal(No v){
        return (v.getEsquerdo() != null || v.getDireito() != null);
    }

    public boolean isExternal(No v){
        return (v.getEsquerdo() == null && v.getDireito() == null);
    }

    public boolean isRoot(No v){
        return (v == raiz);
    }
    public int depth(No v){
        if(v == raiz){
            return 0;
        }else{
            return 1 + depth(v.getPai());
        }
    }

    public Object replaceElement(No v, Object o){
        Object aux = v.getElemento();
        v.setElemento(o);
        return aux;
    }

    // Buscar
    public Object search(int k, No v){
        if (isExternal(v)){
            return v;
        }
        if(k < (int) v.getElemento()){
            return search(k, v.getEsquerdo());

        }else if( k == (int) v.getElemento()){
            return v;

        }else{ // k > key(v)
            return search(k, v.getDireito());
        }
    }

    // Inserir
    // lembrar de 
    public void insert(int k, Object o){
        Object local_do_objeto = search(k, raiz);


    }


    // Remover



    // Mostrar árvore


    
}
