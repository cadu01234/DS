import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> resultados = new ArrayList<>();
        
        System.out.println("Quantas figuras você quer calcular a área?");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Qual figura?");
            System.out.println("1 - Retangulo");
            System.out.println("2 - Trapezio");
            System.out.println("3 - Losango");
            int resp = in.nextInt();

            if (resp == 1) {
                System.out.println("Qual a largura do retangulo?");
                double largura = in.nextDouble();
                System.out.println("Qual é a altura do retangulo?");
                double altura = in.nextDouble();
                Retangulo retangulo = new Retangulo(largura, altura);
                resultados.add(retangulo.forma());

            } else if (resp == 2) {
                System.out.println("Qual a base menor do trapezio?");
                double baseMenor = in.nextDouble();
                System.out.println("Qual a base maior do trapezio?");
                double baseMaior = in.nextDouble();
                System.out.println("Qual a altura do trapezio?");
                double altura = in.nextDouble();
                Trapezio trapezio = new Trapezio(baseMenor, baseMaior, altura);
                resultados.add(trapezio.forma());

            } else if (resp == 3) {
                System.out.println("Qual a diagonal maior do losango?");
                double diagonalMaior = in.nextDouble();
                System.out.println("Qual a diagonal menor do losango?");
                double diagonalMenor = in.nextDouble();
                Losango losango = new Losango(diagonalMaior, diagonalMenor);
                resultados.add(losango.forma());
            } 
        }
        System.out.println("Resultados:");
        for (String resultado : resultados) {
            System.out.println(resultado);
        }

        in.close();
    }
}
