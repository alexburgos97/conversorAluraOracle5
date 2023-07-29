package conversorAlura;

import javax.swing.*;

public class ConversorTemperatura {
    public void Convertir(){
        //Conversión de temperatura: Escribe un programa que convierta grados Celsius a Fahrenheit y viceversa.
        int gradosC;
        int gradosF;
        int formula;

        String[] opciones = { "Celsius a Fahrenheit", "Fahrenheit a Celsius", "Salir" };
        int op = 0;
        do {
            try {
                op = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Convertidor de temperaturas",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

                switch (op) {
                    case 0: //convertir de grados Celsius a Fahrenheit
                        gradosC = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la temperatura °C "));
                        formula = (gradosC * 9 / 5) + 32;
                        JOptionPane.showMessageDialog(null, gradosC + " Grados C° Equivalen a : " + formula + " Grados °F");
                        break;
                    case 1: //convertir de grados Fahrenheit a Celsius
                        gradosF = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la temperatura °F "));
                        formula = (gradosF - 32) * 5 / 9;
                        JOptionPane.showMessageDialog(null, gradosF + " Grados F° Equivalen a : " + formula + " Grados °C");
                        break;
                    case 2: //Salir
                        JOptionPane.showMessageDialog(null, "CONVERSOR DE TEMPERATURA FINALIZADO");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "¡ERROR!\nOPCIÓN NO VALIDA\n" +
                                "VUELVA A INTENTAR");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (op != 2);
    }
}

