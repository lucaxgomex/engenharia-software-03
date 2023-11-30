// Modulo de alto nivel 
class Aplicacao {
    private Teclado teclado;

    public Aplicacao(Teclado teclado) {
        this.teclado = teclado;
    }

    public void executar() {
        String entrada = teclado.lerInput();
        System.out.println("Entrada: " + entrada);
    }
}
