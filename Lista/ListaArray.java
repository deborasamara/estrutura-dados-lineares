public class ListaArray {
    private Object [] array_data;
    private int size, capacidade;

    // Construtor
    public ListaArray() {
        array_data = new Object[10];
        size = 0;
        capacidade = 10;
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
    public Object first() {
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia");
        }
        return array_data[0];
    }

    // retorna a posição do último elemento da lista. ocorre erro se a lista estiver
    // vazia
    public Object last() {
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia");
        }
        return array_data[size - 1];
    }

    // retorna a posição do elemento da lista que precede o que se encontra na
    // posição p.
    public Object before(int p) {
        if (p <= 0 || p >= size) {
            throw new RuntimeException("Posição inválida");
        }
        return array_data[p-1];
    }

    // retorna a posição do elemento da lista posterior ao que se encontra na
    // posição p.
    public Object after(int p) {
        if (p <= 0 || p >= size) {
            throw new RuntimeException("Posição inválida");
        } 
        return array_data[p+1];
    }

    // Métodos de atualização
    // substitui o elemento da posição n por o. retornando o elemento que se
    // encontrava antes da substituição.
    public Object replaceElement(int n, Object o) {
        if (n < 0 || n >= size) {
            throw new RuntimeException("Posição inválida");
        }
        Object antigoElemento = array_data[n];
        array_data[n] = o;
        return antigoElemento;
    }

    // Troca os elementos das posições n e o.
    public void swapElements(int n, int o) {
        if(n>=size || o>=size || n<0 || o<0){
            throw new RuntimeException("Posição inválida");
        }
        Object aux = array_data[n];
        Object aux2 = array_data[o];
        array_data[n] = aux2;
        array_data[o] = aux;
    }

    // dobrar capacidade do array
    public void dobrar_tamanho(){
        Object [] array_aux = new Object[capacidade * 2];
        for(int i=0; i<capacidade; i++){
            array_aux[i] = array_data[i];
        }
        array_data = array_aux;
        capacidade = capacidade * 2;
        System.out.println("Capacidade dobrada de " + (capacidade / 2) + " para: " + capacidade);
    }

    // Insere um novo objeto o ANTES da posição p da lista. Retorna a posição do
    // novo elemento. retorna posição do
    // do objeto recem inserido o.
    public Object insertBefore(Object o, int p) {
        if(p-1<0 || p>=size){
            throw new RuntimeException("Posição inválida");
        }
        array_data[p-1] = o;
        size++;
        return array_data[p-1];
    }

    // Insere um novo objeto o DEPOIS da posição p da lista. Retorna a posição do
    // novo elemento. retorna posição do
    // objeto recem inserido o.
    public Object insertAfter(Object o, int p) {
        if(p<0 || p+1>=size){
            throw new RuntimeException("Posição inválida");
        }
        array_data[p+1] = o;
        Object temp = array_data[p+1];
        size++;
        return temp;
    }

    // Insere um novo objeto o na primeira posição da lista. Retorna a posição do
    // objeto recem inserido o.
    public Object insertFirst(Object o) {
        if(size() == array_data.length){
            dobrar_tamanho();
        }
        array_data[0] = o;
        size++;
        return array_data[0];
    }

    // Insere um novo objeto o na última posição da lista. Retorna a posição do
    // objeto recem inserido o.
    public Object insertLast(Object o) {
        if(size() == array_data.length){
            dobrar_tamanho();
        }
        array_data[size+1] = o;
        size++;
        return array_data[size];
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
        return n == 0;
    }

    // verifica se um nó está na última posição da lista
    public boolean isLast(int n) {
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia");
        }
        return n == size - 1;
    }
}