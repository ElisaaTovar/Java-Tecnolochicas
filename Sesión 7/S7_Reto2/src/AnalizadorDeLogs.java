// 1. Crea una clase principal llamada AnalizadorDeLogs.
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorDeLogs {
    public static void main(String[] args) {
        // Creación del archivo errores.log
        Path rutaErrores = Paths.get("src/errores.log");
        Path registroFallos = Paths.get("/src/registros_fallos.txt");

        // Contenido de errores.log
        String contenido = """
                ERROR\
                
                ERROR\
                
                WARNING""";

        try {
            // Verifica si el archivo existe, si no lo crea y le escribe contenido
            if (!Files.exists(rutaErrores)) {
                Files.createDirectories(rutaErrores.getParent()); // Crea la carpeta src si no existe
                Files.write(rutaErrores, contenido.getBytes());
            }} catch (IOException ex) {
                System.out.println("¡No se pudo escribir el archivo de fallos!\n" + ex);
            }

        // 2. Usa try-with-resources para abrir el archivo errores.log con BufferedReader.
        try(BufferedReader lector = Files.newBufferedReader(rutaErrores)){

        // 3. Lee el archivo línea por línea y cuenta cuántas veces aparece: La palabra "ERROR", la palabra "WARNING"
            String linea;
            int contador = 0;
            int contadorErrores = 0;
            int contadorAdvert = 0;

            while ((linea = lector.readLine())!=null){
                System.out.println("➡️ Línea: " + linea);
                if(linea.contains("ERROR")){
                    contadorErrores++;
                }
                if(linea.contains("WARNING")){
                    contadorAdvert++;
                }
                contador++;
            }

            double porcentajeErrores = (double) (contadorErrores * 100) / contador;
            double porcentajeAdvertencias = (double)(contadorAdvert*100) /contador;

            // 4. Al finalizar, imprime un resumen en consola
            System.out.println("\n👍¡Finalizado!");
            System.out.println("\n📄Total de líneas leídas: " + contador);
            System.out.println("\n❌Cantidad de errores encontrados: " + contadorErrores);
            System.out.println("\n⚠️Cantidad de advertencias encontrados: " + contadorAdvert);
            System.out.println("Porcentaje de errores: "+ porcentajeErrores);
            System.out.println("Porcentaje de advertencias: "+ porcentajeAdvertencias);

        }catch (IOException e){
            System.err.println("❌ Error con el archivo. " + e.getMessage());

            // 5. Guarda el mensaje de error en un archivo
            try(BufferedWriter error = Files.newBufferedWriter(registroFallos)){
                error.write(e.getMessage());
            } catch (IOException exception){
                System.out.println("¡No se pudo procesar el archivo!\n" + exception);
            }
        }
    }
}