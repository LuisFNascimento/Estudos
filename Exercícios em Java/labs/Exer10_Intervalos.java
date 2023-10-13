package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer10_Intervalos {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			
			int num1, num2;
						
			System.out.println("Entre com o primeiro numero: ");
			num1 = scan.nextInt();
			
			System.out.println("Entre com o segundo numero: ");
			num2 = scan.nextInt();
			
			for (int i=num1; i<=num2; i++) {
				System.out.println(i);
			}
		}

	}

}
