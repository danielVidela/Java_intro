
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
public class Diecinueve_cuadrado_asteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el tamaño de su cuadro");
        int tam = leer.nextInt();
        for (int i = 0; i <= tam; i++) {
            for (int j = 0; j <= tam; j++) {
                if (i > 0 && i < tam && j > 0 && j < tam) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                
            }System.out.println(" ");
        }
    }

}
