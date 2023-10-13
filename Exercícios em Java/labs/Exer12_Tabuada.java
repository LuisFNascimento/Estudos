package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer12_Tabuada {

	public static void main(String[] args) {
		
		try( Scanner scan = new Scanner(System.in)){
			
			System.out.println("Entre com o numero para gerar a tabuada: ");
			int num = scan.nextInt();
			
			
			System.out.println("Tabuada de " + num + ":");
			
			for(int i=0; i<=10; i++) {
				System.out.println(num + " x " + i + " = " + (num*i));
			}
			
			
		}

	}

}
