// Implemente um Deque através de uma lista duplamente encadeada e também através de uma lista simplesmente encadeada, Após fazer as implementações do Deque, faça uma comparação das duas implementações utilizando a notação do Big O para os métodos das duas implementações..
public class DequeSL {
    private Integer size; 
    private SLNo head;
    private SLNo tail;

     public DequeSL(){
        head = null;
        tail = null;
        size = 0;
    }

    // insere elemento o no começo do Deque
    public void inserirInicio(String o){
        // o head sempre vai ser o primeiro nó
        if(head == null){// primeira inserção
            SLNo novo_no = new SLNo(o, null);
            head = novo_no; 
            tail = novo_no;
        }else{
            SLNo novo_no_adicional = new SLNo(o, head);
            // ver a necessidade de atualizar o next do novo nó 
            head = novo_no_adicional;
        }
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

     // insere elemento o no fim do Deque
    public void inserirFim(String o){
        // o tail sempre vai ser o último nó
        if(tail == null){// primeira inserção
            SLNo novo_no = new SLNo(o, null);
            head = novo_no;
            tail = novo_no;
        }else{
            SLNo novo_no_adicional = new SLNo(o, tail);
            tail = novo_no_adicional;
        }
        size++;
    }

    public Object removerFim(){
        if(estaVazia()){
            throw new DequeEmptyException("Deque vazio");
        }
        SLNo ultimo = tail;

        if(size == 1){
            tail = null;
            tail.setNext(null);
        }
        else{
            tail = tail.getNext();
        }
        size--;
        return ultimo.getElement();
    }

    public Object primeiro(){
        if(estaVazia()){
            throw new DequeEmptyException("Deque vazio");
        }
        return head;
    }

    public Object ultimo (){
        if(estaVazia()){
            throw new DequeEmptyException("Deque vazio");
        }
        return tail;
    }


    public int tamanho(){
        return size;
    }

    public boolean estaVazia(){
        return (tamanho()==0);
    }
}
