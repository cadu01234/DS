public class Livro extends Publicacao {
	private int numeroPaginas;
	private String editora;
	
	
	public Livro (String titulo, String autor, int anoPublicacao, int numeroPaginas, String editora) {
		super(titulo, autor, anoPublicacao);
		this.numeroPaginas = numeroPaginas;
		this.editora = editora;
	}
 
	public int getNumeropaginas() {
		return numeroPaginas;
	}
	public void setNumeropaginas(int numeropaginas) {
		this.numeroPaginas = numeropaginas;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println(" Numero de Paginas: " + numeroPaginas + " Editora: " + editora);
	}
	
	public void exibirDetalhes(boolean temEditora) {
		super.exibirDetalhes();
		System.out.println(" Numero de Paginas: " + numeroPaginas);
		if (temEditora) {
			System.out.println(" Editora: " + editora);
		}
	}
}
