package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer19_MediaAritmetica {

	public static void main(String[] args) {
		
		try( Scanner scan = new Scanner(System.in)){
			
			System.out.println("Entre com número de notas");
			int notas = scan.nextInt();
			
			double soma = 0;
			double media, nota;
			
			for(int i=0; i<notas; i++) {
				System.out.println("Entre com a nota" + (i+1));
				nota = scan.nextDouble();
				
				soma += nota;
			}
			media = soma / notas;
			
			System.out.println("Soma: " + soma);
			System.out.println("Média: " + media);
		}
	}

}
