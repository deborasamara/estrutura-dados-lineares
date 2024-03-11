// FAZENDO A QUESTÃO DA ENERGIA
import java.util.Scanner;

public class testePilha {

	public static void main(String[] args) {	

		PilhaArray pp = new PilhaArray(1);
		// criar condição de parada ex -1
		int res = 1;
		int i = 1;
		while(res != -1){
			System.out.println("Digite a energia da casa "+i);
			i++;
			Scanner scanner = new Scanner(System.in); 
			int energia = scanner.nextInt();
			res = energia;
			pp.push(energia);
			//System.out.println(pp.top()); - teste para ver se está inserindo
		}
		// Criar as linhas de força
		// ideia: usar array para dar input nos elementos das energias e criar pilhas das energias de força e printar seus valores(usando as funcionalidades pop, top, push, etc, instanciando as novas pilhas 
		

	}
}
