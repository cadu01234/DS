import java.util.Scanner;
public class Imc {
	Scanner in = new Scanner(System.in);
	String nome;
	int idade;
	double peso;
	int altura;
	double imc;
	int atributo=0;
	
	
	void atributosImc() {
		System.out.println("Informe seu nome");
		nome = in.next();
		System.out.println("Informe sua idade");
		idade = in.nextInt();
		System.out.println("Informe seu peso");
		peso = in.nextDouble();
		System.out.println("Informe sua altura");
		altura = in.nextInt();
		System.out.println("Vamos Calcular seu IMC");
	}
	
	double calcularImc() {
		double imc = peso/(altura*altura);
		if(imc<18.5){
			System.out.println("Você está abaixo do peso");
		} else if(imc<24.9) {
			System.out.println("Seu peso está normal");
		} else if(imc<29.9) {
			System.out.println("Você está com sobrepeso");
		} else if(imc<34.9) {
			System.out.println("Você está com obesidade no grau 1");
		} else if(imc<39.9) {
			System.out.println("Você está com obesidade no grau 2");
		} else {
			System.out.println("Você está com obesidade no grau 3");
		}
		return imc;
	}
}
