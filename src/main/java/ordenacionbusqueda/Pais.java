/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenacionbusqueda;

import java.util.Objects;

/**
 *
 * @author jorge
 */
public class Pais implements Comparable<Pais>{
    
    private String nombre;
    private long poblacion; // Millones
    private long superficie; // Km2
    private String moneda;

    // Constructores
    public Pais() {
    }

    public Pais(String nombre, long poblacion, long superficie, String moneda) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.superficie = superficie;
        this.moneda = moneda;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public long getPoblacion() {
        return poblacion;
    }

    public long getSuperficie() {
        return superficie;
    }

    public String getMoneda() {
        return moneda;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPoblacion(long poblacion) {
        this.poblacion = poblacion;
    }

    public void setSuperficie(long superficie) {
        this.superficie = superficie;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    // hashCode y equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nombre);
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
        final Pais other = (Pais) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pais{");
        sb.append("nombre=").append(nombre);
        sb.append(", poblacion=").append(poblacion);
        sb.append(", superficie=").append(superficie);
        sb.append(", moneda=").append(moneda);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Pais o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }

    
    
    
    
    
    
}
