/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacionbusqueda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author jorge
 */
public class OrdenacionBusquedaPractica {

    public static void main(String[] args) {

        // Creo la lista de paises
        List<Pais> paises = new ArrayList<>();
        paises.add(new Pais("España", 47, 123_123, "Euro"));
        paises.add(new Pais("China", 7_000, 678_345, "Yuan"));
        paises.add(new Pais("Rusia", 3_500, 1_234_235, "Rublo"));
        paises.add(new Pais("Suiza", 25, 50_234, "Franco"));
        paises.add(new Pais("EEUU", 1_250, 123_123, "Dólar Américano"));
        paises.add(new Pais("Italia ", 52, 120_000, "Euro"));

        // Ordeno por nombres
        ordenarNombre(paises);
        System.out.println("----------- Después de ordenar por nombre -----------");
        imprimirLista(paises);
        
        // Ordeno por moneda y luego nombre
        ordenarMonedaNombre(paises);
        System.out.println("----------- Después de ordenar por moneda y luego nombre -----------");
        imprimirLista(paises);
        
        // Ordeno por superficie de mayor a menor
        ordenarSuperficie(paises);
        System.out.println("----------- Después de ordenar por superficie inversa -----------");
        imprimirLista(paises);
        
        // Búsquedas
        System.out.println("El país que se llama Suiza es " + 
                paises.get(busquedaNatural(paises, "Suiza")));
        System.out.println("El país que tiene de moneda el Yuan es " + 
                paises.get(busquedaMoneda(paises, "Yuan")));
        System.out.println("El país que tiene 1.234.235 de superficie es " + 
                paises.get(busquedaSuperficie(paises, 1234235)));

    }
    
    // Creo un objeto de clase de tipo Pais para usarlo en los métodos de búsqueda
    private static Pais objetoBusqueda = new Pais();

    // Método para ordenar por nombre
    private static void ordenarNombre(List<Pais> paises) {
        Collections.sort(paises);
    }

    // Método para ordenar por moneda y en caso de empate por nombre
    private static void ordenarMonedaNombre(List<Pais> paises) {
        Comparator<Pais> criterioMoneda = (p1, p2) -> p1.getMoneda().
                compareToIgnoreCase(p2.getMoneda());
        Comparator<Pais> criterioNombre = (p1, p2) -> p1.getNombre().
                compareToIgnoreCase(p2.getNombre());
        Collections.sort(paises, criterioMoneda.thenComparing(criterioNombre));
    }

    // Método para ordenar por superficie de menor a mayor
    private static void ordenarSuperficie(List<Pais> paises) {
        Comparator<Pais> criterioSuperficie = (p1, p2) -> Long.
                compare(p1.getSuperficie(), p2.getSuperficie());
        Collections.sort(paises, criterioSuperficie.reversed());
    }
    
    // Método que imprime la lista
    private static void imprimirLista(List<Pais> paises){
        paises.forEach(System.out::println);
        System.out.println("---------------------------------------------------");
    }
    
    // Método que busca un objeto Pais por superficie
    private static int busquedaSuperficie(List<Pais> paises, long superficie){
        // Creo el criterio inicial
        Comparator<Pais> criterio = (p1, p2) -> Long.
                compare(p1.getSuperficie(), p2.getSuperficie());
        // Modifico el criterio para que coincida con el que he usado al ordenar
        criterio = criterio.reversed();
        objetoBusqueda.setSuperficie(superficie);
        ordenarSuperficie(paises);
        return Collections.binarySearch(paises, objetoBusqueda, criterio);
    }
    
    // Método que busca un objeto por orden natural (nombre)
    private static int busquedaNatural(List<Pais> paises, String nombre){
        objetoBusqueda.setNombre(nombre);
        ordenarNombre(paises);
        return Collections.binarySearch(paises, objetoBusqueda);
    }
    
    // Método que busca un objeto por moneda
    private static int busquedaMoneda(List<Pais> paises, String moneda){
        // Creo el criterio inicial
        Comparator<Pais> criterio = (p1, p2) -> p1.getMoneda().
                compareToIgnoreCase(p2.getMoneda());
        // Modifico el criterio para que corresponda al que he hecho de ordenar
        objetoBusqueda.setMoneda(moneda);
        ordenarMonedaNombre(paises);
        return Collections.binarySearch(paises, objetoBusqueda, criterio);
    }
}
