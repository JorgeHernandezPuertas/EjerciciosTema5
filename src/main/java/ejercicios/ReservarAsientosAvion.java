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
public class ReservarAsientosAvion {

    // Creo la matriz como atributo de la clase
    // Creo la matriz que representa los asientos del avión (25x4)
    // true significa que esta ocupado y false que no esta ocupado
    private static boolean[][] asientosOcupados = new boolean[25][4];

    // Creo el objeto Scanner como atributo de clase tambien
    private static Scanner teclado = new Scanner(System.in);

    // Creo constantes de la clase
    private static final int VALOR_SALIDA = 0;
    private static final int PRIMER_ASIENTO = 1;
    // Calculo el ultimo asiento en función de la longitud de la matriz
    private static final int ULTIMO_ASIENTO = asientosOcupados.length
            * asientosOcupados[0].length;

    public static void main(String[] args) {

        int opcion = 0;
        // Creo el bucle de la aplicación
        do {
            // Pido la opción al usuario
            opcion = pedirOpcion();
            if (opcion >= PRIMER_ASIENTO && opcion <= ULTIMO_ASIENTO) {
                cambiarAsiento(opcion);
            }
        } while (opcion != VALOR_SALIDA);
    }

    // Método que hace un string de la matriz (para refrescar la matriz en el menu)
    private static String stringMatriz() {
        StringBuilder stringMatriz = new StringBuilder();
        // Creo un int que sea el contador de asientos
        int numeroAsiento = 1;

        // Creo el string matriz
        // Cuadro la primera fila
        stringMatriz.append("|\t");
        // Recorro la matriz para transformar sus elementos
        for (int i = 0; i < asientosOcupados.length; i++) {
            for (int j = 0; j < asientosOcupados[i].length; j++) {
                // Creo la variable estaDisponible que dependiendo de si la matriz booleana
                // indica que esta ocupado o no cambia a disponible u ocupado
                String estaDispobile = (asientosOcupados[i][j] == false) ? "Disponible" : "Ocupado";
                if (j == 1) {
                    stringMatriz.append(numeroAsiento).append(". ").
                            append(estaDispobile).append("\t\t\t");
                } else {
                    stringMatriz.append(numeroAsiento).append(". ").
                            append(estaDispobile).append("\t");
                }
                numeroAsiento++;
            }
            stringMatriz.append("\t|\n|\t");
        } // Cuadro la ultima fila vacia para que cierre bien la caja 
        stringMatriz.append("\t\t\t\t\t\t\t\t\t\t\t|");
        return stringMatriz.toString();
    }

    // Método que imprime el menú por teclado
    private static void imprimirMenu() {
        String menu = """
                      -------------------------------------------------------------------------------------------------
                      |                                       Asientos del avión:                                     |
                      -------------------------------------------------------------------------------------------------
                      %s
                      -------------------------------------------------------------------------------------------------
                      |           º Introduce el número del asiento que quieras reservar/cancelar                     |
                      |            º Introduce '0' si quieres salir de la aplicación                                  |
                      -------------------------------------------------------------------------------------------------
                      """.formatted(stringMatriz());
        System.out.println(menu);
    }

    // Método para pedir su opción
    private static int pedirOpcion() {
        int opcion = -1;

        do {
            try {
                imprimirMenu();
                opcion = teclado.nextInt();
                if (opcion < VALOR_SALIDA || opcion > ULTIMO_ASIENTO) {
                    System.out.println("Introduce un asiento válido.");
                    System.out.println("--------------------------------------");
                }
            } catch (InputMismatchException ime) {
                System.out.println("La elección tiene que ser un entero válido.");
                System.out.println("--------------------------------------");
            }
            teclado.nextLine(); // Limpio el buffer
        } while (opcion < VALOR_SALIDA && opcion > ULTIMO_ASIENTO);
        return opcion;
    }

    // Método que cambia el asiento a disponible/ocupado dada una opción
    private static void cambiarAsiento(int opcion) {
        // Modifico la opcion para que corresponda al elemento de la matriz
        opcion--;
        // Uso el número de la opción para calcular en que columna y fila esta
        // el asiento que quiere cambiar
        int columna = opcion / asientosOcupados[0].length;
        int fila = opcion % asientosOcupados[0].length;
        // Cambio la opción con la fila y la columna calculada
        asientosOcupados[columna][fila] = !asientosOcupados[columna][fila];
    }
}
