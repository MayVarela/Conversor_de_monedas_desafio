import java.util.Map;

public class CalculosResultado {
    static void convertirYMostrarResultado(double valor, String moneda, Map<String, Double> conversionRates) {
        if (conversionRates.containsKey(moneda)) {
            double tasaConversion = conversionRates.get(moneda);
            double valorConvertido = valor / tasaConversion;
            System.out.println( valor +" "+ moneda + " es igual a " + valorConvertido + " USD");
        } else {
            System.out.println("No se pudo encontrar la tasa de conversión para " + moneda);
        }
    }
}
