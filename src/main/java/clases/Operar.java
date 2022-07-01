package clases;

import javax.swing.JOptionPane;

public class Operar {

    private String operacion = "", numero1 = "", numero2 = "";

    ;

public void leerOpcion() {

        operacion = JOptionPane.showInputDialog(
                "Seleccione una operación\n\n"
                + "1. Suma\n"
                + "2. Resta\n"
                + "3. Multiplicación\n"
                + "4. Divición\n"
                + "5. Potencia\n"
                + "6. Raiz Cuadrada\n"
                + "7. Salir\n");
        if (operacion == "6") {
            leerNumero();
        } else {
            leerNumeros();
        }
    }

    public void leerNumeros() {

        numero1 = JOptionPane.showInputDialog("Ingrese primer numero\n\n");
        numero2 = JOptionPane.showInputDialog("Ingrese segundo numero\n\n");
    }

    public void leerNumero() {

        numero1 = JOptionPane.showInputDialog("Ingrese numero\n\n");

    }
       public void menu() {

        numero1 = JOptionPane.showInputDialog("Ingrese numero\n\n");

    }
}
