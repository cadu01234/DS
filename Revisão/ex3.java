import java.util.*;
public class ex3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int senha=2002, i=2002, tentativa;
		while (i == senha) {
			System.out.println("Digite a senha");
			tentativa = in.nextInt();
			if (tentativa == senha) {
				System.out.println("Acesso Permitido");
				i++;
			} else {
				System.out.println("Senha Inválida");
				
			}	
	}
	}
}
