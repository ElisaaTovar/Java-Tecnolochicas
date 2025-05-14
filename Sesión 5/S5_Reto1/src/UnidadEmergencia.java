public abstract class UnidadEmergencia {
    String nombre = "Emergencia";

    // Metodo abstracto responder()
    public abstract void responder();

    // Metodo que
    public void activarUnidad(String nombre){
        System.out.println("🚨 Activando unidad: " + nombre);
    }
}
