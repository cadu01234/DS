
public class Publicacao {
	
	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	public void exibirDetalhes() {
		System.out.println(this.titulo);
		System.out.println(this.autor);
		System.out.println(this.anoPublicacao);
	}

}
