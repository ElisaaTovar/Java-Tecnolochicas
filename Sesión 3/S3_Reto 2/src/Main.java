public class Main {
    public static void main(String[] args) {
        // Crear al menos 2 facturas
        // Una con RFC
        Factura factura1 = new Factura(2500.0, "Servicio de consultoría", "ABCC010101XYZ");
        // Una sin RFC (null)
        Factura factura2 = new Factura(1800.0, "Reparación de equipo", null);

        System.out.println(factura1.getResumen());
        System.out.println(factura2.getResumen());
    }
}