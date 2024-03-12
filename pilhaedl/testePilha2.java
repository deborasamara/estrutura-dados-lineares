// FAZENDO A QUESTÃO DA ENERGIA
import java.util.Scanner;

public class testePilha {

	public static void main(String[] args) {	

		Scanner scanner = new Scanner(System.in); 

		PilhaArray pp = new PilhaArray(1); 

		System.out.println("Digite a quantidade de casas");

		int qtd_casas = scanner.nextInt();

		int[] casas_energias = new int[qtd_casas];

		for(int i = 0; i<qtd_casas; i++){
			System.out.println("Digite a energia da casa : "+(i+1));
			int energia = scanner.nextInt();
			casas_energias[i] = energia;
			System.out.println();
		}
		//while (casas_energias.length>0) { // enquanto

			System.out.print("[");
			boolean maior = false;
			for(int i = 1; i<casas_energias.length; i++){
	
				if(casas_energias[i-1]>casas_energias[i] && maior == false){ // se já encontrou o maior primeiro número da lista, ir dando push nos menores a ele
					// se a energia da anterior for menor, então 
					maior = true;
					pp.push(casas_energias[i]);
					System.out.print(pp.top()+", ");

				}else{
					// se a energia da anterior não for maior, então começa uma pilha na atual
	
				}
				
			//}
			

			System.out.print("]");
		}

		// ver capacidade usada 

	}
}

/*
 * // criar condição de parada ex -1
		int res = 1;
		int i = 1;

		// variável temporária que guarda o valor anterior
		int var_temporaria = null; 
 */
/*while(res != -1){ // ficar dando push e verificando 
			bool maior = false;
			System.out.println("Digite a energia da casa "+i);
			i++;
			Scanner scanner = new Scanner(System.in); 
			int energia = scanner.nextInt();
			res = energia;
			pp.push(energia);
			//bool permissao_apagar = false;
			// comparar top de agora com var_temporaria
			if(var_temporaria != null){ // não é o primeiro numero 
				// comparar com o anterior
				if(pp.top()>var_temporaria){ // se for maior que o anterior, apaga e cria linha de força
					//permissao_apagar = true;
					System.out.println(pp.top());
					
				}else if(pp.top()<var_temporaria){ // se for menor que o anterior
					//permissao_apagar = true;
					System.out.println(var_temporaria);
					System.out.println(pp.top());
					pp.pop();
					pp.pop();
				}
				
				
			}else{ // primeiro número 
				// primeiro número do array da primeira linha de força.
				// não faz nada
			}

			// nova atribuição ao var_temporaria
			var_temporaria = pp.top();

			//System.out.println(pp.top()); - teste para ver se está inserindo
		}*/
		// Criar as linhas de força
		// ideia1: usar array para dar input nos elementos das energias e criar pilhas das energias de força e printar seus valores(usando as funcionalidades pop, top, push, etc, instanciando as novas pilhas 
		// idea2: dar push na pilha, usar o top e pop e guardar o elemento anterior numa varíavel para verificar se precisa de uma nova linha de força. 
