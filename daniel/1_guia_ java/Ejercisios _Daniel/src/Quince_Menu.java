
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
public class Quince_Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int elegido;
        String salir;
        salir = "n";
        
        boolean terminar=false;
        
        do{
        System.out.println("Menu");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        System.out.println("Elija opcion");
        elegido = leer.nextInt();
        int suma=num1+num2;
        double restar=num1-num2;
        int multiplicar=num1*num2;
        double Dividir=num1/num2;
       
      
        switch (elegido) {
            case 1:
                System.out.println("La suma es: "+num1+"+"+num2+"= ["+suma+"]" );
                break;
            case 2:
                System.out.println("La resta es: "+num1+"-"+num2+"= ["+restar+"]" );
                break;
            case 3:
                
              System.out.println("La Multiplicacion es: "+num1+"x"+num2+"= ["+multiplicar+"]");
              break;
            case 4:
                
                System.out.println("La divicion es: "+num1+"/"+num2+"= ["+Dividir+"]");
                break;
            case 5:
                
                if(elegido==5){
                   System.out.println("Esta seguro q quiere salir del programa S/N");
                    salir = leer.next();
                }
            default:
                System.out.println("La opcion ingresada es incorrecta intente nuevamente");
         }
        
        }  while (salir.equals("n")); 
    }

}

