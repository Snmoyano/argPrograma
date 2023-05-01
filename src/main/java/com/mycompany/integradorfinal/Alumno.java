/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.integradorfinal;

import java.beans.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nicolas
 */
public class Alumno {

  String nombres;
    String legajo;
    public ArrayList<String> materiasAprobadas = new ArrayList<>();

    public Alumno() {
    }

    public Alumno(String nombres, String legajo) {
        this.nombres = nombres;
        this.legajo = legajo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public ArrayList<String> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(ArrayList<String> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

      @Override
    public String toString() {
        return "Alumno{" + "nombres=" + nombres + ", legajo=" + legajo + ", materiasAprobadas=" + materiasAprobadas + '}';
    }
   
}
