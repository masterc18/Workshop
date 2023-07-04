/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Talavera
 */
public class Estudiante {

    private String iD;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private Sexo sex;
    private LocalDate fechaNacimiento;
    private Carrera carrera;
    private LocalDate fechaIngreso;

    public Estudiante() {
    }

    public Estudiante(String iD, String nombre1, String nombre2, String apellido1, String apellido2, Sexo sex, LocalDate fechaNacimiento, Carrera carrera, LocalDate fechaIngreso) {
        this.iD = iD;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.sex = sex;
        this.fechaNacimiento = fechaNacimiento;
        this.carrera = carrera;
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
//        if (fechaIngreso.getYear() > LocalDate.now().getYear()
//                || fechaIngreso.getMonthValue() > LocalDate.now().getMonthValue()
//                || fechaIngreso.getDayOfMonth() > LocalDate.now().getDayOfMonth()) {
        if (ChronoUnit.DAYS.between(LocalDate.now(), fechaIngreso)) {

            JOptionPane.showMessageDialog(null, "Fecha incorrecta");

        } else {
            this.fechaIngreso = fechaIngreso;
        }
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Sexo getSex() {
        return sex;
    }

    public void setSex(Sexo sex) {
        this.sex = sex;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        if (LocalDate.now().getYear() - fechaNacimiento.getYear() < 15) {
            JOptionPane.showMessageDialog(null, "El alumno no tiene la edad para ingresar");
        } else {
            this.fechaNacimiento = fechaNacimiento;
        }

    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante: "
                + "\nID: " + iD
                + "\nPrimer nombre: " + nombre1
                + "\nSegundo nombre: " + nombre2
                + "\nPrimer apellido: " + apellido1
                + "\nSegundo apellido: " + apellido2
                + "\nSexo: " + sex
                + "\nFecha de nacimiento" + fechaNacimiento
                + "\nCarrera" + carrera
                + "\nFecha de ingreso: " + fechaIngreso
                + '\n';
    }

}
