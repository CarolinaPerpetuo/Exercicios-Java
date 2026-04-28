package exerciciosJava;

import java.util.Scanner;

public class Exercicio01Vetor {

	public static void main(String[] args) {
		
		int vetorNumeros[] = new int[10];
		int numeroProcurado;
		boolean encontrado = false;
		Scanner leia = new Scanner(System.in);
		
		
		for (int indice = 0; indice < 10; indice++) {
			System.out.println("Digite o número da posição " + (indice + 1) + ": ");
			vetorNumeros[indice] = leia.nextInt();
			
	}
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numeroProcurado = leia.nextInt();
		
		for (int indice = 0; indice < vetorNumeros.length; indice++) {

		    if (vetorNumeros[indice] == numeroProcurado) {
		        System.out.println("O número está na posição: " + indice);
		        encontrado = true;
		        break;
		        
		    }
		}
		    
		    if (encontrado == false) {
		        System.out.println("O número não foi encontrado!");
		        
		        
		    	}
		  }
	}
		
		
		

		
			
