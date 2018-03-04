import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BasicosEj2 {

    private static void printVector(int vector[], int size){
        System.out.print("[");
        for(int i = 0; i < size; i++){

            if(vector[i] == -1){
                continue;
            }

            if(i != size - 1){
                System.out.print(vector[i] + ", ");
            }else{
                System.out.print(vector[i]);
            }
        }
        System.out.print("]\n");
    }

    public static void main (String []args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("> Ingrese tamanio del vector A");
        int n = Integer.parseInt(in.readLine());
        int a[] = new int[n];

        System.out.println(">> Vector A:");
        for(int i = 0; i < n; i++){
            System.out.print("> Numero " + (i + 1) + ": ");
            a[i] = Integer.parseInt(in.readLine());
        }

        System.out.println("> Ingrese tamanio del vector B");
        int p = Integer.parseInt(in.readLine());
        int b[] = new int[p];

        System.out.println(">> Vector B:");
        for(int i = 0; i < p; i++){
            System.out.print("> Numero " + (i + 1) + ": ");
            b[i] = Integer.parseInt(in.readLine());
        }

        int c[] = new int[n + p];
        for(int i = 0; i < (n + p); i++){
            c[i] = -1;
        }



        boolean existe = false;
        int idx = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < p; j++){
                if(a[i] == b[j]){
                    existe = true;
                    break;
                }
            }

            if(!existe){
                System.out.println("IDX: "  + idx);
                c[idx] = a[i];
                idx++;
            }

            existe = false;

        }


        for(int i = 0; i < p; i++){
            for(int j = 0; j < n; j++){
                if(b[i] == a[j]){
                    existe = true;
                    break;
                }
            }

            if(!existe){
                c[idx] = b[i];
                idx++;
            }

            existe = false;

        }

        Arrays.sort(c);
        System.out.println("idx "  + idx   );
        printVector(c, n + p);

    }


}
