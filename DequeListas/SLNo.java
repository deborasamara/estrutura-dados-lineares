public class SLNo {
    private String element;
    private SLNo next;
    // Construtores
    public SLNo(){
    }
    public SLNo(String o, SLNo n){
        element = o;
        next = n;
    }
    // Métodos de acesso
    public String getElement(){
        return element;
    }
    public SLNo getNext(){
        return next;
    }
    // Modificadores
    public void setElement(String newElement){
        element = newElement;
    }
    public void setNext(SLNo newNext){
        next = newNext;
    }
}
