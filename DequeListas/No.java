// Implemente um Deque através de uma lista duplamente encadeada e também através de uma lista simplesmente encadeada, Após fazer as implementações do Deque, faça uma comparação das duas implementações utilizando a notação do Big O para os métodos das duas implementações..
public class ListaDuplamenteEncadeada {
    private static class No{
    
    private Object element;

    private No proximo, anterior;

    // Construtor
    public No(Object o, No prox, No ant){
        element = o;
        proximo = prox; 
        anterior = ant;
    }

    // Getters e Setters 
    public No getProximo() {
        return proximo;
    }
    public void setProximo(No n) {
        proximo = n;
    }
    public No getAnterior() {
        return anterior;
    } 

    public void setAnterior(No n) {
        anterior = n;
    }
    // Hearder e Trailer
    private No header, trailer;

    private int size = 0;
    
    }
}
