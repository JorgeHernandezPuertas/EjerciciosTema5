/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio24;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author jorge
 */

/*
Desarrolla una clase ListaReproduccion con los siguientes atributos y métodos. 
Es necesario implementar la clase Cancion:

    Atributos:
 -canciones: una lista de objetos de la clase Cancion.

    Métodos (recuerda implementar equals y hashcode en Cancion)
 -constructor predeterminado (creará e inicializará la lista).
 -numeroCanciones(): devuelve el número de canciones de la lista.
 -estaVacia(): devuelve si la lista de reproducción está vacía.
 -escucharCancion(int): devuelve la Cancion que se encuentra en la posición indicada.
 -cambiarCancion(int, Cancion): cambia la Cancion de la posición indicada por la 
  nueva Cancion proporcionada.
 -grabarCancion(Cancion): agrega al final de la lista la Cancion proporcionada.
 -eliminaCancion(int): elimina la Cancion que se encuentra en la posición indicada.
 -eliminaCancion(Cancion c), elimina el objeto c si se encuentra en la lista de 
  reproducción. Usa el método remove(Cancion)
 -imprimirLista (ListaReproduccion tmp). Método de clase que imprime los nombres 
  de las canciones contenidas en tmp.
 -buscarCancion(Cancion c), busca la canción c en la lista de reproducción y 
  devuelve la posición en la que se encuentra. Usa el método indexOf.
 -Incluye un par de métodos de ordenación (por ejemplo, por título y por cantante) 
  usando el método Collections.sort(lista, criterioComparator)
 -Añade también métodos para buscar, usando Collections.binarySearch(lista, 
  objeto, criterioComparator)
 */
public class ListaReproduccion {

    // Atributos
    private List<Cancion> lista;

    // Constructor
    public ListaReproduccion() {
        this.lista = new ArrayList<>();
    }

    // Getter
    public List<Cancion> getLista() {
        return lista;
    }

    // Setter
    public void setLista(List<Cancion> lista) {
        this.lista = lista;
    }

    // equals y hashCode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.lista);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ListaReproduccion other = (ListaReproduccion) obj;
        return Objects.equals(this.lista, other.lista);
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ListaReproduccion{");
        sb.append("lista=").append(lista);
        sb.append('}');
        return sb.toString();
    }

    // Método que devuelve el número de canciones de la lista
    public int numeroCanciones() {
        return this.lista.size();
    }

    // Método que devuelve si esta vacia (true si esta vacia)
    public boolean estaVacia() {
        return this.lista.isEmpty();
    }

    // Método que devuelve la canción metiendo su posición (devuelve null si el índice no existe)
    public Cancion escucharCancion(int posicion) {
        try {
            return this.lista.get(posicion);
        } catch (IndexOutOfBoundsException iobe) {
            return null;
        }
    }
    
    // Método que cambia las canciones de posición
    public void cambiarCancion(int posicion, Cancion cancion){
        this.lista.set(posicion, cancion);
    }
}
