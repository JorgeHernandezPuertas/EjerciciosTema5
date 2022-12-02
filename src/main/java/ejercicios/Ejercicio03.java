/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author jorge
 */
public class Ejercicio03 {

    /*
    Crea un array de doubles de tamaño 20. Usando los métodos de la clase Arrays:

Rellena el array con el valor 7.5 en todas sus posiciones.
Realiza una copia del array anterior en un nuevo array.
Imprime ambos arrays.
Compara ambos arrays, mostrando si son iguales.
Introduce el valor 6.3 en una posición aleatoria válida de uno de los arrays.
Imprime ambos arrays.
Vuelve a compararlos, indicando si son iguales o no.
     */

    public static void main(String[] args) {
        // Creo el array
        double[] array = new double[20];
        
        // Relleno el array con el valor 7.5 en todas sus posiciones
        Arrays.fill(array, 7.5);
        
        // Copio el array anterior
        double[] arrayCopia = Arrays.copyOf(array, 20);
        
        // Imprimo ambos arrays
        System.out.println("Array1: ");
        imprimirArray(array);
        System.out.println("Array2: ");
        imprimirArray(arrayCopia);
        
        // Comparo ambos arrays
        System.out.println("¿Son iguales? " + Arrays.equals(array, arrayCopia));
        
        // Introduzco el valor 6.3 en una posición aleatoria válida de uno de los arrays
        cambiarIndexAleatorio(array);
        
        // Imprimo ambos arrays de nuevo
        System.out.println("Array1:");
        imprimirArray(array);
        System.out.println("Array2: ");
        imprimirArray(arrayCopia);
        
        // Los vuelvo a comparar
        System.out.println("¿Son iguales ahora? " + Arrays.equals(array, arrayCopia));

    }
    
    // Creo un objeto Random para la clase
    private static Random aleatorio = new Random();
    
    // Método para imprimir arrays
    private static void imprimirArray(double[] array){
        for (double aux:array){
            System.out.print(aux + " - ");
        }
        System.out.println("\n--------------------------------------------");
    }
    
    // Método para cambiar el valor de un index aleatorio del array por 6.3
    private static void cambiarIndexAleatorio(double[] array){
        int numAleatorio = aleatorio.nextInt(array.length);
        Arrays.fill(array, numAleatorio, numAleatorio + 1, 6.3);
    }
}
