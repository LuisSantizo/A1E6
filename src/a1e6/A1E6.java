import java.util.Random;
import java.util.Scanner;

public class A1E6 {

    public static void main(String[] args) {
        
        //definir variables
        int NumeroAzar;
        double Porcentaje;
        double NumeroAumentado;

        //definir el numero al azar
        Random NumeRandom = new Random();
        NumeroAzar = NumeRandom.nextInt(200)+1;
        
        System.out.println("El algoritmo genero el numero " + NumeroAzar);

        //hacer las operaciones
        Porcentaje = NumeroAzar * 0.30;
        NumeroAumentado = NumeroAzar + Porcentaje;

        System.out.println(NumeroAzar + " aumentado en un 30% es " + NumeroAumentado);
    }

}
