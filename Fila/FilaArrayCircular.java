public class FilaArrayCircular {
    private Object[] dadosFila;
    private int i = 0, f = 0;
    private int N, incremento;
    private int size = 0;

    public FilaArrayCircular(int N, int incremento) {
        this.dadosFila = new Object[N];
        this.N = N;
        this.incremento = incremento;
    }

    public void enfileirar(Object o) {
        if (size() == N - 1) {
            throw new RuntimeException("Fila cheia");
        } else {
            dadosFila[f] = o;
            f = (f + 1) % N;
            size++;
        }
    }

    public Object desenfileirar() {
        if (size() == 0) {
            throw new RuntimeException("Fila vazia");
        } else {
            Object o = dadosFila[i];
            i = (i + 1) % N;
            size--;
            return o;
        }
    }

    public Object primeiro() {
        return dadosFila[i];
    }

    public int size() {
        return (N - i + f) % N;
    }

    public boolean isEmpty() {
        return (i == f);
    }
}
