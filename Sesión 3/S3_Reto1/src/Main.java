public class Main {
    public static void main(String[] args) {
        // Crear al menos un pasajero y un vuelo
        Vuelo vuelo1 = new Vuelo("UX123", "París", "14:30");
        Pasajero pasajero1 = new Pasajero("Ana Martínez", "12345");
        // "Ana Martínez", "12345"

        // Reservar el asiento en el vuelo
        boolean disponible = vuelo1.reservarAsiento(pasajero1);
        if (disponible){
            System.out.println("✅ ¡Reserva realizada con éxito!");
        } else {
            System.out.println("⚠️ Asiento ocupado");
        }

        // Mostrar el itinerario
        System.out.println(vuelo1.obtenerItinerario());
        // + "\nPasajero: " + pasajero1.getNombre()

        // Cancelar la reserva
        vuelo1.cancelarReserva();
        System.out.println("\n❌ Cancelando reserva...");
        System.out.println(vuelo1.obtenerItinerario());

        // Mostrar nuevamente el itinerario
        vuelo1.obtenerItinerario();

        // Reservar un asiento en el vuelo usando un nombre y pasaporte
        boolean nuevo = vuelo1.reservarAsiento("Mario Gonzalez", "54321");
        if (nuevo){
            System.out.println("\n✅ ¡Reserva realizada con éxito!");
        } else {
            System.out.println("\n⚠️ Asiento ocupado");
        }
        System.out.println(vuelo1.obtenerItinerario());
    }
}