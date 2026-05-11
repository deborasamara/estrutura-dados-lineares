
public class DLNo {

    private Object element;

    private DLNo proximo, anterior;

    public DLNo() {
    }

    // Construtor
    public DLNo(Object o, DLNo prox, DLNo ant) {
        element = o;
        proximo = prox;
        anterior = ant;
    }

    // Método de posição
    public Object element() {
        if ((anterior == null) && (proximo == null)) {
            throw new RuntimeException("Posição inválida");
        }
        return element;
    }

    // Getters e Setters
    public DLNo getProximo() {
        return proximo;
    }

    public void setProximo(DLNo n) {
        proximo = n;
    }

    public DLNo getAnterior() {
        return anterior;
    }

    public void setAnterior(DLNo n) {
        anterior = n;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object novoElemento) {
        element = novoElemento;
    }
}