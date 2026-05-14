package exerciciosJava;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();

		int opcao;

		while (true) {

			System.out.println("\n*****************************************************");
			System.out.println("1 - Adicionar Livro na Pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da Pilha");
			System.out.println("0 - Sair");
			System.out.println("*****************************************************");
			System.out.println("Digite uma opção: ");

			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println("\nPrograma Finalizado!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {

			case 1:
				System.out.println("\nDigite o nome: ");
				leia.skip("\\R?");
				String livro = leia.nextLine();

				pilha.push(livro);

				System.out.println("\nPilha:");
				for (String item : pilha) {
					System.out.println(item);
				}

				System.out.println("\nLivro adicionado!");
				break;

			case 2:
				System.out.println("\nLista de Livros na Pilha:");

				for (String item : pilha) {
					System.out.println(item);
				}
				break;

			case 3:
				if (pilha.isEmpty()) {
					System.out.println("\nA Pilha está vazia!");
				} else {
					pilha.pop();

					System.out.println("\nPilha:");
					for (String item : pilha) {
						System.out.println(item);
					}

					System.out.println("\nUm Livro foi retirado da pilha!");
				}
				break;

			default:
				System.out.println("\nOpção Inválida!");
				break;
				
				}
			}
		}

	}

