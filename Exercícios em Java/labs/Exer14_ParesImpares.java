package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer14_ParesImpares {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			
			int num;
			int pares = 0;
			int impares = 0;
			
			for (int i=0; i<10; i++) {
				
				System.out.println("Entre com n�mero: ");
				num = scan.nextInt();
				
				if (num % 2 == 0) {
					pares++;
				}else {
					impares++;
				}
			}
			System.out.println("N�meros Pares: " + pares);
			System.out.println("N�meros Impares: " + impares);
		}

	}

}
