package biblioteca;

import java.util.Scanner;

public class Livro extends Material {

	private Generos genero;

	public Livro(String titulo, String autor, Generos genero) {
		super(titulo, autor);
		this.genero = genero;
	}

	public Generos getGenero() {
		return genero;
	}

	public void setGenero(Generos genero) {
		this.genero = genero;

	}

	public void selecionarGenero() {
		Scanner scanner = new Scanner(System.in);
		int escolha;

		do {
			System.out.println("1. Romance");
			System.out.println("2. Ação");
			System.out.println("3. Drama");
			System.out.println("4. Comédia");
			System.out.print("Selecione um gênero: ");
			escolha = scanner.nextInt();

			switch (escolha) {
			case 1:
				this.genero = Generos.ROMANCE;
				return;
			case 2:
				this.genero = Generos.ACAO;
				return;
			case 3:
				this.genero = Generos.DRAMA;
				return;
			case 4:
				this.genero = Generos.COMEDIA;
				return;
			default:
				System.out.println("Opção inválida. Escolha uma das opções listadas.");

			}
		} while (true);
	}

	@Override
	public String exibirBiblioteca() {
		return "Titulo do livro: " + getTitulo() + "\n" + "Autor: " + getAutor() + "\n" + "Genero: " + genero;

	}

}
