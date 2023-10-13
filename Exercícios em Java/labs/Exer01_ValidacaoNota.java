package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer01_ValidacaoNota {

	public static void main(String[] args) {
		
	try  (	Scanner ler = new Scanner(System.in)){
		
		boolean notaValida = false;
		
		do {
			System.out.println("Digite uma Nota: ");
			int nota = ler.nextInt();
			
			if(nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Você digitou: " + nota);
			} else {
				System.out.println("Valor invalido. A nota deve estar entre 0 ou 10! ");
			}
			
		} while (!notaValida);
		
		System.out.println("Nota válida informada: " + notaValida);

	}
}
}

