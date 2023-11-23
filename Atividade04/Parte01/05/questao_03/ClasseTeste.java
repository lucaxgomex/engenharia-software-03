public class ClasseTeste {
    public static void main(String[] args) {
        Forma forma = new Quadrado();
        ((Quadrado) forma).setLado(5); 
        
        System.out.println("Área: " + forma.calcularArea());
    }
}

