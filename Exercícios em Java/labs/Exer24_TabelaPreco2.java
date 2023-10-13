package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer24_TabelaPreco2 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			
			System.out.println("Entre com o preço do Pão: R$ ");
			double preco = scan.nextDouble();
			
			System.out.println("Preço do Pão: R$ " + preco);
			System.out.println("Panificadora Pão de Ontem - Tabela de preços");
			
			for (int i=1 ; i<=50 ; i++) {
				System.out.println(i + " - R$ " + (preco*i));
			}
		}

	}

}
