import java.util.List;

public class ValidacaoImpostoDeRenda {
    public static void validarCPF(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            throw new IllegalArgumentException("O CPF deve ter 11 caracteres.");
        }
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
    }

    public static void validarDespesas(List<Double> despesas) {
        for (Double despesa : despesas) {
            if (despesa < 0) {
                throw new IllegalArgumentException("As despesas não podem ser negativas.");
            }
        }
    }
    /*
    * 
    private List<Validacao> validacoes;

    public ValidacaoImpostoDeRenda(List<Validacao> validacoes) {
        this.validacoes = validacoes;
    }

    public void validar(List<Double> valores) {
        for (Validacao validacao : validacoes) {
            validacao.validar(valores);
        }
    }

    // Implementações de validações
    static class validaCPFTamanho implements Validacao {
        @Override
        public void validarCpf(String cpf) {
            if (cpf == null || cpf.length() != 11) {
                throw new IllegalArgumentException("O CPF deve ter 11 caracteres.");
            }
        }
    }

    static class validaRendimentos implements Validacao {
        @Override
        public void validar(List<Double> valores) {
            if (rendimentos == null || rendimentos.size() > 5) {
                throw new IllegalArgumentException("A lista de rendimentos deve conter no máximo 5 valores.");
            }

            for (Double rendimento : rendimentos) {
                if (rendimento < 0) {
                    throw new IllegalArgumentException("Os rendimentos não podem ser negativos.");
                }
            }
        }
    }

    static class validaDespesas implements Validacao {
        @Override
        public void validar(List<Double> valores) {
            for (Double despesa : despesas) {
                if (despesa < 0) {
                    throw new IllegalArgumentException("As despesas não podem ser negativas.");
                }
            }
        }
    }
     */

    // Adicione outras validações conforme necessário
}


/*
public class ValidacaoImpostoRenda {
    public static void validarCPF(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            throw new IllegalArgumentException("O CPF deve ter 11 caracteres.");
        }
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
    }

    public static void validarDespesas(List<Double> despesas) {
        for (Double despesa : despesas) {
            if (despesa < 0) {
                throw new IllegalArgumentException("As despesas não podem ser negativas.");
            }
        }
    }
}
*/
