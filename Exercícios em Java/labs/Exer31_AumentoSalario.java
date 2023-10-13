package cursojava.aula16e17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer31_AumentoSalario {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)){
			
			System.out.println("Digite o salário: ");
			double salario = scan.nextDouble();
						
			double percentual = 1.5;  //96
			
			salario += (salario/100)*1.5;  //96
			
			DecimalFormat format = new DecimalFormat("###,###.##");
			
			for (int i=1997; i<=2023; i++) {
				
				percentual *= 2;
				
				salario += (salario/100)*1.5;
				
				System.out.println(i + " = " + format.format(salario)+ " - " + format.format(percentual) + "%");
			}
		}

	}

}
