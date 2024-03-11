public class PilhaArray implements Pilha{
    // Armazena elementos da pilha
    private Object S[];

    // capacidade
    private int capacity;

    // indice do topo
    private int t = -1;

    // construtor
    public PilhaArray(int tam){
        S = new Object[tam];
        capacity = tam;
    }

    // size - tamanho preenchido
    public int size(){
        return t+1;
    }

    // está vazio?
    public boolean isEmpty(){
        if(t==-1){
            return true;
        }else{
            return false;
        }
    }
    // top
    public Object top(){
        boolean vazio; 
        vazio = isEmpty();
        if(vazio == true){
            throw new PilhaVaziaExcecao("Impossível top. Pilha vazia");
        }else{
            // executar o top
            return S[t]; // retorna o elemento do topo da pilha sem remover
        }

    }
    // push - empilhar
    public void push(Object o){
        // verificar tamanho da pilha
        if(t == S.length -1){
            // pilha cheia
            PilhaEncheu();
        }
        // executar push
        t+=1;
        S[t] = o;
        
    }

    // pop - desempilhar
    public Object pop(){
        boolean vazio;
        vazio = isEmpty();
        if(vazio == true){
            throw new PilhaVaziaExcecao("Impossível dar pop. Pilha vazia");
        }else{
            // executar o pop
            t -=1;
            return S[t+1]; // retorna o elemento que foi retirado
        }
        
    }

    public void PilhaEncheu(){
        int NewCapacity = capacity*2; // nova capacidade tem o dobro da capacidade anterior
        // object[] é uma matriz de objetos em java
        Object[] NewPilha = new Object[NewCapacity]; // instanciando um novo objeto de tamanho do dobro
        for(int i=0; i<capacity; i++){ // cópia dos itens da pilha anterior para a nova pilha
            NewPilha[i] = S[i]; 
        }
        // Trocar a pilha anterior pela nova
        S = NewPilha;

        // Trocar a capacidade anterior pela nova
        capacity = NewCapacity;
    }
    
}