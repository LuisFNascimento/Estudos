package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer21_MediaAlunoTurma {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)){
			
			System.out.println("Entre com quantidade de turmas: ");
			int turmas = scan.nextInt();
			
			int alunos; 
			double media;
			int soma = 0;
			boolean invalido = true;
			
			for(int i=0; i<turmas; i++) {
				
				invalido = true;
				do{
					System.out.println("Entre com a qts de alunos da turma " + (i+1));
					alunos = scan.nextInt();
					
					if(alunos <= 40) {
						invalido = false;
					}else {
						System.out.println("Número de alunos inválido. Digite novamente");
					}
				}while (invalido);
				
				soma += alunos;
				
				}
			media = soma / turmas;
			System.out.println("Total de Alunos: " + soma);
			System.out.println("Média de alunos por turma: " + media);
		}

	}
}



