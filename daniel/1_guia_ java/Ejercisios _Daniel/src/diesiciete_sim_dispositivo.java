
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dany Realizar un programa que simule el funcionamiento de un
 * dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el
 * usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de un
 * máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el
 * último tiene que ser una O. Las secuencias leídas que respeten el formato se
 * consideran correctas, la secuencia especial “&&&&&” marca el final de los
 * envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el
 * formato se considera incorrecta. Al finalizar el proceso, se imprime un
 * informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
 * Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
 * funciones de Java Substring(), Length(), equals()
 */
public class diesiciete_sim_dispositivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String cadena;

        int largo;
        String X;
        String O;
        String FDE = "&&&&&";
        int Correcto = 0;
        int Incorrecto = 0;
        do {
            System.out.println("Ingrese la cadena");
            cadena = leer.next();
            if(cadena.equals(FDE)){
                System.out.println("FDE recibido saliendo");
            break;
            }
            largo = cadena.length();
            X = cadena.substring(0, 1);
            O = cadena.substring(largo - 1, largo);
            System.out.println("["+X+"] y la ultima ["+O+"] y el largo es ["+largo+"]" );
            if (largo<=5 && X.equals("x") && O.equals("o")) {
                System.out.println("Correcto");
                Correcto = Correcto + 1;
            } else {
                System.out.println("Incorrecto");
                Incorrecto = Incorrecto + 1;

            }
        } while (cadena != FDE);

        System.out.println("La cantidad de lecturas correctas son: [" + Correcto + "]");
        System.out.println("La cantidad de lecturas incorresctas son: [" + Incorrecto + "]");

    }
}
