import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;

public class Persistencia {
    private String filePath;
    private Post postagem;

    public void saveToFile() {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("ID: " + postagem.getId() + "\n");
            writer.write("Texto: " + postagem.getTexto() + "\n");
            writer.write("Autor: " + autor.getNome() + "\n");
            writer.write("Data: " + data + "\n");
            writer.write("Quantidade de Likes: " + quantidadeDeLikes + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
