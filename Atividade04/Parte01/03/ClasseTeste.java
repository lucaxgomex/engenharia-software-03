public class ClasseTeste {
    public static void main(String[] args) {
        Retangulo retangulo = new Quadrado();
        retangulo.setLargura(5);
        retangulo.setAltura(10);

        System.out.println("Area: " + retangulo.calcularArea());
    }
}

