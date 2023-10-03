package services;

import root.Investimento;
import data.TipoInvestimento;

class InvestimentoService {
    private String statusRisco;
    private Investimento investimento;

    // Método que viola o SRP, pois avaliar risco não é responsabilidade do investimento
    public String avaliarRisco() {
        TipoInvestimento tipoInvestimento = investimento.getTipo();

        if (tipoInvestimento == TipoInvestimento.RENDA_FIXA) {
            statusRisco = "Baixo risco";
        } else if (tipoInvestimento == TipoInvestimento.RENDA_VARIAVEL) {
            statusRisco = "Moderado risco";
        } else {
            statusRisco = "Tipo de investimento desconhecido";
        }

        return statusRisco;
    }
}
