class Transacao {
    private int id;
    private double valor;
    private TipoTransacao tipo;

    public Transacao(int id, double valor, TipoTransacao tipo) {
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

    public TipoTransacao getTipo() {
        return this.tipo;
    }
}
