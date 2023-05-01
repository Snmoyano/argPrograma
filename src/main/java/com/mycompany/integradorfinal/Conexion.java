/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.integradorfinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author nicolas
 */
public class Conexion {
 public Connection conectar = null;
    String usuario = "root";
    String contraseña = "rootroot";
    String bd = "argprograma";
    String ip = "localhost";
    String puerto = "3306";

    String ruta = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    public Connection estableceConexion() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //llama al driver
            conectar = DriverManager.getConnection(ruta, usuario, contraseña);
            JOptionPane.showMessageDialog(null, "Se conecto correctamente");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se conecto correctamente" + e);
        }

        return conectar;
    }

    public void cerrarConnection() throws SQLException {
        try {
            conectar.close();
        } catch (Exception e) {
        }
    }
}
