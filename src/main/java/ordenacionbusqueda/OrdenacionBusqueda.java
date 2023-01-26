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
public class OrdenacionBusqueda {
    
    public static void main(String[] args) {
        List<Pais> paises = new ArrayList<>();
        paises.add(new Pais("España", 46, 505_944, "Euro"));
        paises.add(new Pais("Portugal", 23, 25_400, "Euro"));
        paises.add(new Pais("EEUU", 146, 1_505_944, "Dólar Americano"));
        paises.add(new Pais("Italia", 46, 505944, "Euro"));
        
        paises.forEach(System.out::println);
        
        
        // Ordenar por nombre (con comparable)
        Collections.sort(paises);
        System.out.println("------------- Después de ordenar por nombre ------------------");
        paises.forEach(System.out::println);
        
        
        // Ordenar por población (con comparator)
        Comparator<Pais> criterioPoblacion = (p1, p2) -> Long.compare(p1.getPoblacion(), p2.getPoblacion());
        Collections.sort(paises, criterioPoblacion.reversed());
        System.out.println("------------- Después de ordenar por población ------------------");
        paises.forEach(System.out::println);
        
        
        // Ordenar por superficie
        Comparator<Pais> criterioSuperficie = (p1, p2) -> Long.compare(p1.getSuperficie(), p2.getSuperficie());
        Comparator<Pais> criterioNombre = (p1, p2) -> p1.getNombre().compareToIgnoreCase(p2.getNombre());
        // Ordeno primero por superficie y en caso de empate ordeno por nombre
        Collections.sort(paises, criterioSuperficie.thenComparing(criterioNombre));
        System.out.println("------------- Después de ordenar por superficie ------------------");
        paises.forEach(System.out::println);
        
        
        // Búsqueda por orden natural (por nombre)
        // La lista donde buscar la información esta ordenada previamente según
        // el criterio del orden natural (nombre) --> Comparable en País
        Collections.sort(paises);
        System.out.println("------------- Búsqueda binaria ------------------");
        System.out.println("------------- Lista ordenada según orden natural (nombre) ------------------");
        paises.forEach(System.out::println);
        Pais objetoBuscar = new Pais();
        // Lista ordenada por nombre, búsqueda por nombre, key en nombre
        objetoBuscar.setNombre("Portugal");
        int posicion = Collections.binarySearch(paises, objetoBuscar);
        System.out.println("La posicion es " + posicion);
        System.out.println("---------------------------------------------------");
        
        
        // Si intento buscar en la lista con un valor que no es nombre se puede
        // obtener una posicion errónea
        objetoBuscar.setNombre("");
        objetoBuscar.setPoblacion(23);
        posicion = Collections.binarySearch(paises, objetoBuscar);
        System.out.println("La posicion es " + posicion);
        System.out.println("---------------------------------------------------");
        
        // Si ordeno la lista por un criterio y busco por otro, el resultado es inesperado
        
        // Ordeno y busco por otro criterio que no es el natural
        System.out.println("------------ Ordenación y búsqueda por población ------------------");
        Collections.sort(paises, criterioPoblacion);
        paises.forEach(System.out::println);
        objetoBuscar.setPoblacion(146);
        posicion = Collections.binarySearch(paises, objetoBuscar, criterioPoblacion);
        System.out.println("El país que tiene 146 millones es " + paises.get(posicion));
        
        
        
    }
}
