package clases;

import javax.swing.JOptionPane;

public class Operar {

    private byte operacion = 10;
    private String numero1 = "", numero2 = "";
    private double resultado;
    private boolean EsNumero1;
    private boolean EsNumero2;
    private boolean SumBuleano;

    public void MostrarOpciones() {

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

        do {
            numero1 = "";
            numero2 = "";
            numero1 = JOptionPane.showInputDialog("Ingrese primer numero\n\n");
            numero2 = JOptionPane.showInputDialog("Ingrese segundo numero\n\n");
            EsNumero1 = numero1.matches("[+-]?\\d*(\\.\\d+)?");
            EsNumero2 = numero2.matches("[+-]?\\d*(\\.\\d+)?");
            SumBuleano = EsNumero1 && EsNumero2;
            if (SumBuleano == false) {
                JOptionPane.showMessageDialog(null, "Solo pueden ser valores numéricos");
            }
        } while (SumBuleano = !true);
    }

    public void leerNumero() {
        do {
            numero1 = "";
            numero1 = JOptionPane.showInputDialog("Ingrese numero\n\n");
            EsNumero1 = numero1.matches("[+-]?\\d*(\\.\\d+)?");
            if (EsNumero1 == false) {
                JOptionPane.showMessageDialog(null, "Solo pueden ser valores numéricos");
            }
        } while (EsNumero1 = !true);

    }

    public void menu() {

        do {
            switch (operacion) {
                case 1:
                    leerNumeros();
                    resultado = Double.parseDouble(numero1) + Double.parseDouble(numero2);
                    JOptionPane.showMessageDialog(null, "La suma es: " + resultado);
                    MostrarOpciones();
                    menu();
                    break;
                case 2:

                    leerNumeros();
                    resultado = Double.parseDouble(numero1) - Double.parseDouble(numero2);
                    JOptionPane.showMessageDialog(null, "La resta es: " + resultado);
                    MostrarOpciones();
                    menu();
                    break;
                case 3:
                    leerNumeros();
                    resultado = Double.parseDouble(numero1) * Double.parseDouble(numero2);
                    JOptionPane.showMessageDialog(null, "La multiplicación es: " + resultado);
                    MostrarOpciones();
                    menu();
                    break;
                case 4:
                    leerNumeros();
                    if (Double.parseDouble(numero1) != 0 && Double.parseDouble(numero2) != 0) {
                        resultado = Double.parseDouble(numero1) / Double.parseDouble(numero2);
                        JOptionPane.showMessageDialog(null, "La divición es: " + resultado);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se puede dividir con ceros");
                    }
                    MostrarOpciones();
                    menu();
                    break;
                case 5:
                    leerNumeros();
                    resultado = Math.pow(Double.parseDouble(numero1), Double.parseDouble(numero2));
                    JOptionPane.showMessageDialog(null, "La potencia es: " + resultado);
                    MostrarOpciones();
                    menu();
                    break;
                case 6:
                    leerNumero();
                    resultado = Math.sqrt(Double.parseDouble(numero1));
                    JOptionPane.showMessageDialog(null, "La raíz cuadrada es: " + resultado);
                    MostrarOpciones();
                    menu();
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Calculadora Cerrada");
                    operacion = 7;
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalidad");
                    MostrarOpciones();
                    menu();
                    break;
            }

        } while (operacion != 7);

    }
}
