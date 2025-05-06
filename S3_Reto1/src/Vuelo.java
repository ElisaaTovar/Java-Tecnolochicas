import java.util.Optional;
public class Vuelo{
    // Atributos
    final String codigoVuelo; // Código único del vuelo ✈️
    String destino, horaSalida; // Ciudad destino del vuelo 🗺️ & hora de salida en formato 24h ⏰
    Optional<Pasajero> asientoReservado; // Referencia al pasajero que reservó el asiento (puede ser null)
    // No debe usarse en atributos, solo es usado aquí como práctica.

    // Métodos
    // Constructor del vuelo
    public Vuelo(String codigoVuelo, String destino, String horaSalida){
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = Optional.empty();
    }

    //Asigna al pasajero si no hay reserva previa
    boolean reservarAsiento(Pasajero p){
        //asientoReservado.ifPresent(asientoReservado -> Optional.ofNullable(p));
        if (asientoReservado.isEmpty()) {
            asientoReservado = Optional.ofNullable(p);
            return (true);
        } else {
            return false;
        }
    }

    // Metodo sobrecargado
    boolean reservarAsiento(String nombre, String pasaporte){
        Pasajero nuevopasajero = new Pasajero(nombre, pasaporte);
        return reservarAsiento(nuevopasajero);
    }

    // Elimina al pasajero asignado
    void cancelarReserva(){
        asientoReservado = Optional.empty();
    }

    // Muestra la información del vuelo y el pasajero
    String obtenerItinerario() {
        String Pasajero;
        if (asientoReservado.isPresent()) Pasajero = asientoReservado.get().getNombre();
        else {
            Pasajero = "[Sin reserva]";
        }

        return "\n🛩️ Itinerario de vuelo:" +
                "\nCódigo: " + codigoVuelo +
                "\nDestino: " + destino +
                "\nSalida: " + horaSalida +
                "\nPasajero: " + Pasajero;
    }
}
