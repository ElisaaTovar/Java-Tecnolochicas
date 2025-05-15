public class Tema implements Comparable<Tema>{
    String titulo;
    int prioridad;

    public Tema(String titulo, int prioridad){
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    // Implementación de Comparable<Tema> para ordenar por título
    @Override
    public int compareTo(Tema tema) {
        return this.titulo.compareTo(tema.titulo);
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ". Prioridad: " + prioridad;
    }
}
