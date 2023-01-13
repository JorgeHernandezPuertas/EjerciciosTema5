/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        // Pido el string
        String lecturaMinusculas = leerString();
        
        // Lo convierto a arrayChar
        char[] arrayChar = convertirStringEnArrayChar(lecturaMinusculas);
        // Ordeno el array
        Arrays.sort(arrayChar);
        // Imprimo el array
        imprimirArray(arrayChar);
    }

    // Creo el atributo de clase de tipo Scanner
    private static Scanner teclado = new Scanner(System.in);

    // Método que lee un string por consola y pasarlo a minúsculas
    private static String leerString() {
        String lectura = "";
        System.out.println("Introduce un string: ");
        lectura = teclado.nextLine();
        lectura.toLowerCase(); // Lo paso a minúsculas
        return lectura;
    }

    // Método que pasa el string a un array de caracteres
    private static char[] convertirStringEnArrayChar(String stringMinusculas) {
        // Creo un array con la longitud del string
        char[] arrayChar = new char[stringMinusculas.length()];
        // Hago un bucle para introducer cada elemento del string en el array char
        for (int i = 0; i < arrayChar.length; i++) {
            arrayChar[i] = stringMinusculas.charAt(i);
        }
        return arrayChar;
    }

    // Método para ordenar el array de chars
    private static void ordenarArray(char[] arrayChar){
        Arrays.sort(arrayChar);
    }
    
    // Método para imprimir el array char
    private static void imprimirArray(char[] arrayChar){
        for(char aux:arrayChar){
            System.out.print(aux + ", ");
        }
    }
    
}
