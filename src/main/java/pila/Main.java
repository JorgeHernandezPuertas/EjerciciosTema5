/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

/**
 *
 * @author jorge
 */
public class prueba {
    public static void main(String[] args) {
        Pila<Integer> a = new Pila(10);
        a.apilar(2);
        a.apilar(2);
        a.apilar(2);
        a.apilar(2);
        a.apilar(2);
        a.apilar(2);
        
        Object[] array = a.sacarElementos();
        for(Object aux:array){
            System.out.println(aux);
        }
        
    }
}
