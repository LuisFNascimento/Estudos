package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer27_Temperatura {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			
			System.out.println("Entre com a quantidades de Temperaturas");
			int qtdTemperatura = scan.nextInt();
			
			double temp;
			double media = 0;
			double max = Double.MIN_VALUE;
			double min = Double.MAX_VALUE;
			double soma = 0;
			
			for (int i=1 ; i<=qtdTemperatura ; i++) {
				System.out.println("Entre com a temperatura " + i);
				temp = scan.nextDouble();
				
				soma += temp;
				
				if (temp > max) {
					max = temp;
				}
				
				if (temp < min) {
					min = temp;
				}
				media = soma/qtdTemperatura;
			}
			
			System.out.println("Temperatura Média: " + media);
			System.out.println("Temperatura Máxima: " + max);
			System.out.println("Temperatura Mínima: " + min);
		}

	}

}
