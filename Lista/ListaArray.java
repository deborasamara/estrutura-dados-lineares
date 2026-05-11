public class ListaArray {
    private Object [] array_data;
    private int size;

    // Construtor
    public ListaArray() {
        array_data = new Object[10];
        size = 0;
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
    }

    // retorna a posição do último elemento da lista. ocorre erro se a lista estiver
    // vazia
    public DLNo last() {
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia");
        }
        return 
    }

    // retorna a posição do elemento da lista que precede o que se encontra na
    // posição p.
    public DLNo before(int p) {
    }

    // retorna a posição do elemento da lista posterior ao que se encontra na
    // posição p.
    public DLNo after(int p) {
    }

    // Métodos de atualização
    // substitui o elemento da posição n por o. retornando o elemento que se
    // encontrava antes da substituição.
    public Object replaceElement(int n, Object o) {
    }

    // Troca os elementos das posições n e o.
    public void swapElements(int n, int o) {
    }

    // Insere um novo objeto o ANTES da posição p da lista. Retorna a posição do
    // novo elemento. retorna posição do
    // do objeto recem inserido o.
    public DLNo insertBefore(Object o, DLNo p) {
    }

    // Insere um novo objeto o DEPOIS da posição p da lista. Retorna a posição do
    // novo elemento. retorna posição do
    // objeto recem inserido o.
    public DLNo insertAfter(Object o, DLNo p) {
    }

    // Insere um novo objeto o na primeira posição da lista. Retorna a posição do
    // objeto recem inserido o.
    public DLNo insertFirst(Object o) {
    }

    // Insere um novo objeto o na última posição da lista. Retorna a posição do
    // objeto recem inserido o.
    public DLNo insertLast(Object o) {
        return 
    }
    // Remove o elemento da posição p da lista. Retorna o elemento que se encontrava na posição p
    public Object remove(int p) {
    }

    // Métodos de Fila
    // verifica se um nó está na primeira posição da lista
    public boolean isFirst(int n) {
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia");
        }
        return 
    }

    // verifica se um nó está na última posição da lista
    public boolean isLast(int n) {
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia");
        }
        return 
    }
}