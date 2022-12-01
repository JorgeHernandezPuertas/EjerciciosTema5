/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author jorge
 */
public class Ejercicio01 {

    /*
    Escribe un programa que muestre cada elemento de un array de enteros y sume 
    todos sus elementos. Instancia e inicializa el array en el programa, sin leer
    nada por teclado, con los siguientes valores {1, 2, 3, 4, 5, 6}.
     */
    public static void main(String[] args) {

        // Instancio e inicializo el array
        int[] numeros = {1, 2, 3, 4, 5, 6};
        
        
        // Muestro cada elemento del array y voy sumando los elementos
        int sumaTotal = 0;
        System.out.println("Los elementos del array son: ");
        for(int aux:numeros){
            System.out.print(aux + " - ");
            sumaTotal += aux;
        }
        System.out.println("\n--------------------------------------");
        // Muestro la suma de todos los elementos
        System.out.println("La suma de todos los elementos es: " + sumaTotal);
    }
}
