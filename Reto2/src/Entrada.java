public class Entrada {
    // Declaración de atributos.
    String NombreEvento;
    Double PrecioEntrada;

    // Creación de constructor.
    public Entrada(String NombreEvento, Double PrecioEntrada){
        this.NombreEvento = NombreEvento;
        this.PrecioEntrada = PrecioEntrada;
    }

    // Metodo público para mostrar información.
    public void MostrarInformacion(){
        System.out.println("Evento: " + NombreEvento + " | Precio: $" + PrecioEntrada);
    }
}
