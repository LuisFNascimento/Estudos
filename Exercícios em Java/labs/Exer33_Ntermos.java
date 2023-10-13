package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer33_Ntermos {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)){
			
			System.out.println("Digite o valort de n");
			int n = scan.nextInt();
			double soma = 0;
			
			for (int i=1 , j=1; i<=n; i++, j+=2) {
				
				System.out.print(i + "/" + j + " + ");
				
				soma += i/j;
			}
			
			System.out.println("\nSoma = " + soma);
		}

	}

}
