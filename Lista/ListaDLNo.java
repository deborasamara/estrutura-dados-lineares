public class ListaDLNo {
    private DLNo header, tail;
    private int size;
    // Construtor
    public ListaDLNo(){
        size = 0;
        header = new DLNo(null, null, null);
        tail = new DLNo(null, null, null);
        header.setProximo(tail);
        tail.setAnterior(header);
    }

    // Métodos de acesso  

    // Métodos de modificação

    // 
}