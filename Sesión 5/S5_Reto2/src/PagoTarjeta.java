public class PagoTarjeta extends MetodoPago implements Autenticable{
    double fondos = 100;
    public PagoTarjeta(double monto, double fondos){
        super(monto);
        this.fondos = fondos;
    }

    // Valida si hay fondos suficientes
    @Override
    public boolean autenticar() {
        return fondos >= monto;
    }

    @Override
    public void procesarPago() {
        System.out.println("💳 Procesando pago con tarjeta por $" + monto);
    }
}
