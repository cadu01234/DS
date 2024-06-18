public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jogo jogo1 = new Jogo();
		JogoEletronico jogo2 = new JogoEletronico();
		JogoFisico jogo3 = new JogoFisico();
 
		jogo1.setNome();
		jogo1.setPreco();
		jogo1.setDistribuidora();
		System.out.println("----------");
		jogo2.setNome();
		jogo2.setPreco();
		jogo2.setDistribuidora();
		jogo2.setPlataforma();
		jogo2.setGenero();
		System.out.println("----------");
		jogo3.setNome();
		jogo3.setPreco();
		jogo3.setDistribuidora();
		jogo3.setQuantidadeJogadores();
		jogo3.setTempoPartida();
		System.out.println("----------");
		
		jogo1.Exibir();
		System.out.println("----------");
		jogo2.Exibir();
		jogo2.jogarOnline(100);
		System.out.println("----------");
		jogo3.Exibir();
		jogo3.calcularTempoTotal(5);
	}
 
}
