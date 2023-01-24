/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class MatrizCasillasVecinas {

    public static void main(String[] args) {

        // Pido la dimensión de la matriz cuadrada
        int dimension = pedirDimension();

        // Creo la matriz
        int[][] matriz = new int[dimension][dimension];

        // Relleno la matriz de números aleatorios
        rellenarMatriz(matriz);

        // Muestro la matriz por consola para ver los números
        imprimirMatriz(matriz);
        System.out.println("--------------------------------------------------");

        // Pido la fila y la columna que voy a comprobar sus vecinos
        System.out.println("Introduce la fila del elemento que quieres:");
        int fila = pedirNatural(matriz);
        System.out.println("Introduce la columna del elemento que quieres:");
        int columna = pedirNatural(matriz);

        // Recorro la matriz dado un elemento y muestro los vecinos por consola
        System.out.println("Los vecinos son:");
        imprimirVecinos(fila, columna, matriz);
    }

    // Creo atributos de clase
    private static Random aleatorio = new Random();
    private static Scanner teclado = new Scanner(System.in);

    // Método que guarda los elementos vecinos de un elemento dado en una matriz
    private static void imprimirVecinos(int fila, int columna, int[][] matriz) {
        for (int i = (fila - 1); i <= (fila + 1); i++) {
            for (int j = (columna - 1); j <= (columna + 1); j++) {
                // Si está dentro de la matriz
                if (i >= 0 && i < matriz.length && j >= 0 && j < matriz[0].length) {
                    // Si no es el elemento seleccionado
                    if (i != fila || j != columna) {
                        System.out.print(matriz[i][j] + " ");
                    } else {
                        System.out.print("*" + " ");
                    }
                } else { // Si está fuera de la matriz imprimo un X
                    System.out.print("X" + " ");
                }
            } // Salto de linea en la fila
            System.out.println("");
        }

    }

    // Método para rellenar la matriz de numéros aleatorios
    private static void rellenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = aleatorio.nextInt(0, 10);
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

    // Método para pedir la dimensión de la matriz
    private static int pedirDimension() {
        int dimension = 0;
        do {
            try {
                System.out.println("Introduce la dimensión de la matriz cuadrada:");
                dimension = teclado.nextInt();
                if (dimension < 1) {
                    System.out.println("La dimensión tiene que ser mayor que 0.");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Introduce un entero como dimensión.");
            }
            System.out.println("----------------------------------------------");
            teclado.nextLine(); // Limpio buffer
        } while (dimension < 1);
        return dimension;
    }

    // Métodos para pedir la fila y la columna del elemento de la matriz a comprobar
    private static int pedirNatural(int[][] matriz) {
        int natural = -1;
        do {
            try {
                natural = teclado.nextInt();
                if (natural < 0 || natural >= matriz.length) {
                    System.out.println("La dimensión tiene que ser mayor o "
                            + "igual a 0 y menor que la longitud de la matriz.");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Introduce un entero.");
            }
            System.out.println("----------------------------------------------");
            teclado.nextLine(); // Limpio buffer
        } while (natural < 0 || natural >= matriz.length);
        return natural;
    }
}
