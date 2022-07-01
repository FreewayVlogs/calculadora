/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.calculadora;

import javax.swing.JOptionPane;
import clases.*;

/**
 *
 * @author mauriciounate
 */
public class Calculadora {

    public static void main(String[] args) {
        byte entrada = 0;
        byte operar = 0;

        do {
            entrada = Byte.parseByte(JOptionPane.showInputDialog(
                    "Seleccione una opción\n\n"
                    + "1. Realizar operación\n"
                    + "2. Salir\n"));
            switch (entrada) {
                case 1:
                    Operar ObjOperar = new Operar();
                    ObjOperar.leerOpcion(); 
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Cerrado con exito");
                    entrada = 0;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalidad");
                    break;
            }

        } while (entrada != 0);

    }
}
