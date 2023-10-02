import java.util.List;

interface Validacao {
    void validarValores(List<Double> campoValores) throws IllegalArgumentException;
    void validarCpf(String campoString) throws IllegalArgumentException;
}
