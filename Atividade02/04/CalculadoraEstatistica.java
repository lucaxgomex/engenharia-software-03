import java.lang.Math;

public class CalculadoraEstatistica {
    public double calcularMedia(double[] numeros) {
        int arraySize = numeros.length;
        double sum = 0.0;

        for (int i = 0; i < arraySize - 1; i++) {   
            sum += numeros[i];
        }

        return (sum / arraySize);
    }
   
    public double calcularDesvioPadrao(double[] numeros) {
        double media = this.calcularMedia(numeros);
        int arraySize = numeros.length;
        double sigma = 0.0;
        double result = 0.0;

        for (int i = 0; i < arraySize - 1; i++) {
            sigma += Math.pow((numeros[i] - media), 2);
        }              
        
        result = sigma / arraySize;
        return Math.sqrt(result);         
    }
}
