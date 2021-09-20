
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dany
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 
 */
public class seis_doble_triple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un Numero");
        int num =leer.nextInt();
        int doble = (num*2);
        int triple =(num*3);
        System.out.println("El Doble del numero es: ["+doble+"]" );
        System.out.println("El triple del numero ingresado es ["+triple+"]");
       
        
    }
    
}
