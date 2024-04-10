
public class oculos {
	private String nome;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;

	String getNome() {
		return this.nome;
	}
	void setNome(String nome) {
		 this.nome = nome;
	}
	double getprecoCusto() {
		return precoCusto;
	}
	void setprecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	double getprecoVenda() {
		return precoVenda;
	}
 
	void setprecoVenda(double precoVenda) {
		if (precoVenda < precoCusto) {
			System.out.println("Este produto está dando prejuizo");
		}
		this.precoVenda = precoVenda;
	}
	 double calcularMargemLucro() {
		this.margemLucro = (precoVenda-precoCusto);
		return margemLucro;
	}
	 double getmargemLucroPorcentagem() {
		 double margemLucroPorcentagem = (margemLucro*100);
		 return margemLucroPorcentagem;
	 }
 
}
