
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). 
 */
public class Cinco_CentigradosaFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la temperatura en grados centigrados");
        int C =leer.nextInt();
        int F = 32 + (9 * C / 5);
        System.out.println("La temperatura en Grados Fahrenheit es: ["+ F+"°]");
    }
    
}
