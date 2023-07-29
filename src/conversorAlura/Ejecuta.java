package conversorAlura;

import javax.swing.*;

public class Ejecuta {
    public static void main(String[] args) {
        ConversorMoneda conversorMoneda = new ConversorMoneda();
        ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
        String menuConversion[] = {"Conversor de Moneda", "Conversor de Temperatura", "SALIR"};
        String op;
        do {
            op = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Menú de Conversión",
                    JOptionPane.PLAIN_MESSAGE, null, menuConversion, menuConversion[0]);
            if (op == null || op.equals("SALIR")) {
                JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO");
                break;
            }
            switch (op) {
                case "Conversor de Moneda":
                    conversorMoneda.opcionMonedas();
                    break;
                case "Conversor de Temperatura":
                    conversorTemperatura.Convertir();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
            }
        } while (!op.equals("SALIR"));
    }
}
