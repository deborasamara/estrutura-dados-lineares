public class SLNo {
    private Object element;
    private SLNo next;
    // Construtores
    public SLNo(){
    }
    public SLNo(Object o, SLNo n){
        element = o;
        next = n;
    }
    // Métodos de acesso
    public Object getElement(){
        return element;
    }
    public SLNo getNext(){
        return next;
    }
    // Modificadores
    public void setElement(Object newElement){
        element = newElement;
    }
    public void setNext(SLNo newNext){
        next = newNext;
    }
}
