package services;

import java.util.List;
import java.util.ArrayList;

import root.Transacao;

import services.TransacaoService;

class ContaCorrenteService {
    private List<Transacao> transacoes; // {transacao1, transacao2, transacao3, ...}
    public List<Transacao> transacoesInvalidas = new ArrayList<>();      

    // Método que viola o SRP, pois filtrar transações não é responsabilidade de ContaCorrente
    public List<Transacao> filtrarTransacoesInvalidas() {
    
        for (Transacao transacao : transacoes) {
            if (TransacaoService.verificarFraude()) {
                transacoesInvalidas.add(transacao);
            }
        }
        
        return transacoesInvalidas;
    }
}

