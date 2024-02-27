
public class ex6 {
	public static void main(String[] args) {
		final int TAM = 6;
		int i, a[];
		a = new  int[TAM];
		for (i=0; i<TAM; i++) {
			a[i] = 3;
			i++;
			a[i] = 2;
			i++;
			a[i] = 8;
			i++;
			a[i] = 7;
			i++;
			a[i] = 5;
			i++;
			a[i] = 4;
			i++;
		}
		for(i=0; i<TAM; i++) {
			System.out.println("Na posição " +(i)+ " teremos " +a[i]+ " ");
		}
	}

}
