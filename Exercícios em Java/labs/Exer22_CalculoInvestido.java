package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer22_CalculoInvestido {

	public static void main(String[] args) {
		
		try( Scanner scan = new Scanner(System.in)){
			
			System.out.println("Informe a qtd de Cds comprada:");
			int cd = scan.nextInt();
			
			double valorCds;
			double soma = 0;
			double media;
			
			for(int i=0; i<cd; i++) {
				System.out.println("Informe o valor do CD " + (i+1));
				valorCds = scan.nextDouble();
				
				soma += valorCds;
			}
			media = soma / cd;
			System.out.println("Total investido: " + soma);
			System.out.println("Média gasta: " + media);
		}

	}

}
