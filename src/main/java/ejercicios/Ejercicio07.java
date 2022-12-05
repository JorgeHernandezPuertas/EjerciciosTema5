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
public class Ejercicio07 {

    /*
    Escribir un programa que lea del teclado el tamaño de dos arrays de enteros 
    (el mismo tamaño para los dos arrays). El programa inicializará los arrays 
    con números aleatorios entre 1 y 100. Existirá un método llamado multiplicar
    que recibirá los dos arrays e irá multiplicando los elementos dos a dos, empezando
    por los elementos que ocupan la posición cero, luego la uno, etc, guardando el 
    resultado en otro array, que será devuelto por el método. Además existirá un 
    método para imprimir por pantalla los valores de los arrays.
     */
    public static void main(String[] args) {

    }

    // Creo el objeto de clase aleatorio (de tipo Random)
    private static Random aleatorio = new Random();

    // Creo el objeto de clase teclado (de tipo Scanner)
    private static Scanner teclado = new Scanner(System.in);

    // Método para pedir el tamaño
    private static int pedirTamaños() {
        int tamaño = 0;
        do {
            try {
                System.out.println("Introduce el tamaño que tendrán los arrays(de enteros): ");
                tamaño = teclado.nextInt();
                if (tamaño < 1) {
                    System.out.println("Los arrays tienen que tener un elemento.");
                }
            } catch (InputMismatchException ime) {
                System.out.println("No ha introducido un entero.");
            }
            teclado.nextLine(); // Limpio buffer
        } while (tamaño < 1);
        return tamaño;
    }

    // Método que rellena un array de números aleatorios entre 1 y 100
    private static void rellenarAleatorio(int[] array) {
        final int MIN = 1, MAX = 100;
        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(MIN, MAX + 1);
        }
    }
    
    // Método que hace un array resultado de la multiplicación de los elementos
    // de los índices de otros dos.
    private static int[] multiplicarArrays(int[] array1, int[] array2){
        int[] arrayFinal = new int[array1.length];
        
        return arrayFinal;
    }
}
