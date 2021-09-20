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
public class EncuestaCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opinion;
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Clasifique la peli entre una y 5 estrellas");
        opinion=leer.nextInt();
        
        if (opinion >= 1&& opinion <=5){
            switch (opinion) {
                case 1:
                case 2:
                    System.out.println("Nos sentimos apenados que no hayas disfrutado la peli");
                    break;
                case 3:
                    System.out.println("has clasificado la peli como buena");
                    break;
                case 4: 
                    System.out.println("has clasificado la peli como muy buena");
                case 5:
                    System.out.println("Fantastico que haya disfrutado un exelente entretimiento!!");
                    break;
            }
        }else if (opinion < 0){
            System.out.println("¿una opinion negativa? ¿taaaaan mala fue la pelicula? :(");
        }else if (opinion ==0){
            System.out.println("El valor "+ opinion+ " no es valido y no se tomara en cuenta. :(");
        }else{
            System.out.println(opinion+"Wow! Se te fue la mano con la clificacion :D");
        }
        System.out.println("Hasta la proxima!");
                       
                        
                    
            }
        }