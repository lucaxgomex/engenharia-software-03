import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;

public class RepositorioDePosts {
    private String filePath;
    //private Post post;
    //private Autor autor;

    Autor autor = new Autor(1, "Lucas Gomes", "lucasgomes@email.com");
    Post post = new Post(1, "Meu primeiro post!", autor);       

    public RepositorioDePosts(String filePath) {
        this.filePath = filePath;
    }

    public void saveToFile() {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("ID: " + post.getId() + "\n");
            writer.write("Texto: " + post.getTexto() + "\n");
            writer.write("Autor: " + autor.getNome() + "\n");
            writer.write("Data: " + post.getData() + "\n");
            writer.write("Quantidade de Likes: " + post.getQuantidadeDeLikes() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
