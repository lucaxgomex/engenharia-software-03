import root.Transacao;

class ContaCorrenteService {
    private List<Transacao> transacoes; // {transacao1, transacao2, transacao3, ...}
    
    
    // Método que viola o SRP, pois filtrar transações não é responsabilidade de ContaCorrente
    public List<Transacao> filtrarTransacoesInvalidas() {
        // ... implemente a lógica para filtrar transações inválidas

        private List<Transacao> transacoesInvalidas;
        for (List transacao : transacoes) {
            transacoesInvalidas.add(transacao);
        }
        
        return transacoesInvalidas;
    }
}

