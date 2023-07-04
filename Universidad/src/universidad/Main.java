/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidad;

import java.time.LocalDate;
import java.time.Month;
import models.Estudiante;

/**
 *
 * @author Carlos Talavera
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante est1 = new Estudiante();
        est1.setFechaIngreso(LocalDate.of(2023, Month.MARCH, 0));

    }

}
