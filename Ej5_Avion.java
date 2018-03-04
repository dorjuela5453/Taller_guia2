import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Ej5_Avion {

    public static void main (String []args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(">> Avion");
        int clase_1, clase_2, clase_3;

        System.out.println("Cantidad de pasajeros primera clase:");
        clase_1 = Integer.parseInt(in.readLine());

        System.out.println("Cantidad de pasajeros de segunda clase:");
        clase_2 = Integer.parseInt(in.readLine());

        System.out.println("Cantidad de pasajeros de tercera clase:");
        clase_3 = Integer.parseInt(in.readLine());

        int total = clase_1 * 500000 + clase_2 * 200000 + clase_3 * 125000;
        System.out.println("> Costo total de los vuelos: " + total);

    }

}
