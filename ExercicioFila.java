package exerciciosJava;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();

		int opcao;

		while (true) {

			System.out.println("\n*****************************************************");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Chamar Cliente");
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
				String nome = leia.nextLine();

				fila.add(nome);

				System.out.println("\nFila:");
				for (String cliente : fila) {
					System.out.println(cliente);
				}

				System.out.println("\nCliente Adicionado!");
				break;

			case 2:
				System.out.println("\nLista de Clientes na Fila:");

				for (String cliente : fila) {
					System.out.println(cliente);
				}
				break;

			case 3:
				if (fila.isEmpty()) {
					System.out.println("\nA Fila está vazia!");
				} else {
					fila.poll();

					System.out.println("\nFila:");
					for (String cliente : fila) {
						System.out.println(cliente);
					}

					System.out.println("\nO Cliente foi Chamado!");
				}
				break;

			default:
				System.out.println("\nOpção Inválida!");
				break;
			}

		}

	}
}
