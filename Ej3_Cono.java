import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ej3_Cono {

    public static void main (String []args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("> Ingrese la altura del cono:");
        double h = Integer.parseInt(in.readLine());
        System.out.println("> Ingrese el radio de la base del cono: ");
        double r = Integer.parseInt(in.readLine());

        double volumen = 1 / 3.0 * Math.PI * r * r * h;
        System.out.println("El volumen del cono es: " + volumen);
    }

}
