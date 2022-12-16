/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Random;

/**
 *
 * @author jorge
 */

/*
Escribe un programa que dada una matriz de 3x3 enteros y realice las siguientes funciones:

    - Rellenar aleatoriamente todas las casillas de la matriz con números enteros entre 1 y 100
    - Calcular la media de todos los valores
    - Calcular el valor mínimo y el máximo de todos los valores

*/
public class Ejercicio14 {
    
    public static void main(String[] args) {
        
        // Declaro e inicializo la matriz
        int[][] matriz = new int[3][3];
        
        // Relleno la matriz y la saco por consola para comprobar
        rellenarMatriz(matriz);
        System.out.println("La matriz es: ");
        imprimirMatriz(matriz);
        System.out.println("-------------------------------------------------");
        
        // Calculo la media y la imprimo por teclado
        double media = calcularMediaMatriz(matriz);
        System.out.println("La media de los elementos de la matriz es: " + media);
        System.out.println("-------------------------------------------------");
        
        
        // Calculo el valor mínimo y el máximo de los elementos de la matriz
        int [] minimoYMaximo = buscarMinimoYMaximo(matriz);
        // Establezco las variables por legibilidad
        int minimo = minimoYMaximo[0], maximo = minimoYMaximo[1];
        // Los imprimo para comprobar
        System.out.println("El mínimo es: " + minimo);
        System.out.println("El máximo es: " + maximo);
    }
    
    private static Random aleatorio = new Random();
    
    private static void rellenarMatriz(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = aleatorio.nextInt(1, 100);
            }
        }
    }
    
    private static double calcularMediaMatriz(int[][] matriz){
        int contadorElementos = 0;
        double sumaElementos = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                contadorElementos++; // Cuento todos los elementos de la matriz
                sumaElementos += matriz[i][j]; // Sumo el valor de cada elemento
            }
        }
        return (sumaElementos/contadorElementos); // Devuelvo la media
    }
    
    // Método para buscar el valor mínimo y el valor máximo la matriz
    private static int[] buscarMinimoYMaximo(int[][] matriz){
        int[] minimoYMaximo = new int[2];
        minimoYMaximo[0] = matriz[0][0]; // Guardo en mínimo en el hueco 0
        minimoYMaximo[1] = matriz[0][0]; // Guardo el máximo en el hueco 1
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if (matriz[i][j] < minimoYMaximo[0]) {
                    minimoYMaximo[0] = matriz[i][j];
                }
                if (matriz[i][j] > minimoYMaximo[1]){
                    minimoYMaximo[1] = matriz[i][j];
                }
            }
        }
        return minimoYMaximo; // Devuelvo la matriz ordenada ([0] es minimo y [1] es maximo)
    }
    
    // Método para imprimir la matriz por consola
    private static void imprimirMatriz(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + ", "); // Imprimo cada elemento de la fila
            }
            System.out.println(""); // Salto de linea al acabar la fila
        }
    }
}
