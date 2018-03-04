import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ej2_Melgar {

    public static void main (String []args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(">> Paseo a Melgar");
        System.out.println("Cantidad de estudiantes gordos: ");
        int gordos = Integer.parseInt(in.readLine());
        System.out.println("Cantidad de estudiantes flacos: ");
        int flacos = Integer.parseInt(in.readLine());
        System.out.println("Sillas del bus: ");
        int capacidad_bus = Integer.parseInt(in.readLine());
        System.out.println("Costo del bus: ");
        int costo_bus = Integer.parseInt(in.readLine());
        System.out.println("Costo de la comida: ");
        int costo_comida = Integer.parseInt(in.readLine());
        System.out.println("Costo por habitacion: ");
        int costo_habitacion = Integer.parseInt(in.readLine());
        System.out.println("Capacidad por habitacion: ");
        int capacidad_habitacion = Integer.parseInt(in.readLine());
        System.out.println("Duracion del paseo: ");
        int duracion = Integer.parseInt(in.readLine());


        System.out.println("--------------------------------");
        System.out.println("Buses necesarios: "  + Math.ceil((flacos + gordos * 2.0) / capacidad_bus) );
        double ct_alquiler_buses = (flacos + gordos * 2) / capacidad_bus * costo_bus * 2.0;
        System.out.println("Costo alquiler de buses: " + ct_alquiler_buses);
        double ct_comida = (flacos * 3 + gordos * 5) * costo_comida * duracion;
        System.out.println("Costo comida: " + ct_comida);
        double t_habitaciones = Math.ceil((flacos + gordos) / capacidad_habitacion * 1.0);
        System.out.println("Habitaciones necesarias: " + t_habitaciones);
        double ct_habitaciones = t_habitaciones * costo_habitacion;
        System.out.println("Costo de las habitaciones: " + ct_habitaciones);
        double total = ct_alquiler_buses + ct_comida + ct_habitaciones;
        System.out.println("Costo diario: " + total / duracion);
        System.out.println("> Costo total: " + total);
    }

}
