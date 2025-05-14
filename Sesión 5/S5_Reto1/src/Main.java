public class Main {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia();
        Patrulla patrulla = new Patrulla();
        UnidadBomberos unidadBomberos = new UnidadBomberos();

        ambulancia.iniciarOperacion();
        patrulla.iniciarOperacion();
        unidadBomberos.iniciarOperacion();
    }
}