public class JogoFisico extends Jogo {
	private int quantidadeJogadores;
	private double tempoPartida;
 
	public JogoFisico () {
		this.quantidadeJogadores = quantidadeJogadores;
		this.tempoPartida = tempoPartida;
	} 
	public int getQuantidadeJogadores() {
		return quantidadeJogadores;
	}
	public void setQuantidadeJogadores() {
		System.out.println("Qual a quantidade de jogadores?");
		quantidadeJogadores = in.nextInt();
	}
	public double getTempoPartida() {
		return tempoPartida;
	}
	public void setTempoPartida() {
		System.out.println("Qual o tempo de partida?");
		tempoPartida = in.nextDouble();
	}
	
	
	public void calcularTempoTotal(int quantidadePartidas) {
		double tempoTotal = getTempoPartida() * quantidadePartidas;
		if (tempoTotal >60) {
			tempoTotal = 0;
			tempoTotal++;
			if (tempoTotal > 24) {
				tempoTotal = 1;
			}
		}
		System.out.println("Tempo total de jogo: "+tempoTotal+ "h");
	}
	
	@Override
	public void Exibir() {
	super.Exibir();
	System.out.println("Quantidade de Jogadores: " + getQuantidadeJogadores());
	System.out.println("Tempo de Partida: " + getTempoPartida()+" Horas");
}
}
