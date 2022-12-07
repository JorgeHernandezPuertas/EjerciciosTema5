/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Arrays;

/**
 *
 * @author jorge
 */
public class Ejercicio09 {

    /*
    En el programa del ejercicio 4, incluir un método llamado 
    ordenarBubble(int[] arrayOrdenar) para ordenar el array que se le pase,
    usando el método bubble sort que hay en los apuntes.
     */
    public static void main(String[] args) {
        int numeros[] = {6, 5, 3, 1, 2};
        System.out.println(Arrays.toString(numeros));

        // Ordeno el array
        ordenarBubble(numeros);
        System.out.println(Arrays.toString(numeros));

        // Hago la búsqueda binaria
        int pos = Arrays.binarySearch(numeros, 5);
        System.out.println("El 5 está en la posición " + pos);

        // Hago la búsqueda secuencial
        int posicion = busquedaSecuencial(numeros, 3);
        System.out.println("El 3 está en la posición: " + posicion);
        if (posicion >= 0) { // Comprueba que el índice es mayor o igual que cero
            System.out.println("El elemento de la posición " + posicion + " es " + numeros[posicion]);
        }
    }

    // Método de búsqueda secuencial
    public static int busquedaSecuencial(int[] array, int numeroBuscar) {
        int indice = -1;
        for (int i = 0; i < array.length; i++) {
            if (numeroBuscar == array[i]) { // Lo he encontrado
                indice = i; // Guarda la posición para devolverla
                break;
            }
        }
        return indice;
    }

    // Método de ordenar con el algoritmo bubble
    private static void ordenarBubble(int[] array) {
        int aux = 0;
        for (int i = 0; i < (array.length - 1); i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
    }
}
