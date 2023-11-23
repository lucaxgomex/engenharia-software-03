import java.io.*;

class PersistenciaComJSON implements PersistenciaInterface {
    @Override
    public void salvar(String dados, String arquivo) throws IOException {
        if (!dados.startsWith("{")) {
            throw new IllegalArgumentException("Dados nao esteo em formato JSON.");
        }
        new PersistenciaSemJSON().salvar(dados, arquivo);
    }
}

