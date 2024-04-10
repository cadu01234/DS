public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imc pessoa1 = new Imc();
		
		pessoa1.getNome();
		pessoa1.setNome("Thais explodindo");
		
		pessoa1.getIdade();
		pessoa1.setIdade(16);
		
		pessoa1.getPeso();
		pessoa1.setPeso(100);
		
		pessoa1.getAltura();
		pessoa1.setAltura(190);
		
		System.out.println("IMC de " + pessoa1.getNome() + ": " + pessoa1.calcularImc());
	}

}
