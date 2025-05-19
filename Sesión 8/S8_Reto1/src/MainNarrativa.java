public class MainNarrativa {
    public static void main(String [] args) {
        LogicaDecision decision = new DecisionBinaria();
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();

        Narrador narrador = new Narrador(transicion, dialogo, decision);

        // Ejecuta una simulación simple donde el usuario toma una decisión y el sistema responde
        // con una transición de historia y un diálogo.
        narrador.Escena("\nEra una tarde extrañamente tranquila, en tu vecindario (donde no suele haber calma), " +
                "\nno se escuchaba ningún ruido, ni seña de personas. De repente, como si el mundo se \npusiera de" +
                " acuerdo para recordarte que no estás solo, tu teléfono comienza a sonar \nal mismo tiempo que " +
                "alguien toca la puerta... ");


    }
}