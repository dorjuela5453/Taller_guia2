import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ej1_Piramide {


    public static void main (String []args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("> Area de una piramide cuadrangular");

        System.out.println("> Ingrese b el lado del cuadrado superior:");
        int b_sup = Integer.parseInt(in.readLine());
        System.out.println("> Ingrese B el lado del cuadrado inferior:");
        int b_inf = Integer.parseInt(in.readLine());
        System.out.println("> Ingrese h la altura de la piramide:");
        int h = Integer.parseInt(in.readLine());

        double altura_trapecio = Math.sqrt(Math.pow(h, 2) +  Math.pow((b_inf - b_sup) / 2.0, 2));
        double area_tronco = (b_inf + b_sup) / 2 * altura_trapecio * 4;
        double s1 = b_inf * b_inf;
        double s2 = b_sup * b_sup;
        double volumen_piramide = h / 3.0 * (s1 + s2  + Math.sqrt(s1 * s2) );

        System.out.println("Area del tronco de la piramide: " + area_tronco);
        System.out.println("Volumen de la piramide: " + volumen_piramide);

    }


}
