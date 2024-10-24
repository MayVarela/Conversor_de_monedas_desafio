import java.util.Scanner;

public class Mensajes {
    static Consulta consulta = new Consulta();
    ApiConversor apiConversor = new ApiConversor();
    String opcionNoDisponible = "-----------------------------------------------------------------";

    // Menus principal y secundarios (continentes y paises)
    String mensajeContinente = """
                -----------------------------------------------------------------
                Hola!
                Bienvenido a el conversor de monedas del continente Americano.
                
                Para convertir una moneda a USD por favor elija en que parte
                de America esta ubicado el pais de la moneda que desea convertir.
                Si quieres convertir dolares a otra moneda entra en
                (America del Norte/USD) y luego elige la moneda a la que vas a
                convertir escribiendo su indicativo.
                -----------------------------------------------------------------
                1. America del Sur
                2. Centro America
                3. America del Norte
                4. EUR (Union Europea)
                9. Cerrar programa
                -----------------------------------------------------------------
                """;
    String mensajeSudamerica = """
                -----------------------------------------------------------------
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
                9. VES (Bolivar Venezolano)
                Escribe "salir" para volver al menu principal.
                -----------------------------------------------------------------
                """;
    String mensajeCentroAmerica = """
                -----------------------------------------------------------------
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
                Escribe "salir" para volver al menu principal.
                -----------------------------------------------------------------
                """;

    String mensajeNorteAmerica ="""
                -----------------------------------------------------------------
                Norte America
                
                Porfavor elige la moneda base a convertir.
                1. USD (Dolar Estadounidense)
                2. CAD (Dolar Canadiense)
                Escribe "salir" para volver al menu principal.
                -----------------------------------------------------------------
                """;

    String mensajeEuropa = """
                -----------------------------------------------------------------
                Europa
                
                Digita la cantidad de euros que desea convertir a USD
                o escribe "salir" para volver al menu principal.
                -----------------------------------------------------------------
                """;

    Scanner scanner = new Scanner(System.in);


}