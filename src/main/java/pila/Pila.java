/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author jorge
 */
public class Pila<T> {

    // Atributos
    private List<T> pila;
    private int tamanoMaximo;

    // Constructores
    public Pila(int tamMax) {
        this.pila = new ArrayList();
        this.tamanoMaximo = tamMax;
    }

    // Getters
    public List<T> getPila() {
        return pila;
    }

    public int getTamanoMaximo() {
        return tamanoMaximo;
    }

    // Setters
    public void setPila(List<T> pila) {
        this.pila = pila;
    }

    public void setTamanoMaximo(int tamanoMaximo) {
        this.tamanoMaximo = tamanoMaximo;
    }
    
    // Método toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pila{");
        sb.append("pila=").append(pila);
        sb.append(", tamanoMaximo=").append(tamanoMaximo);
        sb.append('}');
        return sb.toString();
    }
    
    // Métodos hashCode y equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.pila);
        hash = 53 * hash + this.tamanoMaximo;
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
        final Pila<?> other = (Pila<?>) obj;
        if (this.tamanoMaximo != other.tamanoMaximo) {
            return false;
        }
        return Objects.equals(this.pila, other.pila);
    }
    
    // Método para apilar un elemento
    public boolean apilar(T elemento) {
        boolean puedeApilar = elemento != null && !estaLlena();
        // Controlo que no se metan elementos nulos
        if (puedeApilar) {
            this.pila.add(elemento);
        }
        return puedeApilar;
    }

    // Método que desapila el elemento que toque
    public boolean desapilar() {
        boolean noVacia = !this.pila.isEmpty();
        if (noVacia) {
            // Si no esta vacia elimino el ultimo elemento de la lista
            this.pila.remove(this.pila.size() - 1);
        }
        return noVacia;
    }

    // Método para saber si esta vacia
    public boolean estaVacia() {
        return this.pila.isEmpty();
    }

    // Método para saber si la pila esta llena
    public boolean estaLlena() {
        return this.pila.size() == this.tamanoMaximo;
    }

    // Método para saber el número de elementos que contiene la pila
    public int tamano() {
        return this.pila.size();
    }

    // Método para imprimir la pila por consola en orden de salida
    public void imprimirPila() {
        for (int i = this.pila.size() - 1; i >= 0; i--) {
            System.out.println("|\t" + this.pila.get(i) + "\t|");
        }
        System.out.println("--------------------------------------------------");
    }

    // Método para rellenar la pila mediante un array
    public void rellenar(T[] array) {
        // Si el tamaño final es mayor que el maximo cambio el maximo
        if (this.pila.size() + array.length > this.tamanoMaximo) {
            this.tamanoMaximo = this.pila.size() + array.length;
        }
        // Añado los elementos del array a la lista
        for (T aux : array) {
            this.pila.add(aux);
        }
    }

    // Método para sacar todos los elementos de la pila a un array y la pila se vacía
    public Object[] sacarElementos() {
        // Paso todos los objetos al array
        Object[] array = this.pila.toArray();
        // Vacio pila
        this.pila.removeAll(this.pila);
        // Devuelvo el array rellenado
        return array;
    }

    
}
