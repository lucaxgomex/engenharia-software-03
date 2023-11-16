class Quadrado implements Forma {
    private int lado;

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public int calcularArea() {
        return lado * lado;
    }
}
