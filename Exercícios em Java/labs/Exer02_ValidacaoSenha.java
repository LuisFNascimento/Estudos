package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer02_ValidacaoSenha {

	public static void main(String[] args) {
		
		try (Scanner scan = new Scanner(System.in)){
			
			boolean senhaValida = false;
			
		do {	
			System.out.println("Digite seu nome: ");
			String nome = scan.next();
			
			System.out.println("Digite sua senha: ");
			String senha = scan.next();
			
			if (nome.equalsIgnoreCase(senha)) {
				//senhaValida = false;
				System.out.println("ERRO! A senha tem que ser diferente do nome!");
			} else {
				senhaValida = true;
				System.out.println("Senha cadastrada com sucesso");
			}
		} while (!senhaValida);
	}
}
}
