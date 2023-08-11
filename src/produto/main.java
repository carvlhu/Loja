package produto;

import java.util.Scanner;

public class main {

	public static Produto x;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		x = new Produto();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual a Data ? ");
		x.data = sc.next();
		
		System.out.println("Qual o Produto ? ");
		x.name = sc.next();
		
		System.out.println("Qual é o Preço do produto ? ");
		x.price = sc.nextDouble();
		
		System.out.println("Qual a Quantidade de produto no estoque ? ");
		x.qnte = sc.nextInt();
		
		double infott = x.infott();
		
		System.out.println("\n Estoque atualizado. \n Opções: \n Digite *1* para Retirar a quantidade de produto desejada."
				+ "\n Digite *2* para Adicionar a quantidade de produto desejada. "
				+ "\n Digite *3* para Fechar o sistema.");
		x.option = sc.nextInt();
		
		switch (x.option) {
			case 1:
				System.out.println("Quantos(as) " +  x.name + " você quer Retirar ? ");
				x.remove = sc.nextInt();
				double optionone = x.optionone();
				break;
			
			case 2: 
				System.out.println("Quantos(as) " +  x.name + " você quer Adicionar ? ");
				x.add = sc.nextInt();
				double optiontwo = x.optiontwo();
				break;
				
			case 3:
				System.exit(0);
				break;
			
			default: 
				System.out.println("Opção não encontrada...");
				
		}
		
	}

}
