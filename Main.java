package biblioteca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Biblioteca biblioteca = new Biblioteca();
		int selecao;
		do {
			System.out.println("================ LIVRARIA ================");
			System.out.println("1. Adicionar novo livro.");
			System.out.println("2. Adicionar nova revista.");
			System.out.println("3. Procurar por materiais cadastrados.");
			System.out.println("4. Listar materiais cadastrados.");
			System.out.println("5. Excluir um material.");
			System.out.println("6. Sair.");
			System.out.print("Qual opção desejada? ");
			selecao = scanner.nextInt();
			scanner.nextLine();

			switch (selecao) {

			case 1:
				Livro livro = new Livro(null, null, null);
				biblioteca.adicionarMaterial(livro);
				livro.selecionarGenero();						
				System.out.println("Retornando ao menu inicial!");

				break;
			case 2:

		
				Revista revista = new Revista(null, null, 0);
				biblioteca.adicionarMaterial1(revista);
				
				System.out.println("Retornando ao menu inicial!");
				break;
			case 3:
				System.out.println("Qual o material que deseja encontrar? ");
				biblioteca.pesquisarMaterialPeloNome();
				System.out.println("Retornando ao menu inicial!");
				break;

			case 4:
				biblioteca.exibirMaterial();
				break;
			case 5:
				System.out.println("Qual o material que deseja excluir? ");
				biblioteca.excluirMaterialNome();
				System.out.println("Retornando ao menu inicial!");
				break;
			case 6:
				scanner.close();
				System.out.println("Obrigado por visitar nossa biblioteca! Retorne sempre que desejar. ");
				return;
			default:
				System.out.println("Opção inválida. Escolha uma das opções listadas: ");

			}

		} while (true);

	}
}