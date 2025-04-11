public class Main {
    public static void main(String[] args) {
        // Creación de dos objetos de tipo Entrada.
        Entrada entrada1 = new Entrada(" Obra de Teatro", 450.0);
        Entrada entrada2 = new Entrada(" Obra de Teatro", 500.0);

        // Mostrar datos en la consola.
        entrada1.MostrarInformacion();
        entrada2.MostrarInformacion();

        // Reto extra
        Entrada_Record entrada3 = new Entrada_Record("Concierto sinfónico", 750.0);
        System.out.println(entrada3);
    }
}
