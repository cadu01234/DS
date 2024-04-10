public class Main {
 
    public static void main(String[] args) {
        
 
        Filme filme1 = new Filme("Os Vingadores", 142);
        Filme filme2 = new Filme("Hotel Transilvânia", 93);
        Filme filme3 = new Filme("Cidade de Deus", 130);
        Filme filme4 = new Filme("Tropa de Elite", 115);
        Filme filme5 = new Filme("Ônibus 174", 150);
        Filme filme6 = new Filme("Gente Grande", 102);
        Filme filme7 = new Filme("Vovó... Zona", 99);
        
        System.out.println("Os Filmes em cartaz são:");
        exibirFilme(filme1);
        exibirFilme(filme2);
        exibirFilme(filme3);
        exibirFilme(filme4);
        exibirFilme(filme5);
        exibirFilme(filme6);
        exibirFilme(filme7);
        
    }
 
    public static void exibirFilme(Filme filme) {
        System.out.println(filme.getTitulo() + " - Duração: " + filme.exibirDuracaoEmHoras());
    }
 
}
