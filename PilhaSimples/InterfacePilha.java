package PilhaSimples;

public interface InterfacePilha {
    // para retornar o número de elementos na pilha
    public int size();

    // para retornar true se a pilha estiver vazia
    public boolean isEmpty();

    // para retornar o elemento do topo da pilha sem removê-lo
    public Object top() throws PilhaVaziaExcecao;

    // para adicionar um elemento ao topo da pilha
    public void push(Object o);

    // para remover e retornar o elemento do topo da pilha
    public Object pop() throws PilhaVaziaExcecao;

}
