package tests;
import java.util.List;

import root.ContaCorrente;
import root.Investimento;
import root.Transacao;

class AuditoriaFinanceiraService {
    public void executar(List<ContaCorrente> contas, List<Investimento> investimentos, List<Transacao> transacoes) {
        
        // Auditoria para Conta Corrente
        for (ContaCorrente conta : contas) {
            // Lógica de auditoria para Conta Corrente...
        }
        
        // Auditoria para Investimento
        for (Investimento investimento : investimentos) {
            // Lógica de auditoria para Investimento...
        }
        
        // Auditoria para Transacao
        for (Transacao transacao : transacoes) {
            // Lógica de auditoria para Transacao...
        }
    }
}