public class Narrador {
    // Usa inyección de dependencias para que la clase principal dependa solo de las interfaces (DIP).
    // Aplica también el principio OCP: las clases deben estar abiertas a extenderse
    // (nuevas transiciones, nuevos diálogos) pero cerradas a modificaciones.
    private final TransicionHistoria transicion;
    private final GestorDialogo dialogo;
    private final LogicaDecision decision;

    public Narrador(TransicionHistoria transicion, GestorDialogo dialogo, LogicaDecision decision){
        this.transicion = transicion;
        this.dialogo = dialogo;
        this.decision = decision;
    }

    public void Escena(String escena){

        System.out.println(escena);
        String decision1 = decision.tomarDecision();
        transicion.avanzarEvento(decision1);

        String pregunta = "- ¿Hola? ¿Quién es?";
        dialogo.nuevoDialogo(pregunta);
        System.out.println("Preguntas, pues no esperabas a nadie.");
    }
}
