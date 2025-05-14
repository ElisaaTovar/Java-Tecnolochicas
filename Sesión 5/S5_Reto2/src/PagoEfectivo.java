public class PagoEfectivo extends MetodoPago implements Autenticable{
    public PagoEfectivo(double monto){
        super(monto);
    }
    // Siempre devuelve "verdadero"
    @Override
    public boolean autenticar() {
        return true;
    }

    @Override
    public void procesarPago() {
        System.out.println("💵 Procesando pago en efectivo por: $" + monto);
    }
}
