/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author jorge
 */

/*
Se desea manejar dos listas (ArrayList) de Integer. La cantidad de elementos de 
la lista 1 debe ser un número aleatorio entre 5 y 15. La cantidad de elementos de
la lista 2 debe ser un número aleatorio entre 10 y 20. El rango de los números que 
serán agregados a la lista DEBE estar entre 50 y 100. Se pide construir una aplicación
en Java que permita cumplir con la siguiente funcionalidad:

- Imprimir las listas que han sido generadas. Usa for-each.
- Crear una tercera lista que contenga los elementos que están en la lista 1 y NO
ESTÁN en la lista 2 
- Imprimir la tercera lista. 
- Crear una cuarta lista que contenga los elementos de la lista 1 que son pares y 
los elementos de la lista 2 que son impares
- Imprimir la cuarta lista. Usa una expresión lambda.


 */
public class Ejercicio23 {

    // Creo las dos listas
    private static ArrayList<Integer> lista1 = new ArrayList<>();
    private static ArrayList<Integer> lista2 = new ArrayList<>();

    public static void main(String[] args) {

        // Relleno ambas listas
        rellenarLista(lista1, 5, 15);
        rellenarLista(lista2, 10, 20);

        // Imprimo las listas
        System.out.println("Lista 1:");
        lista1.forEach(System.out::println);
        System.out.println("--------------------------------------------------");
        System.out.println("Lista 2:");
        lista2.forEach(System.out::println);
        System.out.println("--------------------------------------------------");

        // Hago la tercera lista y la imprimo
        ArrayList<Integer> lista3 = generarTerceraLista();
        System.out.println("Lista 3:");
        lista3.forEach(System.out::println);
        System.out.println("--------------------------------------------------");
        
        // Hago la cuarta lista y la imprimo
        ArrayList<Integer> lista4 = generarCuartaLista();
        System.out.println("Lista 4:");
        lista4.forEach(System.out::println);

    }

    // Objeto de tipo random para la clase
    private static Random aleatorio = new Random();

    // Método para rellenar la lista aleatoria con un número de elementos en un rango dado
    private static void rellenarLista(ArrayList<Integer> lista, int minimo, int maximo) {
        int tamano = aleatorio.nextInt(minimo, maximo + 1);
        // Añado el número de elementos aleatorio dentro del rango
        for (int i = 0; i < tamano; i++) {
            // Relleno con números entre 50 y 100
            lista.add(aleatorio.nextInt(50, 101));
        }
    }

    // Método para crear la tercera lista
    private static ArrayList<Integer> generarTerceraLista() {
        ArrayList<Integer> lista3 = new ArrayList<Integer>();
        for (Integer aux : lista1) {
            if (!lista2.contains(aux)) {
                lista3.add(aux);
            }
        }
        return lista3;
    }
    
    // Método para crear la cuarta lista
    private static ArrayList<Integer> generarCuartaLista(){
        ArrayList<Integer> lista4 = new ArrayList<>();
        // Añado los pares de la lista 1
        for(Integer aux:lista1){
            if(aux%2 == 0){
                lista4.add(aux);
            }
        }
        // Añado los impares de la lista 2
        for(Integer aux:lista2){
            if (aux%2 == 1){
                lista4.add(aux);
            }
        }
        return lista4;
    }
}
