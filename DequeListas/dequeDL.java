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
        // verificar se tem elementos
        if(estaVazia()){
            DLNo primeiro = new DLNo(o, trailer, header);
            header.setProximo(primeiro);
            trailer.setAnterior(primeiro);
        }else{
            DLNo segundo_elemento = header.getProximo();
            DLNo primeiro = new DLNo(o, segundo_elemento, header);
            segundo_elemento.setAnterior(primeiro);
            header.setProximo(primeiro);
        }
        size++;
    }

    // remove e retorna o elemento do começo do deque. Ocorre um erro se o deque estiver vazio. 
    public Object removerInicio(){
        if(estaVazia()){
            throw new DequeEmptyException("Deque vazio");
        }
        // Cria um novo no que recebe o valor do primeiro elemento
        DLNo primeiro = header.getProximo();
        DLNo depois_primeiro = primeiro.getProximo();
        header.setProximo(depois_primeiro);
        depois_primeiro.setAnterior(header);
        size--;
        primeiro.setProximo(null);
        primeiro.setAnterior(null);
        return primeiro.getElement();
    }

    // insere um novo elemento o no final do deque
    public void inserirFim(Object o){
        if(estaVazia()){
            DLNo primeiro = new DLNo(o, trailer, header);
            header.setProximo(primeiro);
            trailer.setAnterior(primeiro);
        }else{
            DLNo penultimo_elemento = trailer.getAnterior();
            DLNo ultimo = new DLNo(o, trailer, penultimo_elemento);
            penultimo_elemento.setProximo(ultimo);
            trailer.setAnterior(ultimo);
        }
        size++;
    }

    // remove e retorna o último elemento do deque. Ocorre um erro se o deque estiver vazio.
    public Object removerFim(){
        if(estaVazia()){
            throw new DequeEmptyException("Deque vazio!!");
        }
        // Cria um novo no que recebe o valor do último elemento
        DLNo ultimo = trailer.getAnterior();
        DLNo anterior_ultimo = ultimo.getAnterior();
        trailer.setAnterior(anterior_ultimo);
        anterior_ultimo.setProximo(trailer);
        size--;
        ultimo.setProximo(null);
        ultimo.setAnterior(null);
        return ultimo.getElement();
    }

    // retorna o primeiro elemento do deque. Ocorre um erro se o deque estiver vazio.
    public Object primeiro(){
        if(estaVazia()){
            throw new DequeEmptyException("Deque vazio!!");
        }
        return header.getProximo().getElement();
    }

    // retorna o ultimo elemento do deque. Ocorre um erro se o deque estiver vazio.
    public Object ultimo (){
        if(estaVazia()){
            throw new DequeEmptyException("Deque vazio!!");
        }
        return trailer.getAnterior().getElement();
    }

    // retorna o numero de elementos do deque    
    public int tamanho(){
        return size;
    }
     
    // determina se o deque está vazio 
    public boolean estaVazia(){
        return (tamanho()==0);
    }
}
