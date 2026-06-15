package ArvoreGenerica;
import java.util.Iterator;
// Implementar os métodos de árvore genérica

public class ArvoreGenerica {
    No raiz; 
    int tamanho; 

    // construtor
    public ArvoreGenerica(Object o){
        raiz = new No(null, o);
        tamanho = 1;
    }
	public No root(){
        return raiz; 
	}

    public No parent(No v){

    }

    public Iterator children(No v){

    }

    public boolean isInternal(No v){

    }

    public boolean isExternal(No v){

    }

    public boolean isRoot(No v){

    }

    public int size(){

    }

    public Iterator elements(){

    }

    public Iterator positions(){

    }

    public void swapElements(No v, No w){

    }
    
}
