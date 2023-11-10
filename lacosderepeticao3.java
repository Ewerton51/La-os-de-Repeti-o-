package atividadesbootcamp101123;

import java.util.Scanner;

public class lacosderepeticao3 {

	public static void main(String[] args) {
		
		int num,soma=0;
		Scanner ler = new Scanner(System.in);
		
		do {
			
			System.out.println("\nDigite um número: ");
			num = ler.nextInt();
			
			if(num > 0){
				soma += num;
			}
			
		}while(num != 0); {
			
		}
		
		System.out.println("\nA soma dos números positivos é "+soma);
		
	}

}
