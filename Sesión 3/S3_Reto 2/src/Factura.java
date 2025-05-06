import javax.swing.text.html.Option;
import java.util.Optional;

public class Factura {
    // Atributos privados
    private double monto; // Cantidad total de la factura.
    private String descripcion; // Breve concepto de lo facturado.
    private Optional<String> rfc; // RFC del cliente (puede estar presente o no)

    // Métodos públicos
    // Si el RFC es null, debe almacenarse usando Optional.empty()
    public Factura(double monto, String descripcion, String rfc){
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    // Devuelve una cadena con los datos de la fatura
    public String getResumen(){
        // Si el RFC está presente, se muestra.
        // Si no, se muestra "RFC: [No proporcionado]"
        String estadorfc = rfc.orElse("[ No proporcionado ]");

        return "\n📄Factura generada" +
                "\n Descripción: " + descripcion +
                "\n Monto: $" + monto +
                "\n RFC: " + estadorfc;
    }
}
