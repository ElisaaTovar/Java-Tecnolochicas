// Caja registradora
public class CajaRegistradora {
    public static void main(String[] args) {
        // Creación de arreglo tipo MetodoPago[] con instancias mezcladas (polimorfismo)
        MetodoPago[] pagos = {
            new PagoEfectivo(150.0),
            new PagoTarjeta(320.0, 1000.0),
            new PagoTransferencia(2000.0, false)
        };

        // Recorrer el arreglo, llamar a autenticar() y, si es válido, llamar a
        // procesarPago() y mostrarResumen()
        for (MetodoPago pago: pagos){
            if(pago.autenticar()){
                System.out.println("\n✅ Autenticación exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
            }
            else {
                System.out.println("\n❌ Fallo de autenticación. Transferencia no válida.");
            }
        }
    }
}