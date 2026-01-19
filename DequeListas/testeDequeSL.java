public class testeDequeSL {
    public static void main(String[] args) {
        // criar deque
        DequeSL dq = new DequeSL ();
        System.out.println("Deque SL criado com sucesso!" + dq);

        // for(int i = 0; i <5; i++){
           dq.inserirInicio("numero 0");
           System.out.println("primeiro elemento " + dq.primeiro());

           dq.inserirInicio("numero 1");
           System.out.println("Segundo elemento " + dq.primeiro());

           dq.inserirInicio("numero 2");
           System.out.println("Terceiro elemento " + dq.primeiro());

           System.out.println("Tamanho do deque: " + dq.tamanho());
        // }

        for(int i = 0; i <(dq.tamanho()); i++){
          SLNo n = dq.primeiro();
          System.out.println(n.getElement());
          n = n.getNext();
        }
    }
}
