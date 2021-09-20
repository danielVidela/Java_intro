
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dany
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
public class Dieciseis_veinte_numeros_suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         int num=0;
         int suma=0;
         for (int i=0;i<=19;i++){
             System.out.println("Ingrese un numero para sumar");
             num=leer.nextInt();
             if (num==0){
                 System.out.println("Se capturo el numero cero");
                 break;
             }
             if (num>=1){
                 suma=suma+num;
             }
 
    }
        System.out.println("La suma total de los numeros es: ["+suma+"]");   
    }
    
}
