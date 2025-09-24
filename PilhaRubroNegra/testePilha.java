public class testePilha {

	public static void main(String[] args) {	
		// Teste inserindo e retirando elementos das duas pilhas sem precisar alterar a capacidade
		PilhaRubroNegra pp=new PilhaRubroNegra(10);
		System.out.println("Inserindo Pilha Vermelha");
		for(int f=0;f<5;f++){
		  System.out.println(f);		  
		  pp.pushV(f);
		}
		System.out.println("Inserindo Pilha Preta");
		for(int f=0;f<5;f++){
		  System.out.println(f);		  
		  pp.pushP(f);
		}
		System.out.println("Retirando Pilha Vermelha");
		for(int f=0;f<5;f++){
			  System.out.print(f);
			  System.out.println(" - "+pp.popV());
		}
		System.out.println("Retirando Pilha Preta");
		for(int f=0;f<5;f++){
			  System.out.print(f);
			  System.out.println(" - "+pp.popP());
		}
		// Teste inserindo e retirando elementos das duas pilhas alterando a capacidade
		System.out.println("Inserindo Pilha Vermelha");
		for(int f=0;f<5;f++){
		  System.out.println(f);		  
		  pp.pushV(f);
		}
		System.out.println("Inserindo Pilha Preta");
		for(int f=0;f<10;f++){
		  System.out.println(f);		  
		  pp.pushP(f);
		}
		System.out.println("Tamanho Atual da Pilha Vermelha: "+pp.sizeV());
		System.out.println("Tamanho Atual da Pilha Preta: "+pp.sizeP());

	}
}
