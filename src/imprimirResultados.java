import java.util.Arrays;
import java.util.List;

public class imprimirResultados {

    public static void imprimir(List<Integer> listaRecibida){
        int cantidadDeValoresRecibidos = listaRecibida.size();
        int sum =0;
        for(int i=0; i<listaRecibida.size(); i++){
            sum+= listaRecibida.get(i);
        }
        double promedio = sum/ listaRecibida.size();
        System.out.println("El numero total de valores ingresados es: "+cantidadDeValoresRecibidos);
        System.out.println("La suma de todos los valores ingresados es: "+sum);
        System.out.println("El promedio de todos los valores ingresados es: "+promedio);
    }
}
