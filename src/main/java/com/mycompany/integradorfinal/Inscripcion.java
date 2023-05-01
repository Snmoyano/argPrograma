/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.integradorfinal;

import java.util.Date;

/**
 *
 * @author nicolas
 */
public class Inscripcion {
     Alumno alumno;
    Materia materia;
    Date fecha = new Date();

    public Inscripcion() {
    }

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void validarInscripcion(Materia materia, Alumno alumno) {
        if (materia.getCorrelativas().containsAll(alumno.getMateriasAprobadas())) {
            System.out.println("Inscripcion aprobada");
        } else {
            System.out.println("Inscripcion no aceptada");
    }
}
}
