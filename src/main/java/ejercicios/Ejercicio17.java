/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        // Pido el string
        String lecturaMinusculas = leerString();
        
        
    }
    
    // Creo el atributo de clase de tipo Scanner
    private static Scanner teclado = new Scanner(System.in);
    
    // Método que lee un string por consola y pasarlo a minúsculas
    private static String leerString(){
        String lectura = "";
        lectura = teclado.nextLine();
        lectura.toLowerCase(); // Lo paso a minúsculas
        return lectura;
    }
    
    
    
}
