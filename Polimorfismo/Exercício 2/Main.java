import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Conteudo> catalogo = new ArrayList<>();

        catalogo.add(new Filme("Poderoso Chefão", "Máfia", 175));
        catalogo.add(new Filme("Scarface", "Crime", 165));
        catalogo.add(new Filme("Malcolm X", "Drama", 202));
        catalogo.add(new Filme("Cidade de Deus", "Crime", 165));

        catalogo.add(new Serie("Breaking Bad", "Drama", 50, "62", "5"));
        catalogo.add(new Serie("Ficção Científica", "Stranger Things", 50, "34", "4"));
        catalogo.add(new Serie("Fantasia", "Game of Thrones", 55, "73", "8"));
        catalogo.add(new Serie("Drama", "Dexter", 45, "96", "8"));
        catalogo.add(new Serie("Drama", "Peaky Blinders", 50, "36", "5"));
        catalogo.add(new Serie("The Office", "Comédia", 22, "201", "9"));

        for (Conteudo conteudo : catalogo) {
            conteudo.Descricao();
            System.out.println();
        }
    }
}
