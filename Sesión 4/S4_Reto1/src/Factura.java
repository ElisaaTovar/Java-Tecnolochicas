import java.util.Objects;

public class Factura {
    String folio;
    String cliente;
    double total;

    // Constructor con parámetros para incializar todos los atributos
    public Factura(String folio, String cliente, double total){
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    // Metodo toString para mostrar la inforamción de la factura
    public String toString(){
        return "📄 Factura [folio = " + folio
                + ", cliente = " + cliente
                + ", total = $" + total;
    }

    // Metodo equals para que dos factuas se consideren iguales si tienen el mismo folio
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true; //Mismo objeto en memoria
        if (obj == null || getClass() != obj.getClass()) return false;

        Factura factura = (Factura) obj;
        return Objects.equals(folio, factura.folio); // Comparación de contenido
    }

    // Metodo hashcode basado en el atributo folio
    @Override
    public int hashCode() {
        return cliente.hashCode(); // Genera un hash basado en el cliente
    }
}
