/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Random;

/**
 *
 * @author jorge
 */

/*
Escribe una clase LanzarMoneda que tenga como único atributo un array de booleanos
de tamaño 1000. La clase tendrá los siguientes métodos: 
    -un método para rellenar el array, de forma que simule 1000 lanzamientos de 
    una moneda. El método debe almacenar el resultado de cada tirada en el array. 
    -un método para saber cuántas “caras” salieron después de los lanzamientos.
    -un método para saber cuántas “cruces” salieron después de los lanzamientos.
    -un método para imprimir el resultado de los 1000 lanzamientos, de forma que 
    aparezca el número de lanzamiento y el resultado (cara o cruz)

 */
public class LanzarMoneda {

    // Atributo de la clase
    private static boolean[] arrayBooleanos = new boolean[1000];

    public static void main(String[] args) {
        
        // Relleno el array y lo imprimo como dice el enunciado
        rellenarArray();
        imprimirArray();
        System.out.println("---------------------------------------------");
        
        // Imprimo el recuento de caras y el de cruces para verlo
        System.out.println("Hay un total de " + recuentoCaras() + " caras.");
        System.out.println("Hay un total de " + recuentoCruces()+ " cruces.");
        
    }

    // Creo un objeto Random para la clase
    private static Random aleatorio = new Random();

    // Método que simula un lanzamiento (true será cara y false será cruz)
    private static boolean lanzoMoneda() {
        return (aleatorio.nextInt(2) == 0) ? true : false;
    }

    // Método para rellenar el array con lanzamientos de moneda
    private static void rellenarArray() {
        for (int i = 0; i < arrayBooleanos.length; i++) {
            arrayBooleanos[i] = lanzoMoneda();
        }
    }

    // Método para saber cuántas caras han salido
    private static int recuentoCaras() {
        int recuentoCaras = 0;
        for (boolean aux : arrayBooleanos) {
            if (aux == true) {
                recuentoCaras++;
            }
        }
        return recuentoCaras;
    }

    // Método para saber cuántas cruces han salido
    private static int recuentoCruces() {
        int recuentoCruces = 0;
        for (boolean aux : arrayBooleanos) {
            if (aux != true) {
                recuentoCruces++;
            }
        }
        return recuentoCruces;
    }

    // Método que imprime el array como dice el enunciado
    private static void imprimirArray() {
        String resultado = "";
        for (int i = 0; i < arrayBooleanos.length; i++) {
            // Por cara resultado evaluo si es cara o cruz y lo imprimo.
            if (arrayBooleanos[i] == true) {
                resultado = "cara";
                System.out.println("El lanzamiento nº " + (i + 1) + " ha salido " + resultado + ".");
            } else {
                resultado = "cruz";
                System.out.println("El lanzamiento nº " + (i + 1) + " ha salido " + resultado + ".");
            }
        }
    }
}
