package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer17_Fatorial {

	public static void main(String[] args) {
		
	try (Scanner scan = new Scanner(System.in)){
		
		System.out.println("Entre com o número:");
		int num = scan.nextInt();
		
		System.out.println(num + "! = ");
		
		int fatorial = 1;
		for (int i=num; i>0; i--) {
			fatorial *= i;
			System.out.println(i);
		}
		System.out.println("Resultado: " + fatorial);
	}
	}
}
