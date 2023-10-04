package operations;

import java.util.List;
import root.ContaCorrente;
import interfaceexec.Execucao;

public class AuditoriaContaCorrente implements Execucao<ContaCorrente> {
    @Override
    public void executar(List<ContaCorrente> contas) {
        for (ContaCorrente conta : contas) {
            String numeroConta = conta.getNumero();
            double saldo = conta.getSaldo();

            // Verificar se o saldo é negativo
            if (saldo < 0) {
                System.out.println("Alerta: Conta " + numeroConta + " possui saldo negativo.");
            }
        }
    }
}
