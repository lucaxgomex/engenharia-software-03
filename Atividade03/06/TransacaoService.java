class TransacaoService {
    private Transacao transacao;
    private boolean isFraudulenta;

    // Método que viola o SRP, pois verificar fraude não é responsabilidade da transação
    public boolean verificarFraude() {
        // ... implemente a lógica para verificar se a transação é fraudulenta
        
        return isFraudulenta;
    }
} 
    
