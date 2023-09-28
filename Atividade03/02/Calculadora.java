import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    private final double a;
    private final double b;
    private List<Operacao> operacaos;

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public List<Double> calcular(List<String> operacoes) {
        List<Double> resultados = new ArrayList<>();
        for (String operacao: operacoes) {
            switch (operacao) {
                case "soma":
                    resultados.add(this.a + this.b);
                    break;
                case "subtracao":
                    resultados.add(this.a - this.b);
                    break;
                // case "multiplicacao":
                // resultados.add(this.a * this.b);
                // break;
                default:
                    throw new IllegalArgumentException("Operação não suportada: " + operacao);
            }
        }
        return resultados;
    }

    public static void main(String[] args) {
        Calculadora op = new Calculadora(3, 5);
    }
}

//Calculadora clc = Calculadora(3.0, 2.0);