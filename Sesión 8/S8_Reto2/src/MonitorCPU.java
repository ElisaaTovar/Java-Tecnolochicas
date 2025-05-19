import java.util.Scanner;

// 1. Crea una clase principal llamada MonitorCPU donde se ejecuta el flujo general.
public class MonitorCPU {
    public static void main(String[] args) {
        ConsumoServidores servidores = new ConsumoServidores();

        System.out.println("¿Cuántos servidores desea analizar?");
        Scanner input = new Scanner(System.in);
        int cantidadServiores = input.nextInt();
        input.nextLine();

        System.out.println(servidores.Consumo(cantidadServiores));

        input.close();
    }
}