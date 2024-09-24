public class Filme extends Conteudo{
	private int duracao;
	
	 public Filme(String Titulo,String Categoria, int duracao ) {
	       super (Titulo,Categoria); 
	       this.duracao = duracao;
	    }

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
		@Override
		public void Descricao () {
			int horas = duracao / 60;
	        int minutos = duracao % 60;
	        System.out.println("Titulo: "+getTitulo());
			System.out.println("Categoria: "+getCategoria());
	        System.out.println(horas + "h " + minutos + "min");
	}
}
