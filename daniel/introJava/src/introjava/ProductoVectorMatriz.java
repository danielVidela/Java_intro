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






public class ProductoVectorMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaracion y creacion del vector
        //tipo[] nombreVector = new tipo[tamaño];
        
        //declarar un arreglo de una dimencion
        int[] vector;
        //crear en memoria (contruir/dimensionar) con el valor por defecto (cero para los enteros)
        vector = new int[2];
        //los dos pasos en una linea
        int[] producto = new int[3];
        
        //declaracion y creacion de la matriz
        //tipo[][] nombreMatriz =new tipo[filas][columnas];
        
        //declaracion  e inicializacion con valores predeterminados
        int[][] matriz = {{4,8,6},{2,1,7}};
       
        //declaracion creacion de areglos genericos
        //tipo[][]..[] nombreAreglo = new tipo[cardinalidad 1][cardinalidad2] ...[cardinalidadN];
                
        System.out.println("Ingrese los valores del vector de tamaño"+vector.length+":");
        Scanner leer = new Scanner(System.in);
        //int=0, porque los subindices de los areglos en java inician en cero
        for (int i=0;i<vector.length;i++){
            System.out.println("v["+i+"]=");
            //aceder al valor i del vector
            vector[i]=leer.nextInt();
        }
        
        //Multiplica el vector 
        int sum;
        //...para columna de la matriz...
        for(int j=0; j < matriz[0].length;j++){
            sum=0;
            //..recorro el vector y multiplico
            for(int i=0;i<vector.length;i++){
                sum += vector[i]*matriz[i][j];
            }
            producto[j]=sum;
        }
        
        String aux= "";
        
        //Mostrar el Vecto
        System.out.println("*vector:");
        //bucle for"mejorado"(enhanced)
        //for (tipo:arreglo)
        for (int elemento: vector){
            aux = aux+ " " + elemento;
        }
        System.out.println(aux);
        
        //Mostrar la matriz
        System.out.println("\n* Matriz:");
        //para cada fila de la matriz
        for (int[]fila : matriz){
            aux = "";
            //para cada elemento de la fila
            for (int elemento : fila){
                aux +=" "+elemento;
            }
            System.out.println(aux);      
       }
        
       //Mostrar resultado
       aux="";
        System.out.println("\n* Vector x Matriz");
        for(int elemento : producto ){
            aux +=" " + elemento;
        }
        System.out.println(aux);
        
    }
    
}