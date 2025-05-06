public class Pasajero {
    // Atributos
    String nombre, pasaporte;

    // Metodos
    // Contructor
    public Pasajero(String nombre, String pasaporte){
        this.nombre=nombre;
        this.pasaporte=pasaporte;
    }

    String getNombre(){
        return nombre;
    }

    String getPasaporte(){
        return pasaporte;
    }
}
