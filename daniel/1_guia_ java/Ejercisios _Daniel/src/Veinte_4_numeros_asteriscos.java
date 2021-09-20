
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dany Realizar un programa que lea 4 números (comprendidos entre 1 y
 * 20) e imprima el número ingresado seguido de tantos asteriscos como indique
 * su valor. Por ejemplo: 5 ***** 3 *** 11 *********** 2 **
 *
 */
public class Veinte_4_numeros_asteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int contador = 0;
        int num1;
        int i;

        while (contador < 4) {

            System.out.println("ingrese un numero");
            num1 = leer.nextInt();
            contador++;

            for (i = 0; i >= num1; i++) {

                System.out.print(num1+"*");
                System.out.print("");
            }
            System.out.println("");
        }

    }
}
