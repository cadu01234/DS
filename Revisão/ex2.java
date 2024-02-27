import java.util.*;
public class ex2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double numero;
		System.out.println("Informe o número");
		numero = in.nextDouble();
		if (numero%2 == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é impar");
		}
	}
}
