package atividadesbootcamp101123;

import java.util.Scanner;

public class lacosrepeticao1 {

	public static void main(String[] args) {
		
		int num,contPar=0,contImpar=0;
		Scanner leia = new Scanner(System.in);
		
		
		for(int contador=1;contador<=10;contador++) {
			System.out.println("Digite o "+contador+"°");
			num = leia.nextInt();
			if (num % 2 == 0) {
				contPar += 1;
			}else {
				contImpar += 1;
			}
		}
		System.out.println("\nQuantidade de números pares: "+contPar);
		System.out.println("\nQuantidade de números pares: "+contImpar);
	}

}
