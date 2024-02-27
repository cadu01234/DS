import java.util.*;
public class ex1 {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int num;
	System.out.println("Diga o número");
	num = in.nextInt();
	if (num<0) {
		System.out.println("O número é negativo");
	}else {
		System.out.println("O número é positivo");
	}
	
}
}
