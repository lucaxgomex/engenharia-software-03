package root;

import java.util.List;

public class ContaCorrente {
    private String numero;
    private double saldo;
    //private List<Transacao> transacoes;
    
    public ContaCorrente(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
        //this.transacoes = transacoes;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
