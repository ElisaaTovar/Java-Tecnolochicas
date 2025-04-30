import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Definir saldo inicial.
        var saldo = 1000.0;
        int opcion;
        Scanner input = new Scanner(System.in);
        CajeroAutomatico cajero1= new CajeroAutomatico();

        // Mostrar un menú interactivo.
        do {
            System.out.println("------------------------------------------------------------\n");
            System.out.println("¡Bienvenido al cajero automático!");
            System.out.println("Por favor, elige la acción que deseas realizar: ");
            System.out.println("1. 👛Consultar saldo.");
            System.out.println("2. 🪙Depositar dinero.");
            System.out.println("3. 💸Retirar dinero.");
            System.out.println("4. 🫂Salir.");
            opcion = input.nextInt();

            // Utilizar un switch para manejar las opciones.
            switch (opcion) {
                // Consultar saldo → Mostrar el saldo actual.
                case 1-> cajero1.Consulta(saldo);
                case 2 ->{
                    System.out.println("Ingrese el monto a depositar: ");
                    double SaldoADepositar = input.nextInt();
                    input.nextLine();
                    saldo = cajero1.Deposito(saldo, SaldoADepositar);
                    System.out.println("Su saldo final es de: " + saldo);
                }
                case 3 ->{
                    System.out.println("Ingrese el monto a retirar: ");
                    double retiro = input.nextDouble();
                    input.nextLine();
                    saldo = cajero1.Retiro(saldo, retiro);
                }
                // Salir → Mostrar mensaje de despedida y terminar el programa.
                case 4 -> System.out.println("¡Gracias por usar nuestros servicios!");
            }

            // Si el usuario ingresa una opción inválida, muestra un mensaje de error
            // y vuelve a mostrar el menú sin detener el programa.
            boolean validacion = opcion <=4;
            if (!validacion){
                System.out.println("¡Ingrese una opción válida!");
            }
        } while(opcion!=4); // El menú se muestra hasta que la opción es 4.
        input.close();
    }
}