
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dany
 * 
 * 
 *  Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.  
 */
public class Once_PrimeraLetraA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una Frace o palabra ");
        String frace=leer.next();
        String primL="A";
        String subcadena= frace.substring(0,1); 
        if ( primL.equals(subcadena) ){
            System.out.println("CORRECTO");
            
        }else{
            System.out.println("Incorrecto");
        }
      
    }
    
}
