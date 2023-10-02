package tests;
import root.RepositorioDePosts;

class ClasseTeste {
    public static void main(String[] args) {
        //Autor autor = new Autor(1, "Lucas Gomes", "lucasgomes@email.com");
        //Post post = new Post(1, "Meu primeiro post!", autor);       
        RepositorioDePosts repo = new RepositorioDePosts("01/tests/repo.txt");
        
        System.out.println("Valores salvos com sucesso!");
        repo.saveToFile();
    }
}
