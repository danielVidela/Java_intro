
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
public class dos_suma_numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num;
        int num2;
        int suma;
        System.out.println("Ingrese un numero que quiera sumar");
        num = leer.nextInt();
        System.out.println("Ingrese el siguiente numero quiera sumar");
        num2 =leer.nextInt();
        suma=num+num2;
        System.out.println("El resultado de la suma es: [" + suma+"]");
    }
    
}
