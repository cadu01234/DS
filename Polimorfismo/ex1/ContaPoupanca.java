public class ContaPoupanca extends Conta {
	private double percentualRendimento;

	public double getPercentualRendimento() {
		return percentualRendimento;
	}

	public void setPercentualRendimento(double percentualRendimento) {
		this.percentualRendimento = percentualRendimento;
	}
	
	public double Atualizarsaldo () {
		return getSaldo() * 0.1;
	}
	
	
	
}
