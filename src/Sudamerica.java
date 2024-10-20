import java.util.Map;

public class Sudamerica extends Continentes {

    public void consultaSudamerica() {
        var eleccionSudamerica = 1;

        while (eleccionSudamerica != 0) {
            System.out.println(mensajeSudamerica);
            eleccionSudamerica = scanner.nextInt();

            if (eleccionSudamerica != 0) {
                Moneda monedaC = (Moneda) apiConversor.datosApi();
                Map<String, Double> conversionRates = monedaC.conversion_rates();

                String moneda = TipoMoneda.obtenerMonedaSudamerica(eleccionSudamerica);
                if (moneda != null) {
                    System.out.println(mensajeDigitaCantidad);
                    double valor = scanner.nextDouble();
                    CalculosResultado.convertirYMostrarResultado(valor, moneda, conversionRates);
                } else {
                    System.out.println(opcionNoDisponible);
                }
            }
        }
        scanner.close();
    }
}