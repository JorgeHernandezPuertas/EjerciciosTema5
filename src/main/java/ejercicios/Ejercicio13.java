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

/*
Escribir un programa que lea números enteros entre 1 y 20 desde teclado. Se debe
generar un histograma con las frecuencias de cada entero en la secuencia.  Para 
representar las barras del histograma hay que utilizar secuencias del carácter ‘*’.
El programa finaliza al introducir un cero. Por ejemplo, la secuencia: 
1, 1, 20, 1, 2, 20, 3, 3, 3, 4, 4, 4, 5, 3 generaría la siguiente salida:

1: ***
2: *
3: ****
4: ***
5:
6:
7:
…
20:**

 */
public class Ejercicio13 {

    public static void main(String[] args) {

        // Declaro e inicializo variables
        int entero = 0;
        int[] recuentoOrdenado = new int[20];

        // Pido los enteros y los voy asignando a su posición ordenada en el array
        do {
            entero = pedirEntero();
            if (entero != 0) {
                recuentoOrdenado[entero - 1]++;
            }
        } while (entero != 0);

        // Imprimo el histograma
        imprimirHistograma(recuentoOrdenado);
    }

    // Objeto de clase teclado de tipo Scanner
    private static Scanner teclado = new Scanner(System.in);

    // Método para pedir un entero por teclado
    private static int pedirEntero() {
        int entero = 21;
        do {
            try {
                System.out.println("Introduce un entero: ");
                entero = teclado.nextInt();
                entero = Math.abs(entero); // Lo pongo positivo
                if (entero < 0 || entero > 20) {
                    System.out.println("El entero tiene que estar entre 0 y 20.");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Eso no es un entero.");
            }
            teclado.nextLine(); // Limpio buffer
        } while (entero < 0 || entero > 20);
        return entero;
    }

    // Método para imprimir el histograma
    private static void imprimirHistograma(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ": ");
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
            System.out.println(""); // Salto de línea al acabar la línea
        }
    }
}
