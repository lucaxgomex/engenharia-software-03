public class ManipuladorDeTexto {
    public String removerEspacos(String texto) {
        return texto.replaceAll(" ", "");
    }

    public String[] quebrarEmPalavras(String texto) {
        return texto.split(" ");
    }
}

