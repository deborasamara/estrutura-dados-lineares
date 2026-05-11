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

    public boolean isEmpty() {
        return size == 0;
    }

    // Métodos de acesso
    // retorna a posição do primeiro elemento da lista. ocorre erro se a lista
    // estiver vazia
    public DLNo first() {
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia");
        }
        return header.getProximo();
    }

    // retorna a posição do último elemento da lista. ocorre erro se a lista estiver
    // vazia
    public DLNo last() {
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia");
        }
        return tail.getAnterior();
    }

    // retorna a posição do elemento da lista que precede o que se encontra na
    // posição p.
    public DLNo before(DLNo p) {
        return p.getAnterior();
    }

    // retorna a posição do elemento da lista posterior ao que se encontra na
    // posição p.
    public DLNo after(DLNo p) {
        return p.getProximo();
    }

    // Métodos de atualização
    // substitui o elemento da posição n por o. retornando o elemento que se
    // encontrava antes da substituição.
    public Object replaceElement(DLNo n, Object o) {
        Object antigoElemento = n.getElement();
        n.setElement(o);
        return antigoElemento;
    }

    // Troca os elementos das posições n e o.
    public void swapElements(DLNo n, DLNo o) {
        Object aux = n.getElement();
        Object aux2 = o.getElement();
        n.setElement(aux2);
        o.setElement(aux);
    }

    // Insere um novo objeto o ANTES da posição p da lista. Retorna a posição do
    // novo elemento. retorna posição do
    // do objeto recem inserido o.
    public DLNo insertBefore(Object o, DLNo p) {
        DLNo novoNo = new DLNo(null, null, null);
        novoNo.setElement(o);
        novoNo.setProximo(p);
        novoNo.setAnterior(p.getAnterior());
        p.getAnterior().setProximo(novoNo);
        p.setAnterior(novoNo);
        size++;
        return novoNo;
    }

    // Insere um novo objeto o DEPOIS da posição p da lista. Retorna a posição do
    // novo elemento. retorna posição do
    // objeto recem inserido o.
    public DLNo insertAfter(Object o, DLNo p) {
        DLNo novoNo = new DLNo(null, null, null);
        novoNo.setElement(o);
        novoNo.setAnterior(p);
        novoNo.setProximo(p.getProximo());
        p.getProximo().setAnterior(novoNo);
        p.setProximo(novoNo);
        size++;
        return novoNo;
    }

    // Insere um novo objeto o na primeira posição da lista. Retorna a posição do
    // objeto recem inserido o.
    public DLNo insertFirst(Object o) {
        DLNo novoNo = new DLNo(null, null, null);
        novoNo.setElement(o);
        novoNo.setProximo(header.getProximo());
        novoNo.setAnterior(header);
        header.getProximo().setAnterior(novoNo);
        header.setProximo(novoNo);
        size++;
        return novoNo;
    }

    // Insere um novo objeto o na última posição da lista. Retorna a posição do
    // objeto recem inserido o.
    public DLNo insertLast(Object o) {
        DLNo novoNo = new DLNo(null, null, null);
        novoNo.setElement(o);
        novoNo.setAnterior(tail.getAnterior());
        novoNo.setProximo(tail);
        tail.getAnterior().setProximo(novoNo);
        tail.setAnterior(novoNo);
        size++;
        return novoNo;
    }
    // Remove o elemento da posição p da lista. Retorna o elemento que se encontrava na posição p
    public Object remove(DLNo p) {
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia");
        }
        p.getAnterior().setProximo(p.getProximo());
        p.getProximo().setAnterior(p.getAnterior());
        size--;
        return p.getElement();
    }

    // Métodos de Fila
    // verifica se um nó está na primeira posição da lista
    public boolean isFirst(DLNo n) {
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia");
        }
        return header.getProximo() == n;
    }

    // verifica se um nó está na última posição da lista
    public boolean isLast(DLNo n) {
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia");
        }
        return tail.getAnterior() == n;
    }
}