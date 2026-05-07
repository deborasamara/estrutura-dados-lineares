public class VetorDL{
    DLNo header, tail;
    int size = 0;

    // construtor 
    public VetorDL(){
        header = new DLNo();
        tail = new DLNo(); 
        header.setProximo(tail);
        tail.setAnterior(header);
        size = 0;
    }
    // Métodos de acesso  
     public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public Object atRank(int r){
        DLNo atual = header;
        if(r<0 || r>size-1){
            throw new RuntimeException("Rank inválido");
        }
        for(int i = 0; i<=r; i++){
            atual = atual.getProximo();
        }
        return atual.getElement();
    }
    // Métodos de modificação 
    public Object replaceAtRank(int r, Object o){
        if(r<0 || r>size-1){
            throw new RuntimeException("Rank inválido");
        }
        DLNo atual = header;
        for(int i = 0; i<=r; i++){
            atual = atual.getProximo();
        }
        Object temp = atual.getElement();
        atual.setElement(o);
        return temp;
    } 
    public Object removeAtRank(int r){
        if(r<0 || r>size-1){
            throw new RuntimeException("Rank inválido");
        }
        DLNo atual = header;
         for(int i = 0; i<=r; i++){
            atual = atual.getProximo();
        }
        Object temp = atual.getElement();
        atual.setElement(null);
        atual.getAnterior().setProximo(atual.getProximo());
        atual.getProximo().setAnterior(atual.getAnterior());
        size--;
        return temp;
    }
    public void insertAtRank(int r, Object o){
        if(r<0 || r>size){
            throw new RuntimeException("Rank inválido");
        }
        DLNo atual = header; 
        for(int i = 0; i<=r; i++){
            atual = atual.getProximo();
        }
        DLNo novo = new DLNo();
        novo.setElement(o);
        atual.getAnterior().setProximo(novo);
        novo.setAnterior(atual.getAnterior());
        novo.setProximo(atual);
        atual.setAnterior(novo);
        size++;
    }
}