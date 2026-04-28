package exerciciosJava;

import java.util.Scanner;

public class Exercicio02Vetor {

	public static void main(String[] args) {
		
		//bloco 1: estrutura
		int vetorNumeros[] = new int[10];
		int soma = 0;
		double media;
		Scanner leia = new Scanner(System.in);

		
		//bloco 2: entrada de dados
		for (int indice = 0; indice < 10; indice++) {
		    System.out.println("Digite o número " + (indice + 1) + ": ");
		    vetorNumeros[indice] = leia.nextInt();
		    soma = soma + vetorNumeros[indice];
		}
		
		//bloco 3: indice impares
		System.out.println("Elementos nos índices ímpares:");
		for (int indice = 0; indice < vetorNumeros.length; indice++) {
		    if (indice % 2 != 0) {
		        System.out.print(vetorNumeros[indice] + " ");
		    }
		}
		
		//bloco 4: elemnetos pares
		System.out.println("\n\nElementos pares: ");
		for (int indice = 0; indice < vetorNumeros.length; indice++) {
		    if (vetorNumeros[indice] % 2 == 0) {
		        System.out.print(vetorNumeros[indice] + " ");
		    }
		}
		
		media = soma / 10.0;
		System.out.println("\nSoma: " + soma + "\n");
		System.out.println("Média: " + media);
		

	}

}
