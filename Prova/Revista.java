
public class Revista extends Publicacao { 
	
	private int numeroEdicao;
	private String mesPublicacao;
	
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
		System.out.println("Deseja incluir o mês de publicação? (1-s ou 2-n");
}

}
