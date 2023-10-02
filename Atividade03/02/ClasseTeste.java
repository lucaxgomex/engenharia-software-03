import java.util.ArrayList;
import java.util.List;

public class ClasseTeste {
    public static void main(String[] args) {
        double a = 10;
        double b = 5;

        List<Operacao> operacoes = new ArrayList<>();
        operacoes.add(new OperacaoSoma());
        operacoes.add(new OperacaoSubtracao());
        //operacoes.add(new OperacaoMultiplicacao());

        Calculadora calculadora = new Calculadora(a, b);
        List<Double> resultados = calculadora.calcular(operacoes);

        for (Double resultado : resultados) {
            System.out.println("Resultado: " + resultado);
        }
    }
}

