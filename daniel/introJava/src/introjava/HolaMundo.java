/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Dany
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */ public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         String nombre;
         System.out.println("Ingrese su nombre:");
         nombre=leer.next();
         System.out.println("hola mundo! Soy "+nombre+" y estoy programando en Java");
         
   
    }
    
}
