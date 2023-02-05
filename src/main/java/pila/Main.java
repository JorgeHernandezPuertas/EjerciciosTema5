/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

import ejercicio24.Cancion;

/**
 *
 * @author jorge
 */
public class Main {
    public static void main(String[] args) {
        
        // Creo las dos pilas del ejericio 27 (String y Cancion)
        Pila<String> pilaString = new Pila(5);
        Pila<Cancion> pilaCancion = new Pila(10);
        
        // Pruebo los métodos de pila con la pila de Strings
        // Pongo 4 objetos en la pila
        System.out.println("Añado 4 elementos a las pila por orden del 1 al 4:");
        pilaString.apilar("elemento1");
        pilaString.apilar("elemento2");
        pilaString.apilar("elemento3");
        pilaString.apilar("elemento4");
        // Muestro la pila para comprobar
        pilaString.imprimirPila();
        System.out.println("--------------------------------------------------");
        
        // Quito el último objeto de la pila (debería ser el 4)
        System.out.println("Desapilo un elemento (debería ser el último, el 4):");
        pilaString.desapilar();
        // Muestro la pila para comprobar
        pilaString.imprimirPila();
        System.out.println("--------------------------------------------------");
        
        // Muestro el  tamaño actual de la pila y su tamaño maximo
        System.out.println("La pila tiene un tamaño de " + pilaString.tamano() + 
                " y un tamaño máximo de " + pilaString.getTamanoMaximo());
        
        // Muestro si la pila esta llena (no debería)
        System.out.println("¿Está la pila llena? " + pilaString.estaLlena());
        
        // Muestro si la pila esta vacía (no debería)
        System.out.println("¿Está la pila vacía? " + pilaString.estaVacia());
        System.out.println("--------------------------------------------------");
        
        // Relleno la pila con un array de Strings
        System.out.println("Relleno la pila con un array de 3 elementos:");
        String[] relleno = {"relleno1", "relleno2", "relleno3"};
        pilaString.rellenar(relleno);
        // La imprimo para comprobar
        pilaString.imprimirPila();
        System.out.println("--------------------------------------------------");
        
        // Saco los elementos de la pila a un array de objetos
        System.out.println("Saco los elementos de la pila a un array de objetos:");
        Object[] array = pilaString.sacarElementos();
        System.out.println("La pila tiene " + pilaString.tamano() + " elementos.");
        System.out.println("Imprimo el array con los elementos de la pila:");
        for(Object aux:array){
            System.out.print(aux + " ");
        }
        
        }
        
    }
