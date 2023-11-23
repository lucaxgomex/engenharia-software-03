import java.io.*;

interface PersistenciaInterface {
    void salvar(String dados, String arquivo) throws IOException;
}
