package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer23_TabelaPreco {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)){
			
			//System.out.println("Entre com qtd de itens");
			//int itens = scan.nextInt();
			
			System.out.println("Lojas Quase Dois - Tabela de preços");
			
			double artigo = 1.99;
			
			for (int i=1 ; i<=50 ; i++) {
				System.out.println(i + " -  R$ " + (artigo*i));
			}
		} 

	}

}
