package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer20_MediaTurma {

	public static void main(String[] args) {
	
		try(Scanner scan = new Scanner(System.in)){
			
			System.out.println("Entre com o número de alunos: ");
			int alunos = scan.nextInt();
			
			double soma = 0;
			double media, idade;
			
			for(int i=0; i<alunos; i++) {
				System.out.println("Entre com a idade do aluno " + (i+1));
				idade = scan.nextDouble();
				
				soma += idade;
			}
			
			media = soma / alunos;
			
			if(media>=0 && media<=25) {
				System.out.println("Turma Jovem! Turma com média de " + media + " anos.");
			} else if(media>=26 && media<=60) {
				System.out.println("Turma Adulta! Turma com média de " + media + " anos.");
			}else {
				System.out.println("Turma Idosa! Turma com média de " + media + " anos.");
			}
			
		}

	}

}
