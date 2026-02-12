public class ArrayVetor{
    private Object[] a;
    private int capacidade = 16;
    private int size = 0;

    // construtor
    public ArrayVetor(){
        a = new Object[capacidade];
    }
    // Métodos de acesso
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public Object atRank(int r){
        return a[r];
    }
    // Métodos de modificação
    public Object replaceAtRank(int r, Object o){
        Object temp = a[r];
        a[r] = o;
        return temp;
    }
    public Object removeAtRank(int r){
        Object temp = a[r];
        for(int i = r; i < size - 1; i++){
            a[i] = a[i +1];
        }
        size--;
        return temp;
    }
    public Object replaceAtRank(int r, Object o){
        Object temp = a[r];
        a[r] = o;
        return temp;
    }
    public void insertAtRank(int r, Object o){
        if ( size == capacidade){
            capacidade = capacidade * 2;
            Object[] b = new Object[capacidade];
            for (int i = 0; i < size; i++){
                b[i] = a[i];
            }
            a = b;
        }
        // Agora sim pode inserir o elemento 
        for (int i = size - 1; i >= r; i--){
            a[i + 1] = a[i];
        }
        a[r] = o;
        size++;
    }
}