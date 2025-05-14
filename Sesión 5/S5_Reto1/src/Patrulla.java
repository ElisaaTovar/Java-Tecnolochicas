public class Patrulla extends UnidadEmergencia{
    // Agregar los componentes por composición
    SistemaGPS sistemaGPS;
    Sirena sirena;
    Operador operador;

    // Sobrescribir el metodo responder() con un mensaje propio
    @Override
    public void responder() {
        System.out.println("🚓 Patrulla atendiendo situación de seguridad ciudadana.\n");
    }

    // Metodo constructor
    public Patrulla(){
        this.sistemaGPS = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador();
    }

    public void iniciarOperacion(){
        activarUnidad("Patrulla");
        sistemaGPS.localizar();
        sirena.activarSirena();
        System.out.println("👮‍♀️ "+ operador.reportarse("Laura"));
        responder();
    }
}
