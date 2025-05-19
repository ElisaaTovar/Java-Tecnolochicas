import java.util.Objects;
import java.util.Scanner;
public class DecisionBinaria implements LogicaDecision{
    @Override
    public String tomarDecision() {
        // Se usa scanner para pedir al usuario que tome una decisión.
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            // Se solicita una decisión.
            System.out.println("\n¿Qué deseas hacer?");

            // Se presentan dos opciones.
            System.out.println("A. Tomar la llamada.");
            System.out.println("B. Abrir la puerta.");

            opcion = scanner.nextLine().toUpperCase();
        } while (!Objects.equals(opcion, "A") && !Objects.equals(opcion, "B")); // Repite la pregunta hasta que se elija la opción A o B.

        // Regresa la opción elegida.
        return opcion;
    }
}
