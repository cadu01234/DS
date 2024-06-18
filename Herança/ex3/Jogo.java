import java.util.Scanner;
public class Jogo {
	Scanner in = new Scanner(System.in);
	private String nome;
	private double preco;
	private String distribuidora;
	public Jogo() {
	}
	public Jogo (String nome, double preco, String distribuidora) {
		this.nome = nome;
		this.preco = preco;
		this.distribuidora = distribuidora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome() {
		System.out.println("Qual o nome do jogo?");
		nome = in.nextLine();
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco() {
		System.out.println("Qual o preço do jogo?");
		preco = in.nextDouble();
	}
	public String getDistribuidora() {
		return distribuidora;
	}
	public void setDistribuidora() {
		System.out.println("Qual a Distribuidora?");
		distribuidora = in.nextLine();
		distribuidora = in.nextLine();
	}
	
	
	public void Exibir() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Preço:  R$"+this.getPreco());
		System.out.println("Distribuidora: "+this.getDistribuidora());
	}
}
