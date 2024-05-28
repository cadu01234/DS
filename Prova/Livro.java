
public class Livro extends Publicacao {
	private int numeroPaginas;
	private String editora;
	
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

@Override

	public void exibirDetalhes() {
		System.out.println("Deseja incluir a editora? (1-s ou 2-n");
}
	
	

}
