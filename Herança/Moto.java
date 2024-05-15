public class Moto extends Veiculo { 
	private int cilindradas;

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	@Override
	
	public void Imprime() {
		System.out.print("Marca: " +this.getMarca());
		System.out.print(" Modelo: " +this.getModelo());
		System.out.print(" Ano: " +this.getAno());
		System.out.print(" Cor: " +this.getCor());
		System.out.print(" Cilindradas: " +this.cilindradas();
	}

}
