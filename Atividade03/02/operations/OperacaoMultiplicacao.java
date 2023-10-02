package operations;
import interfaces.Operacao;

public class OperacaoMultiplicacao implements Operacao {
    @Override
    public double executar(double a, double b) {
        return a * b;
    }
}

