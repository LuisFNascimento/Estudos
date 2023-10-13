package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer07_MaiorNumero {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			
			int num;
			int maior = Integer.MIN_VALUE ;
			
			for (int i=0; i<5; i++) {
				
				System.out.println("Digite o numero: ");
				num = scan.nextInt();
				
				if (num > maior) {
					maior = num;
					System.out.println("O numero maior mudou: " + maior);
				}
			}
			
			System.out.println("O maior numero digitado foi: " + maior);
		}

	}

}
