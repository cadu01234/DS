public class ClientePremium extends Cliente  {
 
	@Override

	public double calculaDesconto (double desconto) {
		desconto = getValorPedido()*15/100;
		super.setValorPromocional(getValorPedido() - desconto);
		return getValorPromocional();
	}
}
