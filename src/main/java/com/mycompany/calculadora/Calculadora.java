package com.mycompany.calculadora;

import javax.swing.JOptionPane;
import clases.*;

/**
 *
 * @author mauriciounate
 */
public class Calculadora {

    public static void main(String[] args) {
        String entrada = "0";
        do {
            entrada = JOptionPane.showInputDialog(
                    "Seleccione una opción\n\n"
                    + "1. Realizar operación\n"
                    + "2. Salir\n");
            switch (entrada) {
                case "1":
                    Operar ObjOperar = new Operar();
                    ObjOperar.MostrarOpciones();
                    ObjOperar.menu(); 
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Calculadora cerrada");
                    entrada = "0";
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalidad");
                    break;
            }
        } while (entrada != "0");

    }
}
