package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer24_TabelaPreco2 {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			
			System.out.println("Entre com o pre�o do P�o: R$ ");
			double preco = scan.nextDouble();
			
			System.out.println("Pre�o do P�o: R$ " + preco);
			System.out.println("Panificadora P�o de Ontem - Tabela de pre�os");
			
			for (int i=1 ; i<=50 ; i++) {
				System.out.println(i + " - R$ " + (preco*i));
			}
		}

	}

}
