
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dany
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial. 
 */
public class catorce_suma_num_hasta_limite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
         System.out.println("Ingrese un valor limite positivo");
         int limite=leer.nextInt();
         int contador=0;
         int suma=0;
         int sumando;
         while (limite>contador){
             contador+=1;
             System.out.println("Ingrese un numero a sumar");
             sumando=leer.nextInt();
             suma=sumando+suma;
             
         } 
          System.out.println("La suma total de los numeros es: "+suma);   
         
         
              /*
     pedirle al usuario el numero a sumar
         sumarle el siguiente valor ahasta que la suma sea igual al limite.
         
     */
         
        
} 
    }
    
