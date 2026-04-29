package exerciciosJava;

import java.util.Scanner;

public class Exercicio01For {

	public static void main(String[] args) {
		
		
		int inicio, fim;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o Primeiro numero do intervalo: ");
        inicio = leia.nextInt();
        
        System.out.println("Digite o Segundo numero do intervalo: ");
        fim = leia.nextInt();
        
        if (inicio >= fim) {  //verificar se é invalido
        	System.out.println("Intervalo inválido.");     	
        }
        else {
        	
            
        for (int i = inicio; i <= fim; i++) {
        	
        	if (i % 3 == 0 && i % 5 == 0) {	
            System.out.println(i + " é multiplo de 3 e 5." );
            
            
        		}
        	}

		}
	
	}
}
