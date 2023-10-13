package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer11_SomaNumeros {

	public static void main(String[] args) {
		
	try(Scanner scan = new Scanner(System.in)){
			
			int num1, num2;
			int soma = 0; 
									
			System.out.println("Entre com o primeiro numero: ");
			num1 = scan.nextInt();
			
			System.out.println("Entre com o segundo numero: ");
			num2 = scan.nextInt();
			
			for (int i=num1; i<=num2; i++) {
				soma += i;				
			}
			System.out.println("Soma: " + soma);
		}

	}
		
}
