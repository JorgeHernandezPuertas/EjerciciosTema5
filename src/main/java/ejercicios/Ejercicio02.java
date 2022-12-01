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
public class Ejercicio02 {

    /*
    Escribe un programa para leer la altura de un número determinado de personas
    y calcular la altura media. El número de personas se pide por teclado y debe
    ser entero un entero mayor que cero. Posteriormente el programa irá pidiendo
    la altura, en cm, de cada una de las personas y las guardará en una estructura
    de almacenamiento. Si la altura leída no es positiva, el programa la pasará a 
    número positivo. También es necesario saber cuántas personas tienen una altura 
    superior a la media e inferior a la media. 
     */
    public static void main(String[] args) {

        // Declaro las variables que necesito
        int numPersonas, inferiorMedia = 0, superiorMedia = 0;
        double alturaPersona, sumaTotalAlturas = 0, mediaAlturas;
        
        // Pido el número de personas
        numPersonas = pedirPersonas();
        
        // Declaro e inicializo el array de alturas de personas con el número de personas
        double [] alturasPersonas = new double [numPersonas];
        
        // Pido el valor de la altura de cada elemento del array y lo voy sumando.
        for(int i = 0; i < alturasPersonas.length; i++){
            alturasPersonas[i] = pedirAltura();
            sumaTotalAlturas += alturasPersonas[i];
        }
        
        // Muestro cada valor del array para comprobar
        for(double aux:alturasPersonas){
            System.out.print(aux + " - ");
        }
        System.out.println("\n-----------------------------------------------");
        
        // Con la suma total calculo la media y la imprimo para comprobar
        mediaAlturas = sumaTotalAlturas/numPersonas;
        System.out.println("La media de alturas es " + mediaAlturas + "cms");
        System.out.println("-----------------------------------------------");
        
        // Calculo cuántas personas tienen una altura superior o inferior a la media
        for(double aux:alturasPersonas){
            if (aux < mediaAlturas){
                inferiorMedia++;
            } else {
                superiorMedia++;
            }
        }
        // Muestro cuántas personas son inferiores o superiores a la media
        System.out.println("Hay " + inferiorMedia + " personas con altura inferior a la media");
        System.out.println("Hay " + superiorMedia + " personas con altura superior a la media");
        
    }

    // Declaro e inicializo el objeto Scanner
    private static Scanner teclado = new Scanner(System.in);

    // Método para pedir el número de personas
    private static int pedirPersonas() {
        int numPersonas = -1;
        do {
            try {
                System.out.println("¿Cuántas personas vas a introducir? ");
                numPersonas = teclado.nextInt();
                if (numPersonas < 0) {
                    System.out.println("Tienes que introducir un número de personas mayor o igual a 0");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Introduce un entero.");
            }
            teclado.nextLine(); // Limpio buffer
        } while (numPersonas < 0);
        return numPersonas;
    }

    // Método para pedir la altura en cm
    private static double pedirAltura() {
        double alturaPersona = -1;
        do {
            try {
                System.out.println("Introduce la altura de la persona(en cm): ");
                alturaPersona = teclado.nextDouble();
                alturaPersona = Math.abs(alturaPersona);
            } catch (InputMismatchException ime) {
                System.out.println("Introduce un décimal.");
            }
            teclado.nextLine(); // Limpio buffer
        } while (alturaPersona < 0);
        return alturaPersona;
    }
}
