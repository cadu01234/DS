
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Livro livro1 = new Livro("O homem invisivel", "Moisés Araujo", 1700, 200, "Panini");
			Revista revista1 = new Revista("Pedra Rocha", "Bruce Wayne", 2000, 8, "DC");
			Livro livro2 = new Livro("Os imbativeis", "Robert Reynolds", 2000, 10, "Marvel")
			Revista revista2 = new Revista("Pedra Rocha", "Bruce Wayne", 2000, 8, "DC");
			
				System.out.println("Detalhes do Livro:");
				livro1.exibirDetalhes();
				System.out.println();
				
				System.out.println("Detalhes do Livro sem a Editora:");
				livro1.exibirDetalhes(false);
				System.out.println();

				System.out.println("Detalhes do Livro:");
				livro2.exibirDetalhes();
				System.out.println();
				
				System.out.println("Detalhes do Livro sem a Editora:");
				livro2.exibirDetalhes(false);
				System.out.println();

				System.out.println("Detalhes da Revista:");
				revista1.exibirDetalhes();
				System.out.println();
				
				System.out.println("Detalhes da Revista sem a Editora:");
				revista1.exibirDetalhes(false);

				System.out.println("Detalhes da Revista:");
				revista2.exibirDetalhes();
				System.out.println();
				
				System.out.println("Detalhes da Revista sem a Editora:");
				revista2.exibirDetalhes(false);
			}
		}
