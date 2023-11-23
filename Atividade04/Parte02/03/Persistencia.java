import java.io.*;

public class Persistencia {
    private PersistenciaInterface persistenciaInterface;

    public Persistencia(PersistenciaInterface persistenciaInterface) {
        this.persistenciaInterface = persistenciaInterface;
    }

    public void salvar(String dados, String arquivo) throws IOException {
        persistenciaInterface.salvar(dados, arquivo);
    }
}
