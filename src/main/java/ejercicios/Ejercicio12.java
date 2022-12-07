/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author jorge
 */
public class Ejercicio12 {

    /*
    Declara e inicializa una matriz de caracteres de 2x3, con los valores que tú
    quieras. Implementa un método, en la misma clase que el método main(), que 
    reciba una matriz de caracteres y la imprima por consola.
     */
    public static void main(String[] args) {
        // Declaro e inicializo la matriz
        String[][] matriz = new String[2][3];

        // Relleno la matriz del caracter "0"
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = "0";
            }
        }

        // Imprimo la matriz de caracteres por consola
        imprimirMatrizCaracteres(matriz);
    }

    // Método para imprimir una matriz de carácteres
    private static void imprimirMatrizCaracteres(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " - ");
            }
            System.out.println("");
        }
    }
}
