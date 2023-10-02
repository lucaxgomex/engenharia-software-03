class Transacao {
    private int id;
    private double valor;
    private TipoTransacao tipo;
    private boolean isFraudulenta;

    public Transacao(int id, double valor, TipoTransacao tipo) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
    }

    // Método que viola o SRP, pois verificar fraude não é responsabilidade da
    // transação
    public boolean verificarFraude() {
        // ... implemente a lógica para verificar se a transação é fraudulenta
        if (this.tipo == TipoTransacao.CREDITO) {
            this.isFraudulenta = false;
        }

        this.isFraudulenta = true;
        return isFraudulenta;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }
}