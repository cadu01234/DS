
public class Revista extends Publicacao{
	private int numeroEdicao;
	private String mesPublicacao;
	
	public Revista (String titulo, String autor, int anoPublicacao, int numeroEdicao, String mesPublicacao) {
		super(titulo, autor, anoPublicacao);
		this.numeroEdicao = numeroEdicao;
		this.mesPublicacao = mesPublicacao;
	}
	
	public int getNumeroEdicao() {
		return numeroEdicao;
	}
	public void setNumeroEdicao(int numeroEdicao) {
		this.numeroEdicao = numeroEdicao;
	}
	public String getMesPublicacao() {
		return mesPublicacao;
	}
	public void setMesPublicacao(String mesPublicacao) {
		this.mesPublicacao = mesPublicacao;
	}
	
	@Override
	public void exibirDetalhes() {
		System.out.println(" Edição Número: " + numeroEdicao + " Mês da Publicação: " + mesPublicacao);
	}
	public void exibirDetalhes(boolean temMes) {
		super.exibirDetalhes();
		System.out.println(" Edição Número: " + numeroEdicao);
		if (temMes) {
			System.out.println(" Mês da Publicação: " + mesPublicacao);
		}
	
}
}
