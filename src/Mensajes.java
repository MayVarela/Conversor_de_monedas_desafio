import java.util.Scanner;

public class Mensajes {
    static Continentes switchCaseContinentes = new Continentes();
    static Sudamerica switchCaseSudamerica = new Sudamerica();
    static CentroAmerica switchCaseCentroAmerica = new CentroAmerica();
    static NorteAmerica switchCaseNorteAmerica = new NorteAmerica();
    ApiConversor apiConversor = new ApiConversor();
    String mensajeDigitaCantidad = """
            Digita la cantidad de dinero que desea convertir a (USD)""";
    String opcionNoDisponible = "Opcion no disponible";

    // Menus principal y secundarios (continentes y paises)
    String mensajeContinente = """
                ---------------------------------------------------------------------------
                Hola! Bienvenido a el conversor de monedas a USD del continente Americano.
                
                Para convertir una moneda a USD por favor elija en que parte de America esta
                ubicado el pais de la moneda que desea convertir.
                Si quieres convertir dolares a otra moneda entra en (America del Norte/USD)
                y luego elige la moneda a la que vas a convertir.
                
                1. America del Sur
                2. Centro America
                3. America del Norte
                4. EUR (Union Europea)
                9. SALIR
                """;
    String mensajeSudamerica = """
                ---------------------------------------------------------------------------
                Sur America
                
                Porfavor elige la moneda base a convertir.
                1. ARS (Peso Argentino)
                2. BRL (Real Brasileño)
                3. BOB (Peso Boliviano)
                4. COP (Peso Colombiano)
                5. CLP (Peso Chileno)
                6. PEN (Sol Peruano)
                7. PYG (Guarani Paraguayo)
                8. UYU (Peso Uruguayo)
                0. Atras
                """;
    String mensajeCentroAmerica = """
                ---------------------------------------------------------------------------
                Centro America
                
                Porfavor elige la moneda base a convertir.
                1. CRC (Colón Costarricense)
                2. DOP (Peso Dominicano)
                3. GTQ (Quetzal Guatemalteco)
                4. HNL (Lempira Hondureño)
                5. HTG (Gourde Haitiano)
                6. MXN (Peso Mexicano)
                7. NIO (Córdoba nicaragüense)
                8. PAB (Balboa Panameño)
                0. Atras
                """;

    String mensajeNorteAmerica ="""
                ---------------------------------------------------------------------------
                Norte America
                
                Porfavor elige la moneda base a convertir.
                1. USD (Dolar Estadounidense)
                2. CAD (Dolar Canadiense)
                0. Atras
                """;

    String mensajeEuropa = """
                Europa
                
                Digita la cantidad de euros que desea convertir a USD
                """;

    Scanner scanner = new Scanner(System.in);


}