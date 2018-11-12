/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author HugoLuna
 */
public class ListImpre implements Comparable<ListImpre>{
    
     private String nombre;
     private int prioridad; // 1 baja, 2 mediana, 3 alta
     private String ruta;

    public ListImpre(String nombre, int prioridad, String ruta) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.ruta = ruta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
     
     
    @Override
    public int compareTo(ListImpre o) {
        if (prioridad < o.getPrioridad()) {
            return 1;
        } else if (prioridad > o.getPrioridad()) {
            return -1;
        } else {
            return 0;
        }
    }
     




    
}
