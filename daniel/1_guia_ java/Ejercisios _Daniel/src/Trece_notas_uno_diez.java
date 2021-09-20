
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dany Escriba un programa que valide si una nota está entre 0 y 10,
 * sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea
 * correcta.  *
 *
 */
public class Trece_notas_uno_diez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int nota;
                
        do {
            System.out.println("Ingrese la nota");
            nota = leer.nextInt();
            if (nota >= 0 && nota <= 10){ 
                System.out.println("La nota es correcta");
            }else{ 
                System.out.println("La nota es incorrecta vuelva a escribirla");
            }

            
        }while(nota < 0 || nota > 10);

            }
        }
      
    

   
