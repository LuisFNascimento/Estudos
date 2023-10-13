package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer13_Expoente {

	public static void main(String[] args) {
		
try(Scanner scan = new Scanner(System.in)){
			
			int base, pot;
						
			System.out.println("Entre com o base: ");
			base = scan.nextInt();
			
			System.out.println("Entre com o potencia: ");
			pot = scan.nextInt();
			
			int resultado = base;
			
			for (int i=1; i<pot; i++) {
				resultado *= base;
			
			}
			System.out.println("Resultado: " + resultado);
	}

}
}
