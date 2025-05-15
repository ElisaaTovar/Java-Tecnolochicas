import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class RegistroSimulacion {
    public static void main(String[] args) {
        // Usa Path y Paths.get() para definir la ruta del archivo parametros.txt, dentro de una carpeta config/
        Path rutaCarpeta = Paths.get("src/config");
        Path rutaArchivo = Paths.get("src/config/parametros.txt");

        // Crea un String con parámetros como: Tiempo de ciclo: 55.8 segundos, Velocidad de línea: 1.2 m/s,
        //Número de estaciones: 8
        String parametros = """
                Tiempo de ciclo: 55.8 segundos\
    
                Velocidad de línea: 1.2 m/s\
                
                Número de estaciones: 8""";

        try{
            //Si la carpeta config/ no existe, créala previamente.
            if (!Files.exists(rutaCarpeta)){
                Files.createDirectory(rutaCarpeta);
            }

            // Utiliza Files.write() para guardar el contenido en el archivo.
            Files.write(rutaArchivo, parametros.getBytes());
            System.out.println("\n✅Archivo escrito exitosamente.");

            //Usa Files.exists() para validar que el archivo fue creado correctamente.
            if (Files.exists(rutaArchivo)) {
                System.out.println("\n✅ El archivo existe.");

                //Lee el archivo con Files.readString() y muestra su contenido en consola.
                String archivo = Files.readString(rutaArchivo);
                System.out.println("\nContenido del archivo: \n" + archivo);
            } else System.out.println("❌ El archivo no existe");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Hello, World!");
    }
}