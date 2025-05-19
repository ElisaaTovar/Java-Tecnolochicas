public class TransicionSimple implements TransicionHistoria{
    @Override
    public void avanzarEvento(String accion) {
        if (accion.equals("A")){
            System.out.println("Tomas tu celular y ves el nombre de quien te llama... ");
        } else System.out.println("Caminas hacia la puerta...");
    }

}
