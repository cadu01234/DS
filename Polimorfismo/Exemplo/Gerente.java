
public class Gerente extends Funcionario {
	
	private int senha;
	
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		
		if (this.senha == senha) {
			
			return true;
		} else 
			return false;
		
		
	}
	
	// Método que retorna o valor da bonificação do gerente 
	@Override 
	
	public double getBonificacao() {
		
		return super.salario * 0.15;
	}

}