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
        
        
    }
}
