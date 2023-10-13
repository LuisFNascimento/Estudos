package cursojava.aula16e17.labs;

//import java.util.Scanner;

public class Exer16_SerieFibonacci2 {

	public static void main(String[] args) {
		
	//try ( Scanner scan = new Scanner(System.in)){
			
			//System.out.println("");
			//int n = scan.nextInt();
			
			int primeiro = 1;
			int segundo = 1;
			int proximo = 0;
			
			System.out.println(primeiro);
			System.out.println(segundo);
			
			while(proximo <= 500) {
				
				proximo = primeiro + segundo;
				primeiro = segundo;
				segundo = proximo;
				
				System.out.println(proximo);
			}
		}

	}

