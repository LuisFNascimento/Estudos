package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer30_Tabuada02 {

		public static void main(String[] args) {
			
			try( Scanner scan = new Scanner(System.in)){
				
				System.out.println("Entre com o número para gerar a tabuada: ");
				int num = scan.nextInt();
					
				boolean invalido = true;
				int numInicio, numFinal;
				
				do {
					System.out.println("Entre com o início da tabuada: ");
					numInicio = scan.nextInt();
					
					System.out.println("Entre com o final da tabuada: ");
					numFinal = scan.nextInt();
					
					if (numFinal < numInicio) {
						invalido = false;
					}
				} while (!invalido);
				
				
				System.out.println("Tabuada de: " + num);
				System.out.println("Começar por: " + numInicio);
				System.out.println("Terminar em: " + numFinal);
				System.out.println();
				
				for(int i=numInicio; i<=numFinal; i++) {
					System.out.println(num + " x " + i + " = " + (num*i));
				}
					}
	}
}


				