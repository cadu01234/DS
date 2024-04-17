public class Calculadora {
    private String nome;
    private double resultado;

    public Calculadora(String nome) {
        this.nome = nome;
    }

    public double getResultado() {
        return resultado;
    }

    // Soma
    public void soma(int valor1, int valor2) {
        resultado = valor1 + valor2;
    }

    public void soma(double valor1, double valor2) {
        resultado = valor1 + valor2;
    }

    public void soma(double... valores) {
        for (double valor : valores) {
            resultado += valor;
        }
    }

    // Subtração
    public void subtracao(int valor1, int valor2) {
        resultado = valor1 - valor2;
    }

    public void subtracao(double valor1, double valor2) {
        resultado = valor1 - valor2;
    }

    public void subtracao(double... valores) {
        resultado = valores[0];
        for (int i = 1; i < valores.length; i++) {
            resultado -= valores[i];
        }
    }
}
