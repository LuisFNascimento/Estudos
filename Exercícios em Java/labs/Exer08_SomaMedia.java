package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer08_SomaMedia {

	public static void main(String[] args) {
		
		try( Scanner scan = new Scanner(System.in)){
			
			int num;
			double media;
			int soma = 0;
						
			for (int i=0; i<5; i++){
			
			System.out.println("Entre com o numero: ");
			num = scan.nextInt();
			
			soma += num;
		}
		
		media = soma / 5;
		
		System.out.println("Soma: " + soma);
		System.out.println("Madia: " + media);
	}
}
}
