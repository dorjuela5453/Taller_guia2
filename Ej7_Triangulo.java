import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ej7_Triangulo {

    public static void main (String []args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(">> Semiperimetro - Area - Circumradius");

        System.out.println("Ingrese el Lado a: ");
        double a = Integer.parseInt(in.readLine());
        System.out.println("Ingrese el Lado b: ");
        double b = Integer.parseInt(in.readLine());
        System.out.println("Ingrese el Lado c: ");
        double c = Integer.parseInt(in.readLine());

        double semiperimetro = (a + b + c) / 2;
        double area = Math.sqrt(semiperimetro*(semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));
        double circumradius = a * b * c / (4 * Math.PI * semiperimetro);

        System.out.println("Semiperimetro : "  + semiperimetro);
        System.out.println("Area : "  + area);
        System.out.println("Circumradius : "  + circumradius);

    }

}
