
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dany
 */
public class Cuatro_mayusculas_minusculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una frace");
        String frace= leer.next();
        System.out.println("La frace en mayusculas es: "+ toUpperCase(frace));
        System.out.println("La frace en minusculas es: "+ toLowerCase(frace));
    }
    
}
