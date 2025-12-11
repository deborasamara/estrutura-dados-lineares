public class testeDeque {
    public static void main(String[] args) {
        // criar deque
        DequeDL dq = new DequeDL ();
        System.out.println("Deque DL criado com sucesso!" + dq);

        // operações com o deque
        // Inserir elemento
        dq.inserirInicio(5);
        dq.inserirInicio(4);
        dq.inserirInicio(3);
        dq.inserirInicio(2);
        dq.inserirFim(10);

        // 2, 3, 4 , 5, 10
        System.out.println(dq.primeiro());
        System.out.println(dq.ultimo());
        System.out.println(dq.tamanho());
        System.out.println(dq.estaVazia());

        // 3, 4 , 5
        dq.removerFim();
        dq.removerInicio();

        System.out.println(dq.primeiro());
        System.out.println(dq.ultimo());
        System.out.println(dq.tamanho());
        System.out.println(dq.estaVazia());

    }
}