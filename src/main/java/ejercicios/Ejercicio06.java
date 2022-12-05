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
public class Ejercicio06 {

    /*
    Hacer un programa que determine si dos arrays son iguales. Probarlo con los 
    arrays [1,2,3] y [1,2,3], [1,2,3,4] y [1,2,3] , [1,2,3] y [1,2,2]. Este ejercicio
    hay que hacerlo de dos formas: la primera, usando la clase Arrays; la segunda, 
    creando un método que vaya comparando los valores de los arrays y devuelva true 
    si todos son iguales o false en caso contrario.
     */
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {1, 2, 2};

        // Usando la clase array
        System.out.println("Usando la clase array:");
        System.out.println("¿Es {1,2,3} igual a {1,2,3}? " + Arrays.equals(array1, array1));
        System.out.println("¿Es {1,2,3,4} igual a {1,2,3}? " + Arrays.equals(array2, array1));
        System.out.println("¿Es {1,2,3} igual a {1,2,2}? " + Arrays.equals(array1, array3));
        System.out.println("---------------------------------------------------");

        // Usando mi método
        System.out.println("Usando mi método:");
        System.out.println("¿Es {1,2,3} igual a {1,2,3}? " + compararArrays(array1, array1));
        System.out.println("¿Es {1,2,3,4} igual a {1,2,3}? " + compararArrays(array2, array1));
        System.out.println("¿Es {1,2,3} igual a {1,2,2}? " + compararArrays(array1, array3));
    }

    // Método para comparar arrays
    private static boolean compararArrays(int[] array1, int[] array2) {
        boolean igual = false;
        // Si son del mismo tamaño sigo comparando, si no devuelvo false
        if (array1.length == array2.length) {
            // Como son del mismo tamaño, recorro uno de los arrays y comparo indice por indice
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    igual = false;
                    break;
                } else {
                    igual = true;
                }
            }
        }
        return igual;
    }
}
