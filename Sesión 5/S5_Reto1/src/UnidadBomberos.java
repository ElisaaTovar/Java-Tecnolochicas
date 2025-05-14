public class UnidadBomberos extends UnidadEmergencia{
    // Agregar los componentes por composición
    SistemaGPS sistemaGPS;
    Sirena sirena;
    Operador operador;

    // Sobrescribir el metodo responder() con un mensaje propio
    @Override
    public void responder() {
        System.out.println("🔥 Unidad de bomberos respondiendo a incendio estructural.\n");
    }

    // Metodo constructor
    public UnidadBomberos(){
        this.sistemaGPS = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador();
    }

    public void iniciarOperacion(){
        activarUnidad("UnidadBomberos");
        sistemaGPS.localizar();
        sirena.activarSirena();
        System.out.println("🧑‍🚒 "+ operador.reportarse("Marco"));
        responder();
    }
}
