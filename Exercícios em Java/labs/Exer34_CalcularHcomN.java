package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer34_CalcularHcomN {

	public static void main(String[] args) {
		
try (Scanner scan = new Scanner(System.in)){
			
			System.out.println("Digite o valort de n");
			int n = scan.nextInt();
			double soma = 0;
			
			for (int i=1; i<=n; i++) {
				
				soma += 1/i;
			}
			
			System.out.println("Soma = " + soma);
		}

	}

}
