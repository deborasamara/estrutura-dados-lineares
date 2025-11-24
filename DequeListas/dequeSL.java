// Implemente um Deque através de uma lista duplamente encadeada e também através de uma lista simplesmente encadeada, Após fazer as implementações do Deque, faça uma comparação das duas implementações utilizando a notação do Big O para os métodos das duas implementações..
public class DequeSL {
    private Integer size; 
    private SLNo head;

     public DequeSL(){
        size = 0;
        head = null;
    }

    // insere elemento o no começo do Deque
    public void inserirInicio(Object o){
         // o head sempre vai ser o primeiro nó
        SLNo novo_no = new SLNo(o, head);
        SLNo aux = head;
        head = novo_no;
        if(estaVazia()){
            novo_no.setNext(null);
        }
        novo_no.setNext(aux);
        size++;
    }

    // remove e retorna o elemento do começo do deque. Ocorre um erro se o deque estiver vazio. 
    public Object removerInicio(){
        if(estaVazia()){
            throw new DequeEmptyException("Deque vazio");
        }
        SLNo primeiro = head;

        if(size == 1){
            head = null;
            head.setNext(null);
        }else{
            head = head.getNext();
        }
        size--;
        return primeiro.getElement();
    }

    public void inserirFim(Object o){}

    public Object removerFim(){}

    public Object primeiro(){}

    public Object ultimo (){}

    public int tamanho(){
        return size;
    }

    public boolean estaVazia(){
        return (tamanho()==0);
    }
    
}
