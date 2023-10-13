package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer05_TaxaPopulacao {

	public static void main(String[] args) {
		
	try (Scanner scan = new Scanner(System.in)) {
		{
			
			boolean valido = false;
			
			double popA;
			double popB;
			double taxaA;
			double taxaB;
			
			valido = false;
			do {
				
				System.out.println("Digite a população A: ");
				popA = scan.nextDouble();
				
				if(popA > 0) {
					valido = true;
				}else {
					System.out.println("População precisa ser maior que 0");
				}
				
			}while (!valido);
			
			
			valido = false;
			do {
				
				System.out.println("Digite a população B: ");
				popB = scan.nextDouble();
				
				if(popB > 0) {
					valido = true;
				}else {
					System.out.println("População precisa ser maior que 0");
				}
				
			}while (!valido);
			
			
			valido = false;
			do {
				
				System.out.println("Digite a taxa crescimento A: ");
				taxaA = scan.nextDouble();
				
				if(taxaA > 0) {
					valido = true;
				}else {
					System.out.println("Taxa precisa ser maior que 0");
				}
				
			}while (!valido);
			
			
			valido = false;
			do {
				
				System.out.println("Digite a taxa crescimento B: ");
				taxaB = scan.nextDouble();
				
				if(taxaB > 0) {
					valido = true;
				}else {
					System.out.println("Taxa precisa ser maior que 0");
				}
				
			}while (!valido);
			
			
			int cont = 0;
				
			while (popA < popB){
			
			popA += (popA/100) * taxaA;
			popB += (popB/100) * taxaB;
			cont++;
			
			}
			
			System.out.println("População A: " + popA);
			System.out.println("População B: " + popB);
			System.out.println("Qtd anos:    " + cont);
			
		}
	}
}
}
