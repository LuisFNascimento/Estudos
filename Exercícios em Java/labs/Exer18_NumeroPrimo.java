package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer18_NumeroPrimo {

	public static void main(String[] args) {
		
		try( Scanner scan = new Scanner(System.in)){
			
			System.out.println("Entre com n�mero");
			int num = scan.nextInt();
			
			boolean primo = true;
			
			for(int i=2; i<num; i++) {
				if(num % i == 0) {
					System.out.println("N�o � primo divis�vel por: " + i);
					primo = false;
				}
			}
			if(primo) {
				System.out.println("� n�mero primo!");
			}
		}

	}

}
