// Débora Samara dos Santos Rodrigues - 20231014040003

//Implemente os TADs Fila utilizando a estrutura de dados concreta lista simplesmente encadeada.
public class FilaSL{
    // variáveis
    private SLNo head, tail; // Variável de referência para o início (head) e o fim (tail) da fila
    private int size;

    // construtores
    public FilaSL(){
        head = null;
        tail = null;
        size = 0;
    }
    // métodos 
    // insere elemento no final da fila 
    public void enqueue(Object o){
        SLNo elemento = new SLNo(); // Instancia um novo nó
        elemento.setElement(o); // Adiciona o elemento do nó
        elemento.setNext(null); // Faz com que o seu próximo next seja nulo, já que é o final da fila né
        
        //OBS: Quando a fila está vazia, o primeiro nó que entra é, ao mesmo tempo, o início (head) e o fim da fila

        // Encadear != Apontar
        // Encadear
        // tail.setNext(elemento); Conectar nós


        // Apontar
        // head = elemento; Tem haver com apontar pra um espaço da memória

        if(size == 0){
            head = elemento; // Se o tamanho da fila for 0, o head aponta pro elemento 
        }else{
            tail.setNext(elemento); // O seu próximo (next) agora é este novo elemento que acabou de chegar
        }
        tail = elemento; // Independente da situação, o tail aponta pro último elemento colocado
        size++;
    }
    // remove e retorna o elemento do início da fila
    public Object dequeue() throws QueueEmptyException{
        Object o; // declara variável do tipo objeto chamada "o"
        if(size == 0){
            throw new QueueEmptyException("A fila tá vazia!!");
        }
        o = head.getElement(); // Guarda valor do começo da fila na variável "o"
        head = head.getNext(); // Encandeia o head para o próximo elemento
        size--; // Diminui o tamanho da fila em 1
        if(size == 0){
            tail = null; // Se fila ficar vazia, tail fica nulo
        }
        return o; // Retorne o objeto
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