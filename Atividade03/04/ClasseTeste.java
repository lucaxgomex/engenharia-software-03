import java.util.ArrayList;
import java.util.List;

public class ClasseTeste {
    public static void main(String[] args) {
        // Criando listas de rendimentos e despesas
        List<Double> rendimentos = new ArrayList<>();
        rendimentos.add(5000.0);
        //rendimentos.add(3000.0);

        List<Double> despesas = new ArrayList<>();
        despesas.add(1000.0);
        //despesas.add(500.0);

        List<ValidacaoImpostoDeRenda.Validacao> validacoes = new ArrayList<>();
        validacoes.add(new ValidacaoImpostoDeRenda.validaCPFTamanho());
        validacoes.add(new ValidacaoImpostoDeRenda.validaRendimentos());
        validacoes.add(new ValidacaoImpostoDeRenda.validaDespesas());

        // Criando um objeto ImpostoDeRenda
        ImpostoDeRenda ir = new ImpostoDeRenda("12345678901", rendimentos, despesas);
        ir.validar();
        ir.processar();
    }
}

