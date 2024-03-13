
public class MainFuncionario {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Funcionario funcionario1 = new Funcionario();
		funcionario1.Nome = "Pedro";
		funcionario1.SalarioBruto = 1500;
		funcionario1.Imposto = 500;	
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.Nome = "Vagner";
		funcionario2.SalarioBruto = 750;
		funcionario2.Imposto = 250;
		
		System.out.println(funcionario1.SalarioLiquido());
		System.out.println(funcionario2.SalarioLiquido());
		
		System.out.println(funcionario1.AumentaSalario());
		System.out.println(funcionario2.AumentaSalario());
	}
}
