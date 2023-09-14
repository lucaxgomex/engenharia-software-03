import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private List<Relacionamento> relacionamentos;

    public Usuario() {
        this.relacionamentos = new ArrayList<>();
    }

    public void adicionarAmigo(Usuario amigo) {
        Relacionamento novoRelacionamento = new Relacionamento(this, amigo, TipoRelacionamento.AMIZADE);
        relacionamentos.add(novoRelacionamento);
    }
}
