
// FAZENDO A QUESTÃO DA ENERGIA
import java.util.Scanner;
import java.util.ArrayList;

public class testePilha {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		PilhaArray pp = new PilhaArray(1);

		System.out.println("Digite a quantidade de casas");

		int qtd_casas = scanner.nextInt();

		ArrayList<Integer> casas_energias = new ArrayList<Integer>();

		for (int i = 0; i < qtd_casas; i++) {
			System.out.println("Digite a energia da casa : " + (i + 1));
			int energia = scanner.nextInt();
			casas_energias.add(energia);
			System.out.println();
		}
		while (!casas_energias.isEmpty()) { // enquanto ainda houver casas para analisar
			// ex P={3, 6, 2, 7, 5}
			// ex P={8,6,10,4,1,5,3}
			ArrayList<Integer> e_remover = new ArrayList<>();
			int anterior = casas_energias.get(0); 
			System.out.print("[");
			boolean maior = false;
			if (casas_energias.size() == 1) {
				System.out.print(casas_energias.get(0));
				casas_energias.remove(0);
			}
			for (int i = 1; i < casas_energias.size(); i++) { // LOOPING FORMAR PILHA

				if (anterior > casas_energias.get(i) && maior == false) { // se já encontrou o maior primeiro número da
																			// lista, ir dando push nos menores a ele
					// se a energia da anterior for menor, então
					maior = true;
					pp.push(casas_energias.get(i - 1)); // primeira posição
					System.out.print(pp.top() + ", ");
					pp.push(casas_energias.get(i));
					anterior = casas_energias.get(i); // posição atual (segundo número que vai ser comparado)
					e_remover.add(casas_energias.get(i - 1));
					e_remover.add(casas_energias.get(i));
					if (i == (casas_energias.size() - 1)) {
						System.out.print(pp.top() + "");
					} else {
						System.out.print(pp.top() + ", ");
					}

				} else if (anterior < casas_energias.get(i) && maior == false) {
					// se a energia da anterior não for maior, então começa uma pilha na atual
					maior = true;
					pp.push(casas_energias.get(i));
					anterior = casas_energias.get(i); // anterior vai ser o atual
					e_remover.add(casas_energias.get(i));
					if (i == (casas_energias.size() - 1)) {
						System.out.print(pp.top() + "");
					} else {
						System.out.print(pp.top() + ", ");
					}

					// já encontrou o maior e agora está comparando com o anterior pra ver se é
					// menor para adicionar
				} else if (anterior > casas_energias.get(i) && maior == true) { // 7 > 5
					pp.push(casas_energias.get(i));
					anterior = casas_energias.get(i);
					e_remover.add(casas_energias.get(i));
					if (i == (casas_energias.size() - 1)) {
						System.out.print(pp.top() + "");
					} else {
						System.out.print(pp.top() + ", ");
					}
				} else if (anterior < casas_energias.get(i) && maior == true) { // 7 < 5
					anterior = casas_energias.get(i);
				}
			}
			System.out.print("]\n");
			// remover os elementos que formaram a pilha:
			casas_energias.removeAll(e_remover);
		}
		/*
		 * Acabando de printar as pilhas, DESENVOLVA UMA VERSÃO COM ARRAY, UTILIZANDO A
		 * ESTRATÉGIA DE DUPLICAÇÃO
		 * EM CASO DE ENCHIMENTO DO ARRAY E CASO O ARRAY CHEGUE ATÉ 25% DE OCUPAÇÃO,
		 * O MESMO, DEVE SER REDUZIDO PELA METADE
		 */
		

	}
}
