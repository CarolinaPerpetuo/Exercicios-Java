package exerciciosJava;

import java.util.Scanner;

public class Exercicio02For {

	public static void main(String[] args) {
		
		int numero, pares = 0, impares = 0;
        Scanner leia = new Scanner(System.in);
        
         
        for(int i = 1; i <= 10; i ++) {
        	System.out.println("Digite o " + i + "º numero: ");
            numero = leia.nextInt();
            
            if (numero % 2 == 0) {
            	pares ++;
            }
            else {
            	impares++;
            }
            
        }
            System.out.println("Total de números pares: " + pares + "\n");
            System.out.println("Total de números ímpares: " + impares + "\n");
            
         
        

          }
	} 

