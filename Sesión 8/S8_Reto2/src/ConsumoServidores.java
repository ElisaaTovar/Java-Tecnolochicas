import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class ConsumoServidores{
    public Set<Double> Consumo (int cantidad){
        Scanner input = new Scanner(System.in);
        double consumo;
        Set <Double> servidores = new HashSet<>(); // No se deben permitir registros duplicados (usa HashSet).

        try {
            do {
                // 2. Solicita al usuario ingresar el consumo de CPU de varios servidores (valores en porcentaje).
                System.out.println("Ingrese el consumo de sus servidores en porcentaje: ");
                consumo = input.nextDouble();
                input.nextLine();

                if (consumo >= 0 && consumo <= 95){
                    servidores.add(consumo);
                    cantidad -= 1;
                    System.out.println("✅ Valor agregado correctamente: " + consumo + "%");
                } else if (consumo > 95) {
                    servidores.add(consumo);
                    // Si el valor ingresado es mayor a 95%, lanza una excepción personalizada llamada ConsumoCriticoException.
                    throw new ConsumoCriticoException("⚠️ Estás alcanzando o has alcanzado el límite de consumo");
                } else if (consumo < 0) { // No se permiten valores negativos ni mayores a 100%.
                    System.out.println("⚠️ El consumo debe ser mayor que 0% y menor que 100%.");
                }
            } while(cantidad>0);

            System.out.println("✅¡Valores registrados!");

        } catch (InputMismatchException error){
            System.out.println("❌ ¡El valor ingresado debe ser numérico!"); // El valor debe ser numérico.
        } catch (ConsumoCriticoException e) {
            System.out.println("❌ ¡Alerta! " + e.getMessage());
        } finally {
            input.close();
            System.out.println("🆓 Recurso liberado correctamente.");
        }

        return servidores;
    }
}
