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

        if (valor > 2 * media) {
            isFraudulenta = true; // A transação é considerada fraudulenta
        }

        isFraudulenta = false; // A transação é considerada legítima
    }    

    private double calcularMedia(List<Transacao> transacoes) {
        double total = 0;
        
        for (Transacao transacao : transacoes) {
            total += transacao.getValor();
        }
        return total / transacoes.size();
    }

} 
    
