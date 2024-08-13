public class Retangulo {
	private double largura;
	private double altura;

	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}

	public String forma() {
		double area = this.largura * this.altura;
		return "A área do Retângulo é " + area;
	}
}
