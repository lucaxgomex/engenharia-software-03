package services;

import java.util.List;
import java.util.ArrayList;

import root.Transacao;

class ContaCorrenteService {
    private List<Transacao> transacoes; // {transacao1, transacao2, transacao3, ...}
    public List<Transacao> transacoesInvalidas = new ArrayList<>();      

    private TransacaoService transacaoservice = new TransacaoService();

    // Método que viola o SRP, pois filtrar transações não é responsabilidade de ContaCorrente
    public List<Transacao> filtrarTransacoesInvalidas() {
        for (Transacao transacao : transacoes) {
            if (transacaoservice.verificarFraude()) {
                transacoesInvalidas.add(transacao);
            }
        }
        
        return transacoesInvalidas;
    }
}