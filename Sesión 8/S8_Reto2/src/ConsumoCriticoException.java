public class ConsumoCriticoException extends Exception{
    public ConsumoCriticoException() {
        super("⚠️¡Ha ocurrido un error inesperado!");
    }

    public ConsumoCriticoException(String msj){
        super(msj);
    }
}
