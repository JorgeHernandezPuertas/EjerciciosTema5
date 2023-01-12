/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author jorge
 */
public class ReservarAsientosAvion {

    public static void main(String[] args) {
        // Creo la matriz que representa los asientos del avión (25x4)
        // true significa que esta ocupado y false que no esta ocupado
        boolean[][] asientosOcupados = new boolean[25][4];
        System.out.println(stringMatriz(asientosOcupados));

    }

    // Método que hace un string de la matriz (para refrescar la matriz en el menu)
    private static String stringMatriz(boolean[][] asientosOcupados) {
        StringBuilder stringMatriz = new StringBuilder();
        // Creo un int que sea el contador de asientos
        int numeroAsiento = 1;

        // Recorro la matriz para transformar sus elementos
        for (int i = 0; i < asientosOcupados.length; i++) {
            for (int j = 0; j < asientosOcupados[i].length; j++) {
                // Creo la variable estaDisponible que dependiendo de si la matriz booleana
                // indica que esta ocupado o no cambia a disponible u ocupado
                String estaDispobile = (asientosOcupados[i][j] == false) ? "Disponible" : "Ocupado";
                stringMatriz.append(numeroAsiento).append(". ").
                        append(estaDispobile).append("\t");
                numeroAsiento++;
            }
            stringMatriz.append("\n");
        }
        return stringMatriz.toString();
    }

    // Método que imprime el menú por teclado
    private static void imprimirMenu(){
        String menu = "";
    }
    
}
