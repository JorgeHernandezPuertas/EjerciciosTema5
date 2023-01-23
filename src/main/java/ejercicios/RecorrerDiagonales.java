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
public class RecorrerDiagonales {

    /*
    Hay que recorrer la diagonal principal y la secundaria
     */
    public static void main(String[] args) {

        // Pido la dimension de la matriz cuadrada
        int dimension = pedirDimension();

        // Creo la matriz
        int[][] matriz = new int[dimension][dimension];

        // Relleno la matriz de números aleatorios
        rellenarMatriz(matriz);

        // Muestro la matriz por consola para ver los números
        imprimirMatriz(matriz);
        System.out.println("--------------------------------------------------");

        // Recorro la diagonal principal
        System.out.println("La diagonal principal es:");
        imprimirPrincipal(matriz);
        System.out.println("\n--------------------------------------------------");
        // Recorro la diagonal secundaria
        System.out.println("La diagonal secundaria es:");
        imprimirSecundaria(matriz);
    }

    // Atributos de clase
    private static Scanner teclado = new Scanner(System.in);
    private static Random aleatorio = new Random();

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

    // Método que recorre la diagonal principal
    private static void imprimirPrincipal(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + ",");
        }
    }

    // Método que recorre la diagonal secundaria
    private static void imprimirSecundaria(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - (i + 1)] + ",");
        }
    }
}
