public class ContaPoupanca {
    private ContaBancaria contaBase;

    public ContaPoupanca(double saldoInicial) {
        this.contaBase = new ContaBancaria(saldoInicial);
    }

    public void sacar(double valor) {
        if (valor > 1000) {
            throw new RuntimeException("Não pode sacar mais de 1000 em uma poupança");
        }

        contaBase.sacar(valor);
    }

    public double getSaldo() {
        return contaBase.getSaldo();
    }
}

