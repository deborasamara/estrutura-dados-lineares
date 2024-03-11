// FAZENDO A QUESTÃO DA ENERGIA
import java.util.Scanner;

public class testePilha {

	public static void main(String[] args) {	

		PilhaArray pp = new PilhaArray(1);

		1 2 3 5 7 6758
			pp[i]
		// criar condição de parada ex -1
		int res = 1;
		int i = 1;

		// variável temporária que guarda o valor anterior
		int var_temporaria; 
		
		while(res != -1){ // ficar dando push e verificando 
			System.out.println("Digite a energia da casa "+i);
			i++;
			Scanner scanner = new Scanner(System.in); 
			int energia = scanner.nextInt();
			res = energia;
			pp.push(energia);
			// usar a variável temporária 
			
			//System.out.println(pp.top()); - teste para ver se está inserindo
		}
		// Criar as linhas de força
		// ideia1: usar array para dar input nos elementos das energias e criar pilhas das energias de força e printar seus valores(usando as funcionalidades pop, top, push, etc, instanciando as novas pilhas 
		// idea2: dar push na pilha, usar o top e pop e guardar o elemento anterior numa varíavel para verificar se precisa de uma nova linha de força. 

	}
}
