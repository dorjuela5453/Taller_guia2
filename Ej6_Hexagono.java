import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ej6_Hexagono {

    public static void main (String []args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(">> Area de un hexagono");

        System.out.println("Ingrese el Lado: ");
        double l = Integer.parseInt(in.readLine());
        System.out.println("Ingrese el apotema: ");
        double a = Integer.parseInt(in.readLine());
        double area = 3 * l * a;

        System.out.println("El area del hexagono es de: " + area);

    }

}
