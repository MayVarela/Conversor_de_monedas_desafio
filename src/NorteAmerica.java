import java.util.Map;

public class NorteAmerica extends Continentes{
    public void consultaNorteAmerica() {
            var consultaNorteamerica = 1;

            while (consultaNorteamerica != 0) {
                System.out.println(mensajeNorteAmerica);
                consultaNorteamerica = scanner.nextInt();

                if (consultaNorteamerica != 0) {
                    Moneda monedaC = (Moneda) apiConversor.datosApi();
                    Map<String, Double> conversionRates = monedaC.conversion_rates();

                    String moneda = TipoMoneda.obtenerMonedaNorteAmerica(consultaNorteamerica);
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