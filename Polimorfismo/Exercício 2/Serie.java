public class Serie extends Conteudo{
	private int duracao;
	private String quantEpisodios;
	private String quantTemps;


	public Serie(String Titulo,String Categoria, int duracao, String quantEpisodios, String quantTemps ) {
		super (Titulo,Categoria); 
		this.duracao = duracao;
		this.quantEpisodios = quantEpisodios;
		this.quantTemps = quantTemps;
	}
		
		public int getDuracao() {
			return duracao;
		}

		public void setDuracao(int duracao) {
			this.duracao = duracao;
		}

		public String getQuantEpisodios() {
			return quantEpisodios;
		}

		public void setQuantEpisodios(String quantEpisodios) {
			this.quantEpisodios = quantEpisodios;
		}

		public String getQuantTemps() {
			return quantTemps;
		}

		public void setQuantTemps(String quantTemps) {
			this.quantTemps = quantTemps;
		}
		
		@Override
		public void Descricao () {
			int horas = duracao / 60;
	        int minutos = duracao % 60;
	        System.out.println("Titulo: "+getTitulo());
			System.out.println("Categoria: "+getCategoria());
	        System.out.println(horas + "h " + minutos + "min");
	        System.out.println("Quantidade de Episódios: "+ quantEpisodios);
	        System.out.println("Quantidade de Temporadas: " + quantTemps);
	}
		
}
 
