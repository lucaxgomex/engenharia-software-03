package operations;

import java.util.List;
import data.TipoInvestimento;
import root.Investimento;
import interfaceexec.Execucao;

public class AuditoriaInvestimento implements Execucao<Investimento> {
    @Override
    public void executar(List<Investimento> investimentos) {
        for (Investimento investimento : investimentos) {
            int idInvestimento = investimento.getId();
            double valorInvestimento = investimento.getValor();
            TipoInvestimento tipoInvestimento = investimento.getTipo();

            // Verificar se o valor do investimento é muito baixo
            if (valorInvestimento < 1000 && tipoInvestimento == TipoInvestimento.RENDA_VARIAVEL) {
                System.out.println("Alerta: Investimento " + idInvestimento + " possui valor muito baixo para alto risco.");
            }
        }
    }
}
