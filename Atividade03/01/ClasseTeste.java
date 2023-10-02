class ClasseTeste {
    public static void main(String[] args) {
        //Autor autor = new Autor(1, "Lucas Gomes", "lucasgomes@email.com");
        //Post post = new Post(1, "Meu primeiro post!", autor);       
        RepositorioDePosts repo = new RepositorioDePosts("/home/pr3t3nd3r/Documents/engenharia-software-03/Atividade03/01/repo.txt");
       
        repo.saveToFile();
    }
}
