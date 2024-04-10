import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        oculos oculos1 = new oculos();
        System.out.println("Qual é o nome do óculos?");
        String nome = in.nextLine();
        oculos1.setNome(nome);
    
        System.out.println("Qual é o preço de custo de " + nome + "?");
        double precoCusto = in.nextDouble();
        oculos1.setprecoCusto(precoCusto);
        
        System.out.println("Qual vai ser o preço de venda de " + nome + "?");
        double precoVenda = in.nextDouble();
        oculos1.setprecoVenda(precoVenda);
        
        oculos1.calcularMargemLucro();
        
        DecimalFormat df = new DecimalFormat("##");
        String margemFormatada = df.format(oculos1.getmargemLucroPorcentagem());
        
        System.out.println("A Margem de lucro de " + oculos1.getNome() + " é : " + margemFormatada + "%");
    }
}
