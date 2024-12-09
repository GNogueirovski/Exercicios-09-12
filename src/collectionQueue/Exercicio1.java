package collectionQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		Integer menu;

		// Puxando o scanner
		Scanner leia = new Scanner(System.in);

		do {
			// Entrada de dados - Selecionar a ação
			System.out.println("\n******************************************************");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			System.out.println("\n******************************************************");
			menu = leia.nextInt();

			// Switch para a opção desejada
			switch (menu) {
			// Finaliza programa caso for 0
			case 0:
				System.out.println("Programa finalizado!");
				break;

			// Adicionando cliente na fila
			case 1:
				System.out.println("\nDigite o nome do cliente que deseja adicionar na fila:");
				String nome = leia.next();
				fila.add(nome);
				System.out.println("Cliente Adicionado!");
				break;

			// Listando clientes na fila com for each
			case 2:
				System.out.println("\nFila:");
				for (String file : fila)
					System.out.println(file);
				break;
			// Retirando cliente da fila
			case 3:
				fila.poll();
				System.out.println("\nFila:\n");
				System.out.println("Cliente foi chamado!");
				for (String file : fila)
					System.out.println(file);

				break;
			// default de opção inválida
			default:
				System.out.println("Selecione uma opção existente");
			}
			// Enquanto for diferente de 0, o programa roda
		} while (menu != 0);
		// Fecha scanner
		leia.close();
	}
}
