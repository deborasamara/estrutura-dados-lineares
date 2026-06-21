package ArvoreGenerica;

import java.util.ArrayList;
import java.util.Iterator;
// Implementar os métodos de árvore genérica
import java.util.List;

public class ArvoreGenerica {
    No raiz;
    int tamanho;

    // construtor
    public ArvoreGenerica(Object o) {
        raiz = new No(null, o);
        tamanho = 1;
    }

    public No root() {
        return raiz;
    }

    public No parent(No v) {
        return v.parent();
    }

    public Iterator<No> children(No v) {
        return v.children();
    }

    public boolean isInternal(No v) {
        return (v.childrenNumber() > 0);
    }

    public boolean isExternal(No v) {
        return (v.childrenNumber() == 0);
    }

    public boolean isRoot(No v) {
        return (v == raiz);
    }

    // método para adicionar um filho a um nó v
    public void addChild(No v, Object o) {
        No novoNo = new No(v, o);
        v.addChild(novoNo);
        tamanho++;
    }

    // método para remover um nó v da árvore que não seja raiz e ao mesmo tempo seja
    // um nó externo
    public Object remove(No v) throws RuntimeException {
        No pai = v.parent();
        if (pai != null && isExternal(v)) {
            pai.removeChild(v);
            tamanho--;
        } else {
            throw new RuntimeException("Não é possível remover o nó");
        }
        Object o = v.element();
        return o;

    }

    // Calcula e retorna a profundidade de um no v.
    public int depth(No v) {
        if (v == raiz) {
            return 0;
        } else {
            return 1 + depth(v.parent());
        }

    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return false;
    }

    // Retorna altura do no v
    public int height(No v) {
        // folha
        if (isExternal(v)) {
            return 0;
        } else {
            // tem filhos. Caso recursivo.
            int maiorAltura = 0;
            Iterator<No> i = children(v);
            while (i.hasNext()) {
                No filho = i.next();
                int alturaAvulsa = height(filho);
                maiorAltura = Math.max(maiorAltura, alturaAvulsa);
            }

            return 1 + maiorAltura;
        }

    }

    // retorna um iterador de posições
    // public Iterator<Object> positions() {

    // }

    // algoritimo de travessia
    // (...) ...
    // public void preOrdem(){

    // }

    // retorna um iterador de elementos/informações armazenadas
    public Iterator<Object> elements() {
        List<Object> elementos = new ArrayList<>();

        Iterator<No> i = positions();

        while (i.hasNext()) {
            No no = i.next();
            elementos.add(no.element());
        }

        return elementos.iterator();

    }

    public void swapElements(No v, No w) {
        Object aux_temp = v.element();
        Object aux_temp2 = w.element();
        v.setElement(aux_temp2);
        w.setElement(aux_temp);
    }

    // Altera o objeto armazenado em um Nó
    public Object replace(No v, Object o) {
        Object aux = v.element();
        v.setElement(o);
        return aux;
    }

}
