package auditoria;

import root.*;
import java.util.List;

import data.TipoInvestimento;
import data.TipoTransacao;

import java.util.ArrayList;


class AuditoriaFinanceiraService {
    private List<ContaCorrente> contas; 
    private List<Investimento> investimentos; 
    private List<Transacao> transacoes;

    public ArrayList<Object> auditaveis = new ArrayList <>();
    
    auditaveis.add(contas);
    auditaveis.add(investimentos);
    auditaveis.add(transacoes);
    
    // ... (código existente)
    public void executar() {
    }
    public void auditoriaTransacoes(List<Transacao> transacoes) {
        for (Transacao transacao : transacoes) {
            int idTransacao = transacao.getId();
            double valorTransacao = transacao.getValor();
            TipoTransacao tipoTransacao = transacao.getTipo();

            // Verificar transações suspeitas
            if (valorTransacao > 10000 && tipoTransacao == TipoTransacao.DEBITO) {
                System.out.println("Alerta: Transação " + idTransacao + " é um saque muito grande.");
            }
        }
    }
}
