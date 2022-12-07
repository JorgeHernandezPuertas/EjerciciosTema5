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
public class Ejercicio08 {

    /*
    Realizar un programa que lea de la entrada un número y utilice ese número 
    para crear un array de enteros de ese tamaño. A continuación, el programa 
    inicializa el array con los valores que el usuario introduzca por teclado. 
    Finalmente, se deberá recorrer el array e imprimir tantos caracteres ‘*’ 
    como indique el valor de cada elemento del array. Ejemplo: los valores 5,4,3,2 
    producirán la siguiente salida:
                *****
                ****
                ***
                **
     */
    public static void main(String[] args) {
        
        // Declaro el array con el tamaño que pido por teclado
        int[] array = new int[pedirTamaño()];
        
        // Inicializo el array pidiendo los valores por teclado
        rellenarArray(array);
        
        // Imprimo tantos caracteres como valor por elemento del array
        imprimirCaracteres(array);
    }

    // Objeto de clase teclado del tipo Scanner
    private static Scanner teclado = new Scanner(System.in);

    // Método para pedir el tamaño del array
    private static int pedirTamaño() {
        int tamaño = 0;
        do {
            try {
                System.out.println("Introduce el tamaño del array: ");
                tamaño = teclado.nextInt();
                if (tamaño < 1) {
                    System.out.println("Los arrays tienen que tener al menos un elemento.");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Eso no es un entero.");
            }
            teclado.nextLine(); // Limpio buffer
        } while (tamaño < 1);
        return tamaño;
    }

    // Método para pedir un entero
    private static int pedirEntero(int i) {
        int entero = 0;
        boolean filtro = true;
        do {
            try {
                System.out.println("Introduce el entero número " + (i + 1) + ":");
                entero = teclado.nextInt();
                filtro = false;
            } catch (InputMismatchException ime) {
                System.out.println("Eso no es un entero.");
            }
            teclado.nextLine(); // Limpio buffer
        } while (filtro);
        return entero;
    }

    // Método para rellenar el array
    private static void rellenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = pedirEntero(i);
        }
    }
    
    // Método para imprimir carácteres
    private static void imprimirCaracteres(int[] array){
        for(int entero:array){
            entero = Math.abs(entero);
            for(int i = 0;i<entero;i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
