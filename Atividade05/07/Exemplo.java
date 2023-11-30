public class Exemplo {
    public static void main(String[] args) {
        Teclado teclado = new Teclado();
        Aplicacao aplicacao = new Aplicacao(teclado);
        aplicacao.executar();
    }
}

