package tests;
import java.util.ArrayList;
import java.util.List;

import interfaces.Operacao;
import operations.*;
import root.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        double a = 10;
        double b = 5;

        List<Operacao> operacoes = new ArrayList<>();
        operacoes.add(new OperacaoSoma());
        operacoes.add(new OperacaoSubtracao());
        operacoes.add(new OperacaoMultiplicacao());
        operacoes.add(new OperacaoDivisao());

        Calculadora calculadora = new Calculadora(a, b);
        List<Double> resultados = calculadora.calcular(operacoes);

        for (Double resultado : resultados) {
            System.out.println("Resultado: " + resultado);
        }
    }
}

