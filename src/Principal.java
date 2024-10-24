public class Principal {
    private static boolean exitFlag = false;
    public static void main(String[] args) {
        Continentes iniciarPrograma = new Continentes();
        iniciarPrograma.consultaContinente();

        // Verifica si la opción fue 'salir' y termina el programa
        if (userWantsToExit()) {
            System.out.println("Cerrando el programa...");
            System.exit(0); // Termina la ejecución del programa
        }
    }
    // Método para verificar si el usuario quiere salir
    public static boolean userWantsToExit() {
        return exitFlag;
    }
    // Método que cambia el valor del flag de salida
    public static void setExitFlag(boolean value) {
        exitFlag = value;
    }
}