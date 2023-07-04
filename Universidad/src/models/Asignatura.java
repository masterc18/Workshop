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
public class Asignatura {

    private String nombre;
    private String codigo;
    private String descripcion;
    private int creditos;

    public Asignatura() {
    }

    public Asignatura(String nombre, String codigo, String descripcion, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        if (creditos < 0) {
            JOptionPane.showMessageDialog(null, "Error de asignacion de creditos ");
        } else {
            this.creditos = creditos;
        }

    }

    @Override
    public String toString() {
        return "Asignatura:" + nombre + "\tCodigo: " + codigo
                + "\tDescripcion: " + descripcion + "\tCreditos: " + creditos
                + "\n";
    }

}
