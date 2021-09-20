/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.util.Scanner;

/**
 *
 * @author Dany
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //tipos de datos- definir
        int num = 0;// tipo entero
        double numReal = 0.0;//ti real
        String cadena = "hola mundo"; // tipo cadena
        char caracter;// tipo CARACTER
        boolean logico;// o true son los tipo LOGICOS

        //ESCRIBIR PARA MOSTRAR POR PANTALLA (como atajo sout + tab
        System.out.println("eL TEXTO QUE QUIERO Mostrar: " + cadena);

        //LEER (mucha atencion!)
      

        System.out.println("Ingrese una palabra!");
        String palabra = leer.next();//leer cadena
        System.out.println("palabra: " + palabra);

        System.out.println("Ingresar un numero");
        num = leer.nextInt();
        System.out.println("numer: " + num);

        System.out.println("ingrese un numero real");
        numReal = leer.nextDouble();
        System.out.println("real: " + numReal);

        System.out.println("Ingrese un valor logico");
        logico = leer.hasNextBoolean();
        System.out.println("logico: " + logico);

        System.out.println("ingrese un caracter");
        caracter = leer.next().charAt(0);
        System.out.println("caracter: " + caracter);

    }

}
