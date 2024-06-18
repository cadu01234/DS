public class JogoEletronico extends Jogo {
	private String plataforma;
	private String genero;
 
	public JogoEletronico () {
		this.plataforma = plataforma;
		this.genero = genero;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma() {
		System.out.println("Para quais plataformas o jogo está disponível?");
		plataforma = in.nextLine();
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero() {
		System.out.println("Qual o gênero do jogo?");
		genero = in.nextLine();
		
	}
	public void jogarOnline(int quantidadeJogadores) {
		System.out.println("Jogando online com " + quantidadeJogadores + " jogadores");
		
	}
	 
	@Override
	public void Exibir() {
	super.Exibir();
	System.out.println("Plataforma: " + getPlataforma());
	System.out.println("Gênero: " + getGenero());

}
}
