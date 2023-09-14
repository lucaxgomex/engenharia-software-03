import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numerosInt = {64, 34, 25, 12, 22, 11, 90};
        double[] numerosDouble = {5.6, 13.2, 6.7, 2.2};

        Ordenador ord = new Ordenador();

        Embaralhador emb = new Embaralhador();

        CalculadoraEstatistica media = new CalculadoraEstatistica();

        ManipuladorDeTexto texto = new ManipuladorDeTexto();

        ord.ordenar(numerosInt);
        emb.embaralhar(numerosInt);

        System.out.println(texto.removerEspacos("Lorem ipsum dolor sit amet, consectetur adipiscing elit"));     
        System.out.println(Arrays.toString(texto.quebrarEmPalavras("Lorem ipsum dolor sit amet, consectetur adipiscing elit")));   

        System.out.println("Media => " + media.calcularMedia(numerosDouble));
        System.out.println("Desvio Padrao => " + media.calcularDesvioPadrao(numerosDouble));
    }
}


