import java.util.Map;

public class Consulta extends Continentes{

        Moneda monedaC = (Moneda) ApiConversor.datosApi();
        String ultimaActualizacion = monedaC.time_last_update_utc();
        String siguienteActualizacion = monedaC.time_next_update_utc();

    public void consultaSudamerica() {

        System.out.println(mensajeSudamerica);
        String entradaSudamerica = scanner.next();
        if (entradaSudamerica.equalsIgnoreCase("salir")){
            // Actualiza el flag de salida y rompe el bucle
            Principal.setExitFlag(true);
            return;
        }
            try {
                int eleccionSudamerica = Integer.parseInt(entradaSudamerica);
                while (eleccionSudamerica != 0) {

                    Map<String, Double> conversionRates = monedaC.conversion_rates();
                    String moneda = TipoMoneda.obtenerMonedaSudamerica(eleccionSudamerica);
                    if (moneda != null) {
                        System.out.printf("Digita la cantidad de %s que desea convertir a (USD)%n", moneda);
                        System.out.println("o escribe (salir) para volver al menu principal.");
                        String entrada = scanner.next();
                        if (entrada.equalsIgnoreCase("salir")) {
                            // Actualiza el flag de salida y rompe el bucle
                            Principal.setExitFlag(true);
                            return;
                        }
                        try {
                            double valor = Double.parseDouble(entrada);
                            System.out.println("-----------------------------------------------------------------");
                            CalculosResultado.convertirYMostrarResultado(valor, moneda, conversionRates);
                            System.out.printf("Ultima actualizacion de la tasa: %s%n", ultimaActualizacion);
                            System.out.printf("La siguiente acualizacion sera: %s%n", siguienteActualizacion);
                            System.out.println("-----------------------------------------------------------------");
                        } catch (Exception e) {
                            System.out.println("Porfavor introduce un valor valido");
                        }
                    } else {
                        System.out.println(opcionNoDisponible);
                    }
                    // Volver a pedir una nueva opción para Sudamérica después de cada iteración
                    System.out.println(mensajeSudamerica);
                    entradaSudamerica = scanner.next();

                    // Si la entrada es "salir", termina la ejecución
                    if (entradaSudamerica.equalsIgnoreCase("salir")) {
                        Principal.setExitFlag(true);
                        return; // Salimos del método
                    } try {
                        eleccionSudamerica = Integer.parseInt(entradaSudamerica);
                    } catch (Exception e) {
                        System.out.println("Por favor, introduce una opción válida.");
                        eleccionSudamerica = -1; // Opción inválida para forzar que siga el bucle
                    }
                }
                System.out.println("Has seleccionado la opción 0. Volviendo al menú principal...");
            } catch (Exception e) {
                System.out.println("...");
            }
    }

    public void consultaCentroAmerica() {

        System.out.println(mensajeCentroAmerica);
        String entradaCentroAmerica = scanner.next();

        if (entradaCentroAmerica.equalsIgnoreCase("salir")){
            // Actualiza el flag de salida y rompe el bucle
            Principal.setExitFlag(true);
            return;
        }
        try {
            int eleccionCentroAmerica = Integer.parseInt(entradaCentroAmerica);
            while (eleccionCentroAmerica != 0) {

                    Map<String, Double> conversionRates = monedaC.conversion_rates();
                    String moneda = TipoMoneda.obtenerMonedaCentroAmerica(eleccionCentroAmerica);

                    if (moneda != null) {
                        System.out.printf("Digita la cantidad de %s que desea convertir a (USD)%n", moneda);
                        System.out.println("o escribe (salir) para volver al menu principal.");
                        String entrada = scanner.next();
                        if (entrada.equalsIgnoreCase("salir")) {
                            // Actualiza el flag de salida y rompe el bucle
                            Principal.setExitFlag(true);
                            return;
                        }
                        try {
                            double valor = Double.parseDouble(entrada);
                            System.out.println("-----------------------------------------------------------------");
                            CalculosResultado.convertirYMostrarResultado(valor, moneda, conversionRates);
                            System.out.printf("Ultima actualizacion de la tasa: %s%n", ultimaActualizacion);
                            System.out.printf("La siguiente acualizacion sera: %s%n", siguienteActualizacion);
                            System.out.println("-----------------------------------------------------------------");
                        } catch (Exception e) {
                            System.out.println("Error: escribe un valor valido");
                        }
                    } else {
                        System.out.println(opcionNoDisponible);
                    }
                // Volver a pedir una nueva opción para Sudamérica después de cada iteración
                System.out.println(mensajeCentroAmerica);
                entradaCentroAmerica = scanner.next();

                // Si la entrada es "salir", termina la ejecución
                if (entradaCentroAmerica.equalsIgnoreCase("salir")) {
                    Principal.setExitFlag(true);
                    return; // Salimos del método
                } try {
                    eleccionCentroAmerica = Integer.parseInt(entradaCentroAmerica);
                } catch (Exception e) {
                    System.out.println("Por favor, introduce una opción válida.");
                    eleccionCentroAmerica = -1; // Opción inválida para forzar que siga el bucle
                }
            }
            System.out.println("Has seleccionado la opción 0. Volviendo al menú principal...");
        }catch (Exception e) {
            System.out.println("...");
        }
    }

    public void consultaNorteAmerica() {
        System.out.println(mensajeNorteAmerica);
        String entradaNorteAmerica = scanner.next();

        if (entradaNorteAmerica.equalsIgnoreCase("salir")){
            // Actualiza el flag de salida y rompe el bucle
            Principal.setExitFlag(true);
            return;
        }
        try {
            int eleccionNorteAmerica = Integer.parseInt(entradaNorteAmerica);

            while (eleccionNorteAmerica != 0) {
                switch (eleccionNorteAmerica) {
                    case 1:
                        consultaCodigoMoneda();
                        break;
                    case 2:
                        String moneda = "CAD";
                        Map<String, Double> conversionRates = monedaC.conversion_rates();
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println("Digital la cantidad de CAD que desea convertir a USD");
                        System.out.println("o escribe (salir) para volver al menu principal.");
                        System.out.println("-----------------------------------------------------------------");
                        String entradaCanada = scanner.next();

                        if (entradaCanada.equalsIgnoreCase("salir")){
                            // Actualiza el flag de salida y rompe el bucle
                            Principal.setExitFlag(true);
                            return;
                        }
                        try {
                            double valor = Double.parseDouble(entradaCanada);
                            System.out.println("-----------------------------------------------------------------");
                            CalculosResultado.convertirYMostrarResultado(valor, moneda, conversionRates);
                            System.out.printf("Ultima actualizacion de la tasa: %s%n", ultimaActualizacion);
                            System.out.printf("La siguiente acualizacion sera: %s%n", siguienteActualizacion);
                            System.out.println("-----------------------------------------------------------------");
                        }catch (NumberFormatException e){
                            System.out.println("Valor no válido. Por favor, ingese un numero.");
                        }
                        break;
                    default:
                        System.out.println("Opcion no disponible");
                        return;
                }
            }
        }catch (Exception e) {
            System.out.println("...");
        }
    }

    public void consultaCodigoMoneda(){

        ApiConversor apiConversor = new ApiConversor();
        System.out.println("Digita cuanto dinero USD quieres convertir?");
        System.out.println("o escribe (salir) para volver al menu principal.");
        double valorUsuario = scanner.nextDouble();
        Moneda monedaC = (Moneda) apiConversor.datosApi();
        Map<String, Double> conversionRates = monedaC.conversion_rates();

        System.out.println("-----------------------------------------------------------------");
        CalculosResultado.calculosUSD(valorUsuario, conversionRates);
        System.out.printf("Ultima actualizacion de la tasa: %s%n", ultimaActualizacion);
        System.out.printf("La siguiente acualizacion sera: %s%n", siguienteActualizacion);
        System.out.println("-----------------------------------------------------------------");
    }
}

