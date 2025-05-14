public class PagoTransferencia extends MetodoPago implements Autenticable{
    boolean fondosExtValid;

    public PagoTransferencia(double monto, boolean fondosExtValid){
         super(monto);
         this.fondosExtValid = fondosExtValid;
     }

    // Simula una validación bancaria externa
    @Override
    public boolean autenticar() {
        return fondosExtValid;
    }

    @Override
    public void procesarPago() {
        System.out.println("💸 Procesando pago por transferencia por $" + monto);
    }
}
