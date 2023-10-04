import java.util.List;

public class ValidacaoImpostoDeRenda {
    

    public static void validarCPF(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            throw new IllegalArgumentException("O CPF deve ter 11 caracteres.");
        }
        System.out.println("O CPF esta valido");
    }

    public static void validarRendimentos(List<Double> rendimentos) {
        if (rendimentos == null || rendimentos.size() > 5) {
            throw new IllegalArgumentException("A lista de rendimentos deve conter no máximo 5 valores.");
        }
        for (Double rendimento : rendimentos) {
            if (rendimento < 0) {
                throw new IllegalArgumentException("Os rendimentos não podem ser negativos.");
            }
        }
        System.out.println("O valor do rendimento esta valido");
    }

    public static void validarDespesas(List<Double> despesas) {
        for (Double despesa : despesas) {
            if (despesa < 0) {
                throw new IllegalArgumentException("As despesas não podem ser negativas.");
            }
            System.out.println("O valor da despesa esta valido");
        }
    }
}