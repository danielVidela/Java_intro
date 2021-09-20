/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dany
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
 * del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
 * por una E. Ejemplo:
 * 0-0-0
 * 0-0-1
 * 0-0-2
 * 0-0-E
 * 0-0-4
 * .
 * .
 * 0-1-2
 * 0-1-E
 */
public class Dieciocho_contador_tres_digitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i, j, k;
        String conversori;
        String conversorj;
        String conversork;

        for (i = 0; i <= 9; i++) {
            conversori = String.valueOf(i);
            for (j = 0; j <= 9; j++) {
                conversorj = String.valueOf(j);
                for (k = 0; k <= 9; k++) {
                    conversork = String.valueOf(k);
                    System.out.println(conversori.replace("3", "E") + "-" + conversorj.replace("3", "E") + "-" + conversork.replaceAll("3", "E"));

                }
            }

        }

    }
}
