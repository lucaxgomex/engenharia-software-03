class Investimento {
    private int id;
    private double valor;
    private TipoInvestimento tipo;

    public Investimento(int id, double valor, TipoInvestimento tipo) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
    }

    public int getId() {
        return this.id;
    }

    public double getValor() {
        return this.valor;
    }

    public TipoInvestimento getTipo() {
        return this.tipo;
    }
}
