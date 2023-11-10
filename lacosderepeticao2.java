package atividadesbootcamp101123;

import java.util.Scanner;

public class lacosderepeticao2 {

	public static void main(String[] args) {
		
		int idade,idadeMenor21=0,idadeMaior50=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a idade: ");
		idade = leia.nextInt();
		
		while(idade >=0) {
			if(idade<21) {
				idadeMenor21++;
			}if(idade>50) {
				idadeMaior50++;	
			}	
		System.out.println("\nDigite a idade: ");
		idade = leia.nextInt();
		}
		
		System.out.println("\nTemos "+idadeMenor21+" pessoas menores de 21 anos!");
		System.out.println("\nTemos "+idadeMaior50+" pessoas maiores de 50 anos!");
	}

}
