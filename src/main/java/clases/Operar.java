package clases;

import javax.swing.JOptionPane;

public class Operar {

    private byte operacion = 10;
    private String numero1 = "", numero2 = "";
    private double resultado;

    ;

public void leerOpcion() {

        operacion = Byte.parseByte(JOptionPane.showInputDialog(
                "Seleccione una operación\n\n"
                + "1. Suma\n"
                + "2. Resta\n"
                + "3. Multiplicación\n"
                + "4. Divición\n"
                + "5. Potencia\n"
                + "6. Raiz Cuadrada\n"
                + "7. Salir\n"));
    }

    public void leerNumeros() {
        numero1 = "";
        numero2 = "";
        numero1 = JOptionPane.showInputDialog("Ingrese primer numero\n\n");
        numero2 = JOptionPane.showInputDialog("Ingrese segundo numero\n\n");
        numero2 = JOptionPane.showInputDialog("Ingrese segundo numero\n\n");
    }

    public void leerNumero() {
        numero1 = "";
        numero1 = JOptionPane.showInputDialog("Ingrese numero\n\n");

    }

    public void menu() {

        do {
            switch (operacion) {
                case 1:
                    leerNumeros();
                    resultado = Double.parseDouble(numero1) + Double.parseDouble(numero2);
                    JOptionPane.showMessageDialog(null, "La suma es: " + resultado);
                    break;
                case 2:

                    leerNumeros();
                    resultado = Double.parseDouble(numero1) - Double.parseDouble(numero2);
                    JOptionPane.showMessageDialog(null, "La resta es: " + resultado);
                    break;
                case 3:
                    leerNumeros();
                    resultado = Double.parseDouble(numero1) * Double.parseDouble(numero2);
                    JOptionPane.showMessageDialog(null, "La multiplicación es: " + resultado);
                    break;
                case 4:
                    leerNumeros();
                    if (Double.parseDouble(numero1) != 0 && Double.parseDouble(numero2) != 0) {
                        resultado = Double.parseDouble(numero1) / Double.parseDouble(numero2);
                        JOptionPane.showMessageDialog(null, "La divición es: " + resultado);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se puede dividir con ceros");
                    }
                    break;
                case 5:
                    leerNumeros();
                    resultado = Math.pow(Double.parseDouble(numero1), Double.parseDouble(numero2));
                    JOptionPane.showMessageDialog(null, "La potencia es: " + resultado);
                    break;
                case 6:
                    leerNumero();
                    resultado = Math.sqrt(Double.parseDouble(numero1));
                    JOptionPane.showMessageDialog(null, "La raíz cuadrada es: " + resultado);
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Cerrado con exito");
                    operacion = 7;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalidad");
                    break;
            }

        } while (operacion
                != 7);

    }
}
