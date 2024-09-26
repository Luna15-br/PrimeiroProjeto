package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

	private ArrayList<Material> materiais;

	public Biblioteca() {
		materiais = new ArrayList<>();

	}

	public void adicionarMaterial(Livro livro) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Qual o titulo do livro? ");
		String titulo = scanner.nextLine().toLowerCase();
		System.out.print("Qual o autor do Livro?");
		String autor = scanner.nextLine().toLowerCase();
		livro.setAutor(autor);
		livro.setTitulo(titulo);
		livro.setGenero(null);
		materiais.add(livro);
		System.out.println("Novo livro adicionado!");
		
		

	}
	public void adicionarMaterial1 (Revista revista) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Qual o titulo da revista: ");
		String titulo1 = scanner.nextLine().toLowerCase();
		System.out.print("Qual o autor da revista: ");
		String autor1 = scanner.nextLine().toLowerCase();
		System.out.print("Qual o número da revista: ");
		int numero1 = scanner.nextInt();
		scanner.nextLine();
		revista.setTitulo(titulo1);
		revista.setAutor(autor1);
		revista.setNumero(numero1);		
		materiais.add(revista);
		System.out.println("Nova revista adicionada!");

		
	}

	public void exibirMaterial() {

		for (Material material : materiais) {
			System.out.println(material.exibirBiblioteca());
		}

	}

	public boolean pesquisarMaterialPeloNome() {

		Scanner scanner = new Scanner(System.in);
		String procuraMaterial = scanner.nextLine().toLowerCase();
		boolean encontrou = false;
		for (Material material : materiais) {
			if (material.getTitulo() != null && material.getTitulo().equalsIgnoreCase(procuraMaterial)) {
				System.out.println("Material encontrado: " + material.exibirBiblioteca());
				encontrou = true;
			}
		}

		if (!encontrou)

		{
			System.out.println("Material não está presente no catálogo.");
		}

		return encontrou;

	}

	public boolean excluirMaterialNome() {
		
		Scanner scanner = new Scanner(System.in);
		String idenficarMaterial = scanner.nextLine().toLowerCase();
		boolean encontrou = false;
		for (Material material : materiais) {
			if (material.getTitulo() != null && material.getTitulo().equalsIgnoreCase(idenficarMaterial)) {
				materiais.remove(material);
				System.out.println("Material removido com sucesso! Agradecemos a colaboração.");
				return true;

			}

		}
		if (!encontrou) {
			System.out.println("Material não está presente no catálogo.");
		}
		return encontrou;
	}

}
