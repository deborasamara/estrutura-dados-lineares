package PilhaSimples;

public class Pilha implements InterfacePilha {
    // Array de objetos arbitrários para armazenar os elementos da pilha
    private Object S[];

    // Capacidade da pilha
    private int capacidade;

    // Índice do topo da pilha
    private int t;

    // Construtor da pilha
    public Pilha(int tam) {
        S = new Object[tam];
        this.capacidade = tam;
        this.t = -1;
    }

    // Métodos fundamentais
    //  Insere o elemento no topo da pilha. Empilhar
    public void push(Object o) {
        if(t == capacidade - 1){
            throw new PilhaCheiaExcecao("Pilha cheia!! IMpossible!");
        }
        t++;
        S[t] = o;
    }
    //  Remove o elemento do topo da pilha e retorna
    public Object pop() {
         if (isEmpty()){
            throw new PilhaVaziaExcecao("Impossível pop. Pilha vazia");
        }
        t--;
        return S[t + 1]; 
    }

    // Métodos auxiliares
    //  Retorna o tamanho ocupado na pilha
    public int size() {
        return t + 1;
    }

    // Retorna true ou falso se a pilhar estiver vazia ou não
    public boolean isEmpty() {
        return (t == -1);
    }

    //  Retorna o último elemento inserido da pilha sem remover. 
    public Object top() {
        if (isEmpty()){
            throw new PilhaVaziaExcecao("Impossível top. Pilha vazia");
        }
        return S[t];
    }
}