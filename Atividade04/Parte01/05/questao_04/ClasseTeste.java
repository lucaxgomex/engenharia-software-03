public class ClasseTeste {
    public static void main(String[] args) {
        Ave pinguim = new Pinguim();

        Ave canario = new Canario();
        if (canario instanceof AnimalVoador) {
            ((AnimalVoador) canario).voar(); 
        }

        Ave avestruz = new Avestruz();
 
    }
}

