public class Lucros {
    private double soma = 0;

    public void setSoma(double soma) {
		this.soma = soma;
	}

	public void registra(Conta c, double valor) {
        this.soma += valor;
        System.out.println("Lucro registrado para a conta: " + c.getNumeroConta() + ", valor: " + valor);
    }

    public double getSoma() {
        return this.soma;
    }
}
