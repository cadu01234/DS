
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora Calculadora01 = new Calculadora("CalculadoraZK");
		
		Calculadora01.soma(5, 3);
        System.out.println(Calculadora01.getResultado());

        Calculadora01.soma(2.5, 3.7);
        System.out.println(Calculadora01.getResultado());

        Calculadora01.soma(1, 2, 3, 4, 5);
        System.out.println(Calculadora01.getResultado());

        Calculadora01.subtracao(10, 4);
        System.out.println(Calculadora01.getResultado());

        Calculadora01.subtracao(8.9, 3.2);
        System.out.println(Calculadora01.getResultado());

        Calculadora01.subtracao(10, 2, 3);
        System.out.println(Calculadora01.getResultado());
   
	}

}
