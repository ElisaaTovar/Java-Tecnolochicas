package Hospital;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();

        Scanner input = new Scanner(System.in);
        System.out.print("⭐ Ingresa el nombre del/la paciente: ");
        paciente1.Nombre = input.nextLine();

        System.out.print("⭐ Ingresa la edad del/la paciente: ");
        paciente1.Edad = input.nextInt(); // nextInt no limpia el buffer y deja ocupado input.
        input.nextLine(); //Esta indicación limpia el buffer

        System.out.print("⭐ Ingresa el número de expediente del/la paciente: ");
        paciente1.NumExp = input.nextLine();

        input.close(); //Siempre que se utilicen operaciones de entrada y salida deben cerrarse
        // cuando ya no se requieran más datos.
        paciente1.mostrarInformacion();
    }
}