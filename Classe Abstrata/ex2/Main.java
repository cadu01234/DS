import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os dados do primeiro carro:");
        System.out.print("Modelo: ");
        String modeloCarro1 = scanner.nextLine();
        System.out.print("Valor da Tabela: ");
        double valorCarro1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Cor: ");
        String corCarro1 = scanner.nextLine();
        System.out.print("Combustível: ");
        String combustivelCarro1 = scanner.nextLine();


        System.out.println("Digite os dados do segundo carro:");
        System.out.print("Modelo: ");
        String modeloCarro2 = scanner.nextLine();
        System.out.print("Valor da Tabela: ");
        double valorCarro2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Cor: ");
        String corCarro2 = scanner.nextLine();
        System.out.print("Combustível: ");
        String combustivelCarro2 = scanner.nextLine();

        System.out.println("Digite os dados da primeira moto:");
        System.out.print("Modelo: ");
        String modeloMoto1 = scanner.nextLine();
        System.out.print("Valor da Tabela: ");
        double valorMoto1 = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Cor: ");
        String corMoto1 = scanner.nextLine();
        System.out.print("Combustível: ");
        String combustivelMoto1 = scanner.nextLine();

        System.out.println("Digite os dados da segunda moto:");
        System.out.print("Modelo: ");
        String modeloMoto2 = scanner.nextLine();
        System.out.print("Valor da Tabela: ");
        double valorMoto2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Cor: ");
        String corMoto2 = scanner.nextLine();
        System.out.print("Combustível: ");
        String combustivelMoto2 = scanner.nextLine();

        Carro carro1 = new Carro(modeloCarro1, valorCarro1, corCarro1, combustivelCarro1);
        Carro carro2 = new Carro(modeloCarro2, valorCarro2, corCarro2, combustivelCarro2);
        Moto moto1 = new Moto(modeloMoto1, valorMoto1, corMoto1, combustivelMoto1);
        Moto moto2 = new Moto(modeloMoto2, valorMoto2, corMoto2, combustivelMoto2);

        System.out.println("\nFicha Técnica do Primeiro Carro:");
        carro1.imprimirFicha();

        System.out.println("Ficha Técnica do Segundo Carro:");
        carro2.imprimirFicha();

        System.out.println("Ficha Técnica da Primeira Moto:");
        moto1.imprimirFicha();

        System.out.println("Ficha Técnica da Segunda Moto:");
        moto2.imprimirFicha();

        scanner.close();
    }
}
