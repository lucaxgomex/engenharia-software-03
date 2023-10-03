package tests;
import root.RepositorioDePosts;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; 

class ClasseTeste {
    public static void main(String[] args) {
        try {
            RepositorioDePosts repo = new RepositorioDePosts("01/tests/files/repo.txt");
            repo.saveToFile();
            
            File myObj = new File("repo.txt");            
            
            Scanner reader = new Scanner(myObj);
            
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro de Execucao!!!");
            e.printStackTrace();
        }
    }
}
