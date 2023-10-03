package services;

import root.Transacao;
import java.util.List;

public class TransacaoService {
    private Transacao transacao;
    private List<Transacao> transacoesRecentes;
    private boolean isFraudulenta;

    // Método que viola o SRP, pois verificar fraude não é responsabilidade da transação
    public boolean verificarFraude() {
        double media = calcularMedia(transacoesRecentes);

        if (transacao.getValor() > 2 * media) {
            this.isFraudulenta = true; // A transação é considerada fraudulenta
        }

        this.isFraudulenta = false; // A transação é considerada legítima
        return isFraudulenta;
    }    

    private double calcularMedia(List<Transacao> transacoes) {
        double total = 0;
        
        for (Transacao transacao : transacoes) {
            total += transacao.getValor();
        }
        return total / transacoes.size();
    }

} 
    
