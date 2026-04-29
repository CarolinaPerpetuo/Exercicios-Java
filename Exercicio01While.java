package exerciciosJava;

import java.util.Scanner;

public class Exercicio01While {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite uma idade: ");
		int idade = leia.nextInt();
		
		int menores21 = 0; 
		int maiores50= 0;
		
		
		while (idade >= 0) {
			
			if (idade < 21) {
		        menores21++;
		    }
			
		    else if (idade > 50) {
		        maiores50++;
		    }
			
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
		}
	
			
			System.out.println("Total de pessoas menores de 21 anos: " + menores21);
			System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);
		
			

			}
	}
