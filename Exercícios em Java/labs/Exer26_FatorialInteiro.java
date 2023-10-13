package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer26_FatorialInteiro {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)){
			
			System.out.println("Entre com o número:");
			int num = scan.nextInt();
			
			System.out.println("Fatorial de " + num);
			
			System.out.print(num + "! = ");
			
			int fatorial = 1;
			for (int i=num; i>1; i--) {
				fatorial *= i;
				System.out.print(i + " . ");
			}
			System.out.println("1 = " + fatorial);
		}
		}

}
