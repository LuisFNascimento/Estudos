package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer03_ValidacaoCadastro {

	public static void main(String[] args) {
		
	try (Scanner scan = new Scanner(System.in)){
		
		boolean infoValida;
		String nomeUser;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;
		
		
		infoValida = false;
	do {
		System.out.println("Digite seu nome: ");
		nomeUser = scan.next();
		
		if(nomeUser.length() > 3) {
			infoValida = true;
		}else {
			System.out.println("Nome Invalido, digite novamente com mais de tres caracteres");
		}
	}while(!infoValida);
	
	infoValida = false;
	do {
		System.out.println("Digite sua Idade: ");
		idade = scan.nextInt();
		
		if(idade > 0 && idade < 100) {
			infoValida = true;
		}else {
			System.out.println("Idade Invalido, digite novamente entre 0 a 100");
		}
	}while(!infoValida);
	
	infoValida = false;
	
	do {		
		System.out.println("Digite seu Salário: ");
		salario = scan.nextDouble();
		
		if(salario > 0) {
			infoValida = true;
		}else {
			System.out.println("Salario Invalido, digite novamente acima de 0");
		}
	}while(!infoValida);
		
	
	infoValida = false;
	
	do {	
		System.out.println("Digite seu sexo: ");
		sexo = scan.next();
		
		if(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
			infoValida = true;
		}else {
			System.out.println("Sexo Invalido, digite novamente 'F' para feminino e 'M' para Masculino");
		}
	}while(!infoValida);
		
	infoValida = false;
	
	do {
		System.out.println("Digite seu Estado Civil: ");
		estadoCivil = scan.next();

		if(estadoCivil.equalsIgnoreCase("s") || 
				estadoCivil.equalsIgnoreCase("c")|| 
				estadoCivil.equalsIgnoreCase("v") || 
				estadoCivil.equalsIgnoreCase("d")) {
			infoValida = true;
		}else {
			System.out.println("Estado Civil Invalido, digite novamente");
		}
	}while(!infoValida);
	
	System.out.println("Nome: " + nomeUser + " Idade: " + idade + " Salario: " + salario + 
			" Sexo: " + sexo + " Estado Civil: " + estadoCivil);
	}
	}

}
