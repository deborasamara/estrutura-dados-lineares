//Implemente os TADs Fila utilizando a estrutura de dados concreta lista simplesmente encadeada.
public class Fila{
    // variáveis
    private int i = 0, f = 0, N, incremento;
    private object O[];

    // construtores
    public Fila(int N, int incremento){
        O = new Object[N];
        this.N = N;
        this.incremento = incremento;
    }
    // métodos 
    // insere elemento no começo da fila
    public void enqueue(Object o){

    }
    // remove e retorna o elemento do início da fila
    public Object dequeue() throws QueueEmptyException{

    }

    // retorna o elemento do início sem removê-lo
    public Object first(){

    }

    // retorna o número de elementos armazenados
    public int size(){

    }

    // indica se há elementos na fila
    public boolean isEmpty(){

    }
}