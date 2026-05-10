public class ListaDLNo {
    private DLNo header, tail;
    private int size;

    // Construtor
    public ListaDLNo() {
        size = 0;
        header = new DLNo(null, null, null);
        tail = new DLNo(null, null, null);
        header.setProximo(tail);
        tail.setAnterior(header);
    }

    // Métodos genéricos
    public int size() {
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    // Métodos de acesso
    first()
    last()
    before(p)
    after(p)

    // Métodos de atualização
    replaceElement(n, o)
    swapElements(n, q)

    insertBefore(n, o),
    insertAfter(n, o),

    insertFirst(o),
    insertLast(o)
    remove(n)

    // Métodos de Fila
    public boolean isFirst( n){
        return n 

    }
    public boolean isLast(n){

    }
}