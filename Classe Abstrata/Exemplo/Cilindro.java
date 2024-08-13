[terça-feira 08:12] JOAO PEDRO PEREIRA RAMOS
public class Cilindro {

	private Circulo base;
	private double altura;
	public Cilindro (Circulo b, double a) {

		base = b;
		altura = a;
	}
	public String forma() {
		return "Cilindro: base =" + base.forma() + "; altura = " + altura;
	}
	public void mostrar() {
		System.out.println(forma());
	}
}
[terça-feira 08:12] JOAO PEDRO PEREIRA RAMOS
public class Circulo {
	private Ponto centro;
	private double raio;
	public Circulo(Ponto p, double r) {
		centro = p;
		raio= r;
	}
	public String forma() {
		return "Circulo: centro = " + centro.forma() + "; raio = " + raio;
	}
	public void mostrar() {
		System.out.println(forma());
	}
}
 
