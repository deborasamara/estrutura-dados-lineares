// O método main é o ponto de partida para a execução de qualquer programa Java

public class TesteFilaSL {
    public static void main(String[] args) {
        // Instanciar uma fila
        FilaSL fila = new FilaSL();

        // Teste do estado inicial
        System.out.println("A fila tá vazia mesmo? "+ fila.isEmpty());
        System.out.println("Qual o tamanho dessa fila? "+ fila.size());

        // Adicionar elementos à fila
        for(int i = 0; i<5; i++){
            fila.enqueue(i);
        }

        // Visualizar fila
        System.out.println("Primeiro elemento da fila "+ fila.first());
        System.out.println("Qual o tamanho dessa fila? "+ fila.size());

        // Remover elementos da fila
        for(int i = 0; i<2; i++){
            System.out.println("Removendo elemento "+ fila.dequeue());
        }

        // Visualizar fila
        System.out.println("Primeiro elemento da fila "+ fila.first());
        System.out.println("Qual o tamanho dessa fila? "+ fila.size());
        
    }
}