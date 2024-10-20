public class Continentes extends Mensajes {
    static Mensajes menu = new Mensajes();

    public void consultaContinente(){
        var eleccionContinente = 0;
        while (eleccionContinente != 9) {
            System.out.println(mensajeContinente);;

            eleccionContinente = scanner.nextInt();

            switch (eleccionContinente) {
                case 1:
                    switchCaseSudamerica.consultaSudamerica();
                    break;
                case 2:
                    switchCaseCentroAmerica.consultaCentroAmerica();
                    break;
                case 3:
                    switchCaseNorteAmerica.consultaNorteAmerica();
                    break;
                case 4:
                    System.out.println(mensajeEuropa);
                    double convertirEuros = scanner.nextDouble();
                    break;
                case 9:
                    System.out.println("""
                            Finalizando la aplicación
                            ....
                            Gracias por su visita""");
                    break;
                default:
                    System.out.println(opcionNoDisponible);
            }
        }
    }
}