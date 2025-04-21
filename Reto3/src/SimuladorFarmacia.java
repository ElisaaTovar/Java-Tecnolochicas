public class SimuladorFarmacia {
    String Nombre;
    double PrecioU, Total, TotalAPagar, Des;
    int Cantidad;
    boolean Descuento;

    public void Medicamento(){
        Total = PrecioU * Cantidad;
        Descuento = (Total > 500) ? true: false;
        //variable= (condition) ?expressionTrue:expressionFalse;
        Des = Descuento ? Total*0.15: 0;
        TotalAPagar = Total-Des;

        System.out.println("\nMedicamento: " + Nombre);
        System.out.println("Cantidad: " + Cantidad);
        System.out.println("Precio unitario: $" + PrecioU);
        System.out.println("Total sin descuento: $" + Total);
        System.out.println("¿Aplica descuento?: " + Descuento);
        System.out.println("Descuento: $" + Des);
        System.out.println("Total a pagar: $" + TotalAPagar);
    }
}
