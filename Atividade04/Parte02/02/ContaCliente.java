public class ContaCliente {
    private String nome;
    private String cpf;
    private String endereco;
    private Conta conta;

    public ContaCliente(String numeroConta, double saldoInicial, String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.conta = new Conta(numeroConta, saldoInicial);
    }

    public void depositar(double valor) {
        conta.depositar(valor);
    }

    public void sacar(double valor) {
        conta.sacar(valor);
    }

    public double getSaldo() {
        return conta.getSaldo();
    }
    
    public String getNome() {
        return this.nome;
    }
}
