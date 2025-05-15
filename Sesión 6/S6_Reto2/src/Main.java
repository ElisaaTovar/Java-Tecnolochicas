import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        //Gestionar los temas activos usando una lista concurrente
        List<Tema> temasActivos= new CopyOnWriteArrayList<Tema>();
        temasActivos.add(new Tema("Lectura comprensiva", 2));
        temasActivos.add(new Tema("Matemáticas básicas", 1));
        temasActivos.add(new Tema("Cuidado del medio ambiente", 3));

        // Muestra los temas ordenados alfabéticamente (orden natural)
        Collections.sort(temasActivos);
        System.out.println("\n📄 Temas ordenados alfabéticamente: ");
        for (Tema tema: temasActivos){
            System.out.println("- " + tema);
        }

        // Muestra la lista por prioridad ascendente (1-->3)
        temasActivos.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema t1, Tema t2) {
                return Integer.compare(t1.prioridad, t2.prioridad);
            }
        });

        System.out.println("\n🔝 Lista ordenada por prioridad ascendente (1-->3)");
        for (Tema temAct : temasActivos){
            System.out.println("- " + temAct);
        }

        // Usa ConcurrentHashMap<String, String> como repositorio
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");

        System.out.println("\n🔗 Recursos adicionales: ");
        for (String recursoAd : recursos.keySet()){
            System.out.println("Título del tema: " + recursoAd + " → " + recursos.get(recursoAd));
        }
    }
}