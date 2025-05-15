import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //📄 Uso de ArrayList<String> para registrar el orden de llegada de las especies
        ArrayList<String> ordenLlegada = new ArrayList<>();
        ordenLlegada.add("Homo sapiens");
        ordenLlegada.add("Mus musculus");
        ordenLlegada.add("Arabidopsis thaliana");
        ordenLlegada.add("Homo sapiens"); // Repetido

        // Uso de HashSet<String> para obtener una lista de especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(ordenLlegada);

        // Uso de HashMap<String, String> para asociar el ID de la muestra con el nombre del invetigador
        HashMap<String, String> investigadorID = new HashMap<>();
        investigadorID.put("M-001", "Dra. López");
        investigadorID.put("M-002", "Dr. Hernández");
        investigadorID.put("M-003", "Dra. Ramírez");

        // Muestra de la lista completa de especies
        System.out.println("\n📄 Especies registradas: ");
        for (String especie : ordenLlegada){
            System.out.println("- " + especie);
        }

        // Muestra las especies únicas procesadas
        System.out.println("\n🐲 Especies Únicas encontradas: ");
        for (String especieUnica : especiesUnicas){
            System.out.println("- " + especieUnica);
        }

        // Muestra la relación ID de muestra --> Investigador
        System.out.println("\n👨‍⚕️ Muestra | Investigador asociado");
        for (Map.Entry<String, String> entry: investigadorID.entrySet()){
            System.out.println("-    " + entry.getKey() + " | " + entry.getValue());
        }

        // Búsqueda por ID de muestra
        String idBucar = "M-002";
        System.out.println("\n🔎 Investigador asoaciado a la muestra " + idBucar + ": " + investigadorID.get(idBucar));
    }
}