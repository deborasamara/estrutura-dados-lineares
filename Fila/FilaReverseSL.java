// Débora Samara dos Santos Rodrigues - 20231014040003

// Fila com Reversão em O(1)

// Implemente uma fila que suporta reversão instantânea em tempo O(1), sem percorrer ou modificar os elementos.

// Uma fila tradicional permite enqueue (inserir no fim) e dequeue (remover do início) em O(1).
// Sua tarefa: adicionar a operação reverse() que inverte a fila em O(1).
// Após reverse():
// O próximo dequeue() deve retornar o elemento que estava no fim
// O próximo enqueue() deve inserir no novo fim (que antes era o início)
// Obs 1: Sua implementação deve usar array circular e dar suporte ao processo de duplicação quando cheio e redução do tamanho da array quando chegar em 1/3. 
// Obs 2: Após ocorrer a reversão todos os métodos devem continuar a funcionar normalmente.

public class FilaReverseSL {
    boolean isReversed;
    int capacidade, size;
    int i, f; // i = índice para a posição de Q que guarda o primeiro elemento da fila, r =
              // índice para a próxima posição de Q onde o próximo elemento será inserido
    // Se f = r. A fila está vazia
    Object[] Q;

    // Construtor
    public FilaReverseSL(int capacidade) {
        Q = new Object[capacidade];
        this.i = 0;
        this.f = 0;
        isReversed = false;
        this.capacidade = capacidade;
        this.size = 0;
    }

    public void reverse() {
        isReversed = !isReversed;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (i == f);
    }

    public Object first() throws QueueEmptyException {
        if (isEmpty()) {
            throw new RuntimeException("A fila tá vazia!!");
        }
        return isReversed ? Q[i] : Q[(f - 1 + capacidade) % capacidade];

    }

    public void enqueue(Object o) {
        if (size() == capacidade - 1) {
            throw new RuntimeException("A fila tá cheia!!");
        }
        if (isReversed == false) {
            Q[f] = o;
            f = (f + 1) % capacidade;
        } else {
            i = (i - 1 + capacidade) % capacidade;
            Q[i] = o;
        }
        size++;
        verificaCheio();
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("A fila tá vazia!!");
        }
        Object o;
        if (isReversed == false) {
            o = Q[i];
            Q[i] = null;
            i = (i + 1) % capacidade;
        } else {
            f = (f - 1 + capacidade) % capacidade;
            o = Q[f];
            Q[f] = null;
        }
        size--;
        verificaUmTerco();
        return o;
    }

    public void aumentarFila() {
        Object[] novaFila = new Object[capacidade * 2];
        // IMplementar lógica
    }

    public void reduzirFila() {
        Object[] novaFila = new Object[capacidade / 2];
        // Implementar lógica
    }

    public void verificaCheio() {
        if (size() == capacidade - 1) {
            aumentarFila();
        }
    }

    public void verificaUmTerco() {
        if (size() == capacidade / 3) {
            reduzirFila();
        }
    }
}
