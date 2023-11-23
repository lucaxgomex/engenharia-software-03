import java.io.*;

public class ClasseTeste {
    public static void main(String[] args) {
        Persistencia persistenciaComJSON = new Persistencia(new PersistenciaComJSON());
        Persistencia persistenciaSemJSON = new Persistencia(new PersistenciaSemJSON());

        try {
            persistenciaComJSON.salvar("{ \"nome\": \"Lucas\", \"idade\": 19 }, \"curso\": ADS }, \"professor\": ely }", "info.json");
            persistenciaSemJSON.salvar("Dados simples", "info.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

