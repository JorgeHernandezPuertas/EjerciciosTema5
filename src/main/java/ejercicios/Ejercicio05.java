/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        // Creo el array de 10 valores
        int[] arrayEnteros = new int[10];

        // Asigno los valores por teclado
        leerAlmacenarValores(arrayEnteros);

        // Muestro el array
        System.out.println("El array es:");
        mostrarArray(arrayEnteros);

        // Calculo el número de positivos, negativos y ceros
        int positivos = contarPositivos(arrayEnteros);
        int negativos = contarNegativos(arrayEnteros);
        int ceros = contarCeros(arrayEnteros);

        // Muestro el número de positivos, negativos y ceros
        System.out.println("Hay " + positivos + " positivos");
        System.out.println("Hay " + negativos + " negativos");
        System.out.println("Hay " + ceros + " ceros");
        System.out.println("--------------------------------------------------");

        // Calculo y muestro la media de positivos y negativos
        calcularMediaPositivos(arrayEnteros);
        calcularMediaNegativos(arrayEnteros);
    }

    // Creo el objeto de clase Scanner
    private static Scanner teclado = new Scanner(System.in);

    // Método para leer por teclado y almacenar los valores en un array
    private static void leerAlmacenarValores(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int entero = 0;
            boolean filtro = true;
            // Pido valor
            do {
                try {
                    System.out.println("Introduce el entero número " + (i + 1) + ":");
                    entero = teclado.nextInt();
                    filtro = false;

                } catch (InputMismatchException ime) {
                    System.out.println("No has introducido un entero.");
                }
                teclado.nextLine(); // Limpio buffer
            } while (filtro);
            // Almaceno el valor
            array[i] = entero;
        }

    }

    // Método para contar positivos
    private static int contarPositivos(int[] array) {
        int positivos = 0;
        for (int aux : array) {
            if (aux > 0) {
                positivos++;
            }
        }
        return positivos;
    }

    // Método para contar negativos
    private static int contarNegativos(int[] array) {
        int negativos = 0;
        for (int aux : array) {
            if (aux < 0) {
                negativos++;
            }
        }
        return negativos;
    }

    // Método para contar ceros
    private static int contarCeros(int[] array) {
        int ceros = 0;
        for (int aux : array) {
            if (aux == 0) {
                ceros++;
            }
        }
        return ceros;
    }

    // Método para mostrar array
    private static void mostrarArray(int[] array) {
        for (int aux : array) {
            System.out.print(aux + " - ");
        }
        System.out.println("\n----------------------------------------------");
    }

    // Método para calcular la media de los positivos
    private static void calcularMediaPositivos(int[] array) {
        int sumaPositivos = 0;
        // Sumo todos los positivos
        for (int aux : array) {
            if (aux > 0) {
                sumaPositivos += aux;
            }
        }
        // Cuento los positivos
        int positivos = contarPositivos(array);
        // Calculo la media
        // Controlo la posible Arithmetic Exception
        int mediaPositivos = (positivos == 0) ? 0 : (sumaPositivos / positivos);
        // Muestro por consola la media de los positivos
        System.out.println("La media de los positivos es " + mediaPositivos);
    }

    // Método para calcular la media de los negativos
    private static void calcularMediaNegativos(int[] array) {
        int sumaNegativos = 0;
        // Sumo todos los negativos
        for (int aux : array) {
            if (aux < 0) {
                sumaNegativos += aux;
            }
        }
        // Cuento los negativos
        int negativos = contarNegativos(array);
        // Calculo la media
        // Controlo la posible Arithmetic Exception
        int mediaNegativos = (negativos == 0) ? 0 : (sumaNegativos / negativos);
        // Muestro por consola la media de los negativos
        System.out.println("La media de los negativos es " + mediaNegativos);
    }
}
