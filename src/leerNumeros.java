import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leerNumeros {

    public static List<Integer> recibirValoresConsola(){
        List<Integer> listaRetorno = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int numeroEntrada = 0;
        System.out.println("Ingrese los numeros que desee agregar");
        while(numeroEntrada!=-99){
            numeroEntrada = entrada.nextInt();
            if(!(numeroEntrada==-99)){
                listaRetorno.add(numeroEntrada);
            }
        }
        return listaRetorno;
    }
}
