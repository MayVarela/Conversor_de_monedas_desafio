import java.util.Map;

public class CentroAmerica extends Continentes{
        public void consultaCentroAmerica() {
            var eleccionCentroAmerica = 1;

            while (eleccionCentroAmerica != 0) {
                System.out.println(mensajeCentroAmerica);
                eleccionCentroAmerica = scanner.nextInt();

                if (eleccionCentroAmerica != 0) {
                    Moneda monedaC = (Moneda) apiConversor.datosApi();
                    Map<String, Double> conversionRates = monedaC.conversion_rates();

                    String moneda = TipoMoneda.obtenerMonedaCentroAmerica(eleccionCentroAmerica);
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
