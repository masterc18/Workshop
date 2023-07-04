/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Talavera
 */
public class Carrera {

    private String id;
    private String nombre;
    private String descripcion;
    private double precio;

    public Carrera() {
    }

    public Carrera(String id, String nombre, String descripcion, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
//Verifique que el precio no sea menor o igual a 0

    public void setPrecio(double precio) {
        if (precio <= 0) {
            JOptionPane.showMessageDialog(null, "Error de pago");
        } else {
            this.precio = precio;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Carrera:" + id + "\tNombre: " + nombre
                + "\nDescripcion: " + descripcion
                + "\nPrecio: " + precio
                + "\n";
    }

}
