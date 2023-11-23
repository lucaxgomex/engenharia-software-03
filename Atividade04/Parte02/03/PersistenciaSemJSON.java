import java.io.*;

class PersistenciaSemJSON implements PersistenciaInterface {
    @Override
    public void salvar(String dados, String arquivo) throws IOException {
        try (FileWriter writer = new FileWriter(arquivo)) {
            writer.write(dados);
        }
    }
}
