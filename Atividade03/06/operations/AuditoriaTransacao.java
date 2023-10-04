package operations;

import java.util.List;
import data.TipoTransacao;
import root.Transacao;
import interfaceexec.Execucao;

public class AuditoriaTransacao implements Execucao<Transacao> {
    @Override
    public void executar(List<Transacao> transacoes) {
        for (Transacao transacao : transacoes) {
            int idTransacao = transacao.getId();
            double valorTransacao = transacao.getValor();
            TipoTransacao tipoTransacao = transacao.getTipo();

            // Verificar transações suspeitas
            if (valorTransacao > 10000 && tipoTransacao == TipoTransacao.DEBITO) {
                System.out.println("Alerta: Transação " + idTransacao + " é um saque muito grande.");
            }
        }
    }
}


