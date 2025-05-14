public abstract class MetodoPago implements Autenticable {
    double monto;

    public MetodoPago(double monto){
        this. monto = monto;
    }

    public abstract void procesarPago();

    public void mostrarResumen(){
        System.out.println("📄 Tipo: " + this.getClass().getName() +" - Monto: $" + monto);
    }
}
