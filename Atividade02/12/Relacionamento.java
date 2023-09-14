public class Relacionamento {
    private Usuario iniciador;
    private Usuario receptor;
    private TipoRelacionamento tipo;

    public Relacionamento(Usuario iniciador, Usuario receptor, TipoRelacionamento tipo) {
        this.iniciador = iniciador;
        this.receptor = receptor;
        this.tipo = tipo;
    }

    public Usuario getIniciador() {
        return iniciador;
    }

    public Usuario getReceptor() {
        return receptor;
    }

    public TipoRelacionamento getTipo() {
        return tipo;
    }
}
