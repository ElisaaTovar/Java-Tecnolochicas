public class Ambulancia extends UnidadEmergencia{
    // Agregar los componentes por composición
    SistemaGPS sistemaGPS;
    Sirena sirena;
    Operador operador;

    // Sobrescribir el metodo responder() con un mensaje propio
    @Override
    public void responder() {
        System.out.println("🩺 Ambulancia en camino al hospital más cercano.\n");
    }

    // Metodo constructor
    public Ambulancia(){
        this.sistemaGPS = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador();
    }

    public void iniciarOperacion(){
        activarUnidad("Ambulancia");
        sistemaGPS.localizar();
        sirena.activarSirena();
        System.out.println("👷 "+ operador.reportarse("Juan"));
        responder();
    }

}
