import java.util.Scanner;
public class Funcionario {
	Scanner in = new Scanner(System.in);
		String Nome;
		double SalarioBruto;
		double Imposto;
		double percentual;
		
		
		double SalarioLiquido() {
			double Salario = SalarioBruto - Imposto;
			return Salario;
		}
		
		double AumentaSalario() {
			System.out.println("Quantos porcento a mais você gostario de receber?");
			percentual = in.nextDouble();
			double SalarioAumentado = SalarioBruto + (percentual * SalarioBruto);
			return SalarioAumentado;
		}
}
