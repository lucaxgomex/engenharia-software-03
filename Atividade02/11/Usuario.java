import java.util.List;

public class Usuario {
    private List<Conteudo> posts;
    private List<Conteudo> comentarios;

    public void criarPost(String conteudo) {
        Conteudo novoPost = new Conteudo(conteudo);
        posts.add(novoPost);
    }

    public void criarPost(String conteudo) {
        Conteudo novoComentario = new Conteudo(conteudo);
        comentarios.add(novoComentario);
    }
}
