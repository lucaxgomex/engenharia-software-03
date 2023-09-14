import java.util.Random;
import java.util.Arrays;

public class Embaralhador {
    public void embaralhar(int[] array) {
        Random rand = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);

            // Troca os elementos
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println("Valor embaralhado => " + Arrays.toString(array));
    }
}
