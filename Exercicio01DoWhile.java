package exerciciosJava;

import java.util.Scanner;

public class Exercicio01DoWhile {

	public static void main(String[] args) {
		
		int numero, soma = 0, contador = 0;
		float media;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
            numero = leia.nextInt();
		
        if (numero % 3 == 0 && numero != 0) {
        	soma += numero;
        	contador++;
        	
        }    
		
	}
		while (numero != 0);
			media = (float) soma / contador;
			System.out.println("A média de todos os números múltiplos de 3 é: " + media);
			
	}
}
	
