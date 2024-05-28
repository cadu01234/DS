public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
			Cliente cliente = new Cliente();
			ClientePremium clientePremium = new ClientePremium();
			
			cliente.setNome("João");
			cliente.setIdade(16);
			cliente.setEndereco("Rua dos Pedreiros n°110");
			cliente.setValorPedido(500);
			cliente.calculaDesconto();
			
			clientePremium.setNome("Thais");
			clientePremium.setIdade(60);
			clientePremium.setEndereco("Rua dos Prazeres");
			clientePremium.setValorPedido(2000);
			clientePremium.calculaDesconto();
			
			System.out.println("O pedido foi de : " +cliente.getValorPedido()+ "$ e agora com desconto de cliente normal é de : " +cliente.getValorPromocional() +"$");
			System.out.println("O pedido foi de : " +clientePremium.getValorPedido()+ "$ e agora com desconto de cliente premium é de : " +clientePremium.getValorPromocional() +"$");
	}
 
}
