import java.util.Map;

public class Continentes extends Mensajes {

    public void consultaContinente(){
        var eleccionContinente = 1;
        while (eleccionContinente != 0) {
            System.out.println(mensajeContinente);;

            eleccionContinente = scanner.nextInt();

            switch (eleccionContinente) {
                case 1:
                    consulta.consultaSudamerica();
                    break;
                case 2:
                    consulta.consultaCentroAmerica();
                    break;
                case 3:
                    consulta.consultaNorteAmerica();
                    break;
                case 4:
                    System.out.println(mensajeEuropa);
                    Moneda monedaC = (Moneda) apiConversor.datosApi();
                    Map<String, Double> conversionRates = monedaC.conversion_rates();
                    String entradaEuropa = scanner.next();

                    if (entradaEuropa.equalsIgnoreCase("salir")){
                        // Actualiza el flag de salida y rompe el bucle
                        Principal.setExitFlag(true);
                    }
                    try {
                        double valor = Double.parseDouble(entradaEuropa);
                        String moneda = "EUR";
                        CalculosResultado.convertirYMostrarResultado(valor, moneda, conversionRates);
                    }catch (Exception e){
                        System.out.println("...");
                    }
                    break;
                case 9:
                    System.out.println("""
                            Finalizando la aplicación
                            ....
                            Gracias por su visita""");
                    return;
                default:
                    System.out.println(opcionNoDisponible);
                    return;
            }
        }
    }
}