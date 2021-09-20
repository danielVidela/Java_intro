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
public class bucles_para_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num;
       Scanner leer = new Scanner(System.in);
       
       do {
           System.out.println("Ingrese numero entero positivo");
           num =leer.nextInt();
           if (num > 1000){
               System.out.println("Este programa podria tardar, ¿estas seguro? (s/n");
               String confirma = leer.next();
               if (confirma.equals("s")) {
                   break; // detiene el bucle y continua con el proximo bloque
               }
           }
       }while (num <=0 || num > 1000);
       
       /*
       for (<inicializacio>; <exprecion_terminacion>; <paso/incremento/decremento>) {
        <sentencias>
       }
       */
            
       int j, suma;
       for(int i=1 ; i<=num ; i++){
           if(i%2 !=0)
              continue; //continue detiene la iteracion actual y salta a la siguiente
       
       suma = 0;
       j = 1;
       while(j<=i){
           suma += j;
           j++;
       }
        System.out.println("La suma de los " + i + "numeros naturales es: " + suma);
 
    }
  }     
}
    
