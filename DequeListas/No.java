// Implemente um Deque através de uma lista duplamente encadeada e também através de uma lista simplesmente encadeada, Após fazer as implementações do Deque, faça uma comparação das duas implementações utilizando a notação do Big O para os métodos das duas implementações..

public class No{
    
    private Object element;

    private No proximo, anterior;

    // Construtor
    No(Object o, No prox, No ant){
        element = o;
        proximo = prox; 
        anterior = ant;
    }

    // retornar elemento 
    public Object getElement() {
        return element;
    }

    public void setElement(Object o) {
        elemento = o;
    }

    

}