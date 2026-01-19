public class testeDequeD {
    public static void main(String[] args) {
        // Criar deque com lista simplesmente ligada
        DequeSL dq = new DequeSL();
        System.out.println("Deque SL criado com sucesso!" + dq);

        // Inserir elemento no inicio
        dq.inserirInicio(10);
        dq.inserirInicio(15);
        dq.inserirInicio(20);

        // Tamanho
        System.out.println("Tamanho do Deque: "+dq.tamanho());
        
        // remover elemento do inicio
        System.out.println("O elemento retirado do inicio e: "+ dq.removerInicio());
        // Tamanho 
        System.out.println("Tamanho do Deque: "+dq.tamanho());

        // remover do final
        System.out.println("O elemento retirado do final e"+ dq.removerFim());

        // Tamanho
        System.out.println("Tamanho do Deque: "+dq.tamanho());
    }
}
