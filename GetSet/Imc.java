import java.util.Scanner;
public class Imc {
	Scanner in = new Scanner(System.in);
	private String nome;
	private int idade;
	private double peso;
	private int altura;
	public double imc;
	
	
	
	String getNome() {
		return this.nome;
	}
	
	void setNome(String nome) {
		 this.nome = nome;
	}
	
	int getIdade() {
		return idade;
	}
	
	void setIdade(int idade) {
		this.idade = idade;
	}
	
	double getPeso() {
		return peso;
	}

	void setPeso(double peso) {
		this.peso = peso;
	}
	
	int getAltura() {
		return altura;
	}
	
	void setAltura(int altura) {
		this.altura = altura;
	}
	
	
	
	double calcularImc() {
		double imc = peso/(altura*altura);
		if(imc<0.00185){
			System.out.println("Você está abaixo do peso");
		} else if(imc<0.00249) {
			System.out.println("Seu peso está normal");
		} else if(imc<0.00299) {
			System.out.println("Você está com sobrepeso");
		} else if(imc<0.00349) {
			System.out.println("Você está com obesidade no grau 1");
		} else if(imc<0.00399) {
			System.out.println("Você está com obesidade no grau 2");
		} else {
			System.out.println("Você está com obesidade no grau 3");
		}
		return imc;
	}
}
