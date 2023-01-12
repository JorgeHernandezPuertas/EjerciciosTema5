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
public class LanzarMonedaVariable {

    // Creo un atributos de clase
    private static Random aleatorio = new Random();
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        // Pregunto al usuario por consola cuántos lanzamientos quiere realizar
        int numeroLanzamientos = preguntarLanzamientos();
        
        // Creo el array de booleanos
        boolean[] arrayBooleanos = new boolean[numeroLanzamientos];

        // Relleno el array y lo imprimo como dice el enunciado
        rellenarArray(arrayBooleanos);
        imprimirArray(arrayBooleanos);
        System.out.println("---------------------------------------------");

        // Imprimo el recuento de caras y el de cruces para verlo
        System.out.println("Hay un total de " + recuentoCaras(arrayBooleanos) + " caras.");
        System.out.println("Hay un total de " + recuentoCruces(arrayBooleanos) + " cruces.");

    }

    // Método que simula un lanzamiento (true será cara y false será cruz)
    private static boolean lanzoMoneda() {
        return (aleatorio.nextInt(2) == 0) ? true : false;
    }

    // Método para rellenar el array con lanzamientos de moneda
    private static void rellenarArray(boolean[] arrayBooleanos) {
        for (int i = 0; i < arrayBooleanos.length; i++) {
            arrayBooleanos[i] = lanzoMoneda();
        }
    }

    // Método para saber cuántas caras han salido
    private static int recuentoCaras(boolean[] arrayBooleanos) {
        int recuentoCaras = 0;
        for (boolean aux : arrayBooleanos) {
            if (aux == true) {
                recuentoCaras++;
            }
        }
        return recuentoCaras;
    }

    // Método para saber cuántas cruces han salido
    private static int recuentoCruces(boolean[] arrayBooleanos) {
        int recuentoCruces = 0;
        for (boolean aux : arrayBooleanos) {
            if (aux != true) {
                recuentoCruces++;
            }
        }
        return recuentoCruces;
    }

    // Método que imprime el array como dice el enunciado
    private static void imprimirArray(boolean[] arrayBooleanos) {
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

    // Método para preguntar por teclado un número de lanzamientos controlando
    // excepciones
    private static int preguntarLanzamientos() {
        int numeroLanzamientos = 0;
        do {
            try {
                System.out.println("Introduce el número de lanzamientos que quieres"
                        + " realizar: ");
                numeroLanzamientos = teclado.nextInt();
                if (numeroLanzamientos <= 0){
                    System.out.println("El número de lanzamientos tiene que ser "
                            + "mayor que 0.");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Eso no es un entero. Hazlo de nuevo.");
            }
            System.out.println("---------------------------------------");
            teclado.nextLine(); // Limpio el buffer
        } while (numeroLanzamientos <= 0);
        return numeroLanzamientos;
    }
}
