public class Conteudo {
	private String categoria;
	private String titulo;
	
	public Conteudo (String categoria, String titulo) {
		this.titulo = titulo;
		this.categoria = categoria;
	}
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		categoria = categoria;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		titulo = titulo;
	}
	
	public void Descricao () {
		System.out.println("Titulo: "+titulo);
		System.out.println("Categoria: "+categoria);
	}

}
