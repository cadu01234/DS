public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Carro carro1 = new Carro();
		Moto moto1 = new Moto();
		
		carro1.setMarca("Ford");
		carro1.setModelo("Ram");
		carro1.setAno(2018);
		carro1.setCor("Vermelho");
		carro1.setQuantidadePortas(4);
		
		moto1.setMarca("Ronda");
		moto1.setModelo("160");
		moto1.setAno(2024);
		moto1.setCor("Preta");
		moto1.setCilindrada(1000);
		
		System.out.println("Carro:");
		carro1.Imprime();
		System.out.println();
		System.out.println("Moto:");
		moto1.Imprime();

	}

}
