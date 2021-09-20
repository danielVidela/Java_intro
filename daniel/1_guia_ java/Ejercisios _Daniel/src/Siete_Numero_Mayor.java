
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dany
 * Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.

 */
public class Siete_Numero_Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el primer numero");
        int num=leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2=leer.nextInt();
        int max= 0;
        if (num > num2){
            System.out.println("El numero mayor es: [" + num+"]");
        }else{ 
            System.out.println("El numero mayor es: ["+ num2+"]");
                    
        }
        
    }
    
}
