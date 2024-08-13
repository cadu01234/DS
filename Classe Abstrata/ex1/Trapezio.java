public class Trapezio {
	private static final int B = 0;
	private Trapezio base;
	private Trapezio BASE;
	private double altura;
	public Trapezio(Trapezio b, Trapezio B, double a) {
			base = b;
			BASE = B;
			altura = a;
	}
	public String forma() {
		return "A área do Trapezio é" + ((B+b)*a/2);
	}
}
