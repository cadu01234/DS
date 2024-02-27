import java.util.Scanner;
public class ex4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int anoNasc, anoAtual=0, idade=0, s, n, resp=0, i=1;
		do {
			i = i + 1;
			System.out.println("Em que ano estamos?");
			anoAtual = in.nextInt();
			System.out.println("Em que ano você nasceu?");
			anoNasc = in.nextInt();
			idade = anoAtual - anoNasc;
			if (idade>18) {
				System.out.println("A pessoa é maior de idade");
			} else {
				System.out.println("A pessoa é menor de idade");
			}
			System.out.println("Deseja calcular a idade de mais uma pessoa? (1-s ou 2-n)");
			resp = in.nextInt();
		} while (resp==1);
	}

}
