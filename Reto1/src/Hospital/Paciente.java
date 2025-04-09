package Hospital;

public class Paciente {
    String Nombre, NumExp;
    int Edad;
    public void mostrarInformacion(){
        System.out.println("\nInformación del/la paciente:");
        System.out.println("\nPaciente: " + Nombre);
        System.out.println("\nEdad: " + Edad);
        System.out.println("\nExpediente: " + NumExp);
    }

}
