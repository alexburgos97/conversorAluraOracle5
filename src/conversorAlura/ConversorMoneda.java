package conversorAlura;

import javax.swing.*;

public class ConversorMoneda {
    //Creacion de un conversor de monedas
    double dolar;
    double cantidad;

    public void opcionMonedas() {
        String[] opcionesMonedas = {"De Dolar Soles Peruanos","Dolar a Euros", "De Dolar a Libras Esterlinas", "Dolar a Yen",
                "De Dolar a Won sul-coreano", "De Dolar a Pesos Colombianos", "De Dolar a Pesos Mexicanos", "Dolar a Real",
                "De Soles Peruanos a Dolar", "De Euros a Dolar", "De Libras Esterlinas a Dolar", "De Yen a Dolar",
                "De Won sul-coreano a Dolar", "De Pesos Colombianos a Dolar", "De Pesos Mexicanos a Dolar",
                "De Real a Dolar", "SALIR"};
        String op;
        do {
            op = (String) JOptionPane.showInputDialog(null, "Seleccione una opción", "Menú de Conversión",
                    JOptionPane.PLAIN_MESSAGE, null, opcionesMonedas, opcionesMonedas[0]);
            if (op == null || op.equals("SALIR")) {
                JOptionPane.showMessageDialog(null, "HASTA LUEGO");
                break;
            }
            switch (op) {
                case "De Dolar Soles Peruanos": //convertir de Dolar a Soles Peruanos
                    convertir(3.63, "Soles Peruanos");
                    JOptionPane.showMessageDialog(null, cantidad + " Dolares Equivalen a " + dolar + " Soles");
                    break;
                case "Dolar a Euros": //convertir de Dolar a Euros
                    convertir(0.91, "Euros");
                    JOptionPane.showMessageDialog(null, cantidad + " Dolares Equivalen a " + dolar + " Euros");
                    break;
                case "De Dolar a Libras Esterlinas": //Convertir de Dolar a Libras Esterlinas
                    convertir(0.78, "Libras Esterlinas");
                    JOptionPane.showMessageDialog(null, cantidad + " Dolares Equivalen a " + dolar + " Libras Esterlinas");
                    break;
                case "Dolar a Yen": //Convertir de Dolar a Yen
                    convertir(140.75, "Yen Japones");
                    JOptionPane.showMessageDialog(null, cantidad + " Dolares Equivalen a " + dolar + " Yenes");
                    break;
                case "De Dolar a Won sul-coreano": //De Dolar a Won Sur Coreano
                    convertir(1293.81, "Won surcoreano");
                    JOptionPane.showMessageDialog(null, cantidad + " Dolares Equivalen a " + dolar + " Wones");
                    break;
                case "De Dolar a Pesos Colombianos": //De Dolar a Pesos Colombianos
                    convertir(4160, "Pesos Colombianos");
                    JOptionPane.showMessageDialog(null, cantidad + " Dolares Equivalen a " + dolar + " Pesos Colombianos");
                    break;
                case "De Dolar a Pesos Mexicanos":
                    convertir(17.06, "Pesos Mexicanos");
                    JOptionPane.showMessageDialog(null, cantidad + " Dolares Equivalen a " + dolar + " Pesos Mexicanos");
                    break;
                case "Dolar a Real": //De Dolar a Real Brasileño
                    convertir(4.90, "Real Brasileño");
                    JOptionPane.showMessageDialog(null, cantidad + " Dolares Equivalen a " + dolar + " Reales");
                    break;

                    //Ahora La conversion de otras monedas a Dolares

                case "De Soles Peruanos a Dolar": //convertir de Soles Peruanos a Dolares
                    convertirADolar(3.63, "Soles Peruanos");
                    JOptionPane.showMessageDialog(null, cantidad + " Soles Equivalen a " + dolar + " Dolares");
                    break;
                case "De Euros a Dolar": //convertir de Euros a Dolares
                    convertirADolar(0.91, "Euros");
                    JOptionPane.showMessageDialog(null, cantidad + " Euros Equivalen a " + dolar + " Dolares");
                    break;
                case "De Libras Esterlinas a Dolar": //Convertir de Libras Esterlinas a Dolares
                    convertirADolar(0.78, "Libras Esterlinas");
                    JOptionPane.showMessageDialog(null, cantidad + " Dolares Equivalen a " + dolar + " Libras Esterlinas");
                    break;
                case "De Yen a Dolar": //Convertir de Yen a Dolares
                    convertirADolar(140.75, "Yen Japones");
                    JOptionPane.showMessageDialog(null, cantidad + " Yen Japones Equivalen a " + dolar + " Dolares");
                    break;
                case "De Won sul-coreano a Dolar": //De Won Sur Coreano a Dolares
                    convertir(1293.81, "Won surcoreano");
                    JOptionPane.showMessageDialog(null, cantidad + " Wones Equivalen a " + dolar + " Dolares");
                    break;
                case "De Pesos Colombianos a Dolar": //De Pesos Colombianos a Dolares
                    convertirADolar(4160, "Pesos Colombianos");
                    JOptionPane.showMessageDialog(null, cantidad + " Pesos Colombianos Equivalen a " + dolar + " Dolares");
                    break;
                case "De Pesos Mexicanos a Dolar": //De Pesos Mexicanos a Dolares
                    convertirADolar(17.06, "Pesos Mexicanos");
                    JOptionPane.showMessageDialog(null, cantidad + " Pesos Mexicanos Equivalen a " + dolar + " Dolares");
                    break;
                case "De Real a Dolar": //De Real Brasileño a Dolares
                    convertirADolar(4.90, "Real Brasileño");
                    JOptionPane.showMessageDialog(null, cantidad + " Dolares Equivalen a " + dolar + " Reales");
                    break;

                case "SALIR": //Salir
                    JOptionPane.showMessageDialog(null, "CONVERSOR DE MONEDA FINALIZADO");
                    break;
            }
        }while (!op.equals("SALIR"));
    }

    public void convertir ( double valorMonedaLocal, String moneda){
        boolean esUnNumero = false;
        do {
            String input = JOptionPane.showInputDialog(null, "Ingrese el valor de su moneda");
            try {
                cantidad = Double.parseDouble(input);
                esUnNumero = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (!esUnNumero);

        dolar = cantidad * valorMonedaLocal;
        dolar = (double) Math.round(dolar * 100d) / 100;
    }
    public void convertirADolar ( double valorMonedaLocal, String moneda){
        boolean esUnNumero = false;
        do {
            String input = JOptionPane.showInputDialog(null, "Ingrese el valor de su moneda");
            try {
                cantidad = Double.parseDouble(input);
                esUnNumero = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (!esUnNumero);

        dolar = cantidad / valorMonedaLocal;
        dolar = (double) Math.round(dolar * 100d) / 100;
    }
}

