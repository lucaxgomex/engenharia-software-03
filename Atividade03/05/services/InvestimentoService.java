package services;

import root.Investimento;

class InvestimentoService {
    private String statusRisco;
    private Investimento investimento;

    // Método que viola o SRP, pois avaliar risco não é responsabilidade do investimento
    public String avaliarRisco() {
        // ... implemente a lógica para avaliar o risco do investimento
        return statusRisco;
    }
}
