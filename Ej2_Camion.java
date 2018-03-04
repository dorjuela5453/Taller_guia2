import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Ej2_Camion{

    public static void main (String []args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // Distancia Bogota Sasaima
        double distancia_total = 78.6;
        double carga_total;
        double capacidad_camion;
        double galones_km;


        System.out.println(">> Viaje Bogota - Sasaima");

        System.out.println("> Ingrese la carga total a transportar");
        carga_total = Double.parseDouble(in.readLine());
        System.out.println("> Ingrese capacidad del camion");
        capacidad_camion = Double.parseDouble(in.readLine());
        System.out.println("> Ingrese el consumo de galones por kilometro");
        galones_km = Double.parseDouble(in.readLine());

        int viajes_necesarios = (int)Math.ceil(carga_total / capacidad_camion);
        System.out.println("> Viajes necesarios: " + viajes_necesarios);

        // Viajes calculados ida y vuelta, por ello se multiplica por 2
        System.out.println("> Consumo total de gasolina: " + (viajes_necesarios * 2 * galones_km * distancia_total) );


    }
}
