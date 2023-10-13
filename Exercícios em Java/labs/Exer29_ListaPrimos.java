package cursojava.aula16e17.labs;

import java.util.Scanner;

public class Exer29_ListaPrimos {

	public static void main(String[] args) {
		
try( Scanner scan = new Scanner(System.in)){
			
			System.out.println("Entre com número");
			int num = scan.nextInt();
			
			boolean primo;
			
			for(int i=1; i<=num; i++) {
				
				 primo = true;
				
				for(int j=2; j<i; j++) {
					if(i % j == 0) {
						
						primo = false;
					}
				}
				if(primo) {
					System.out.println(i);
				}
}}}
}
