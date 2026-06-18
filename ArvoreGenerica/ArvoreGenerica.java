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
        return v.parent();
    }

    public Iterator<No> children(No v){
        return v.children();
    }

    public boolean isInternal(No v){
        return (v.childrenNumber() > 0);
    }

    public boolean isExternal(No v){
        return (v.childrenNumber() == 0);
    }

    public boolean isRoot(No v){
        return (v == raiz);
    }

    // método para adicionar um filho a um nó v
    public void addChild(No v, Object o){
        No novoNo = new No(v, o);
        v.addChild(novoNo);
        tamanho++;
    }

    //  método para remover um nó v da árvore que não seja raiz e ao mesmo tempo seja um nó externo
    public Object remove(No v) throws RuntimeException{
        No pai = v.parent();
        if(pai != null  && isExternal(v)){
            pai.removeChild(v);
            tamanho--;
        }else{
            throw new RuntimeException("Não é possível remover o nó");
        }
        Object o = v.element();
        tamanho--;
        return o;

    }

    // Calcula e retorna a profundidade de um no v. 
    public int depth(No v){
        if (v == raiz){
            return 0;
        }
		else{
            return 1 + depth(v.parent());
        }

    }

    public int size(){
        return tamanho;
    }

    public int height(){

    }

    public Iterator elements(){

    }

    public Iterator positions(){

    }

    public void swapElements(No v, No w){

    }
    
}
