public class Main {
    public static void main(String[] args) {
        
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setNome("João da Silva");
        contaCorrente.setCPF("123.456.789-00");
        contaCorrente.setNumeroConta("001");
        contaCorrente.setSaldo(1000.0);
        contaCorrente.setTarifaMensal(15.0);
        
        
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNome("Maria Oliveira");
        contaPoupanca.setCPF("987.654.321-00");
        contaPoupanca.setNumeroConta("002");
        contaPoupanca.setSaldo(5000.0);
        contaPoupanca.setPercentualRendimento(0.05);
        
        
        Lucros lucros = new Lucros();
        
        
        double depositoCorrente = 500.0;
        double saquePoupanca = 200.0;
        
        
        double saldoAtualCorrente = contaCorrente.depositar(depositoCorrente);
        contaCorrente.setSaldo(saldoAtualCorrente);
        contaCorrente.ImprimirSaldo();
        
        
        double saldoAtualPoupanca = contaPoupanca.getSaldo() - saquePoupanca;
        contaPoupanca.setSaldo(saldoAtualPoupanca);
        contaPoupanca.setPercentualRendimento(contaPoupanca.setPercentualRendimento());
        double saldoAtualizado = contaPoupanca.Atualizarsaldo();
        contaPoupanca.setSaldo(saldoAtualizado);
        contaPoupanca.ImprimirSaldo();
        
        
        lucros.registra(contaCorrente, depositoCorrente);
        lucros.registra(contaPoupanca, -saquePoupanca);
        
       
        System.out.println("Total de lucros registrados: " + lucros.getSoma());
    }
}
