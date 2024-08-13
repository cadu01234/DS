public class Losango {
	private double diagonalMaior;
	private double diagonalMenor;

	public Losango(double dMaior, double dMenor) {
		this.diagonalMaior = dMaior;
		this.diagonalMenor = dMenor;
	}

	public String forma() {
		double area = (this.diagonalMaior * this.diagonalMenor) / 2;
		return "A área do Losango é " + area;
	}
}
