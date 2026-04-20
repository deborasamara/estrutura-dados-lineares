// Débora Samara dos Santos Rodrigues - 20231014040003

//Implemente os TADs Fila utilizando a estrutura de dados concreta lista simplesmente encadeada.
public class FilaSL{
    // variáveis
    private SLNo head, tail;
    private int size;

    // construtores
    public FilaSL(){
        head = null;
        tail = null;
        size = 0;
    }
    // métodos 
    // insere elemento no começo da fila (que é o final)
    public void enqueue(Object o){
        SLNo elemento = new SLNo();
        elemento.setElement(o);
        elemento.setNext(null);
        
        if(size == 0){
            head = elemento;
        }else{
            tail.setNext(elemento);
        }
        tail = elemento;
        size++;
    }
    // remove e retorna o elemento do início da fila
    public Object dequeue() throws QueueEmptyException{
        Object o;
        if(size == 0){
            throw new QueueEmptyException("A fila tá vazia!!");
        }
        o = head.getElement();
        head = head.getNext();
        size--;
        if(size == 0){
            tail = null;
        }
        return o;
    }

    // retorna o elemento do início sem removê-lo
    public Object first() throws QueueEmptyException{
        if(size == 0){
            throw new QueueEmptyException("A fila tá vazia!!");
        }
        return head.getElement();
    }

    // retorna o número de elementos armazenados
    public int size(){
        return size;
    }

    // indica se está vazia ou não
    public boolean isEmpty(){
        return (size() == 0);
    }
}