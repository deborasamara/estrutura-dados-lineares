// Implemente um Deque através de uma lista duplamente encadeada e também através de uma lista simplesmente encadeada, Após fazer as implementações do Deque, faça uma comparação das duas implementações utilizando a notação do Big O para os métodos das duas implementações..

public class DequeDL {
    private DLNo header, trailer;

    private Integer size; 

    public DequeDL(){
        header = new DLNo();
        trailer = new DLNo();
        size = 0;
        header.setProximo(trailer);
        trailer.setAnterior(header);
    }

    // insere elemento o no começo do Deque
    public void inserirInicio(Object o){

    }

    // remove e retorna o elemento do começo do deque. Ocorre um erro se o deque estiver vazio. 
    public Object removerInicio(){

    }

    // insere um novo elemento o no final do deque
    public void inserirFim(Object o){

    }


    // remove e retorna o último elemento do deque. Ocorre um erro se o deque estiver vazio.
    public Object removerFim(){
        if(estaVazia()){
            throw new DequeEmptyException("Deque vazio!!");
        }
        DLNo ultimo = trailer.getAnterior();
        Object o = ultimo.getElement();
        

    }

    // retorna o primeiro elemento do deque. Ocorre um erro se o deque estiver vazio.
    public Object primeiro(){

    }

    // retorna o ultimo elemento do deque. Ocorre um erro se o deque estiver vazio.
    public Object ultimo (){

    }

    // retorna o numero de elementos do deque    
    public int tamanho(){
        return 1;
    }
     
    // determina se o deque está vazio 
    public boolean estaVazia(){
        return true;
    }
}
