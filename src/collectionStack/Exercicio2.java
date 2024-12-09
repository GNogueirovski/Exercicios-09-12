package collectionStack;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	public static void main(String[] args) {
		Stack<String> livros = new Stack<String>();
		Integer menu;
		Scanner leia = new Scanner(System.in);
		do {
			// Entrada de dados - Selecionar a ação
			System.out.println("\n******************************************************");
			System.out.println("1 - Adicionar Livro na pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("\n******************************************************");
			menu = leia.nextInt();
			leia.nextLine();

			// Switch para a opção desejada
			switch (menu) {
			// Finaliza programa caso for 0
			case 0:
				System.out.println("Programa finalizado!");
				break;
			// Adiciona livro à pilha
			case 1:
				System.out.println("\nDigite o nome do Livro que deseja adicionar à pilha: ");
				String nome = leia.nextLine();
				livros.push(nome);
				System.out.println();
				System.out.println("Livro adicionado!");
				break;
			// If para retornar se a pilha estiver vazia, se tiver elementos exibir eles com
			// for each
			case 2:
				if (livros.isEmpty() != false)
					System.out.println("\nA pilha está vazia");
				else {
					System.out.println("\nPilha:");
					System.out.println();
					for (String pilha : livros)
						System.out.println(pilha);
					break;
				}
				// if para retornar se a pilha estiver vazia, else para remover o último
				// elemento adicionado
			case 3:
				if (livros.isEmpty() != false)
					System.out.println("\nA pilha está vazia");
				else {
					livros.pop();
					System.out.println("\nLista de Livros na pilha:\n");
					for (String pilha : livros)
						System.out.println(pilha);
					System.out.println();
					System.out.println("Um Livro foi retirado da pilha!");
				}
				break;
			// default de opção inválida
			default:
				System.out.println("Selecione uma opção existente");

			}
			// Enquanto for diferente de 0, o programa roda
		} while (menu != 0);
		// fecha scanner
		leia.close();

	}

}
