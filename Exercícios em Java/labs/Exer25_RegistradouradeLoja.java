package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer25_RegistradouradeLoja {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			
			double total = 0;
			double valorPago = 0;
			double troco = 0;
			boolean finalizar = true;
			double produto = 0;
			String output;
						
			System.out.println("Bem vindos as Lojas Tabajara");
			
			finalizar = true;
			
				do {
					System.out.println("Entre com valor do Produto 1: R$");
					produto = scan.nextDouble();
					
					output = "\nLojas Tabajara\n";
					
					for (int i=1 ; i<produto ; i++) {
						System.out.println("Produto " + (i+1) + " R$ "+ produto);
						
						output += "Produto " + i + ": R$ " + produto + "\n"; 
						
						total += produto;
						
				if(produto >= 0) {
					System.out.println("Próximo produto");
					produto = scan.nextDouble();
					
				} else {
					finalizar = false;
				}
					}
					System.out.println("Produtos Finalizados");
				} while (!finalizar);
				
				total += produto;
				System.out.println("Total à pagar: R$ " + total);
				
				output += "Total: R$ " + total + "\n";
				
				System.out.println("Entre com o valor Pago: R$");
				valorPago = scan.nextDouble();
				
				troco = valorPago - total;
				
				output += "Valor Pago: R$ " + valorPago + "\n";
				output += "Troco: R$ " + troco + "\n";

			System.out.println(output);
			System.out.println("Obrigado por comprar nas Lojas Tabajara\n" + "Volte Sempre!");
					}
		}
}
		
	
