public class Main {
    public static void main(String[] args) {
        // Crea dos facturas con el mismo folio pero diferentes clientes o totales
        Factura factura1 = new Factura("FAC001", "Juan Pérez", 1450.0);
        Factura factura2 = new Factura("FAC001", "Comercial XYZ", 1450.0);

        // Muestra ambas con toString()
        System.out.println("\n" + factura1.toString());
        System.out.println(factura2.toString());

        // Compara si son iguales con equals()
        System.out.println("¿Las facturas son iguales? " + factura1.equals(factura2));
    }
}