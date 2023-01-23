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
public class MatrizCasillasVecinas {

    public static void main(String[] args) {

        // Creo la matriz
        int[][] matriz = new int[4][4];
        
        // Relleno la matriz de números aleatorios
        rellenarMatriz(matriz);

        // Muestro la matriz por consola para ver los números
        imprimirMatriz(matriz);
        System.out.println("--------------------------------------------------");
        
        // Recorro la matriz dado un elemento y muestro los vecinos por consola
        System.out.println("Los vecinos son:");
        imprimirVecinos(1, 1, matriz);
    }

    // Método que guarda los elementos vecinos de un elemento dado en una matriz
    private static void imprimirVecinos(int fila, int columna, int[][] matriz) {
        for (int i = (fila - 1); i <= (fila + 1); i++) {
            for (int j = (columna - 1); j >= (columna + 1); j++) {
                if (i < 0 || i >= matriz.length || j < 0 || j >= matriz[i].length) {
                    if (i != fila || j != columna) {
                        System.out.print(matriz[i][j] + ", ");
                    }
                }
            }
        }
    }

    // Creo atributos de clase
    private static Random aleatorio = new Random();

    // Método para rellenar la matriz de numéros aleatorios
    private static void rellenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(0, 100);
            }
        }
    }
    
    // Método para imprimir la matriz por consola
    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
