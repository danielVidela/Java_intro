
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dany
 */
public class Tres_Nombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su nombre");
        String nombre=leer.next();
        System.out.println("Hola "+nombre+" es un placer conocerte");
        
    }
    
}
