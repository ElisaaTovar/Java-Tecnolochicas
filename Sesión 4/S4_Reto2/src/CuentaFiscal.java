import java.util.Objects;

public class CuentaFiscal {
    // Atributos privados
    private String rfc; // No modificable una vez asignado
    private double saldoDisponible;

    // Constructor con validación para que el saldo no sea negativo
    public CuentaFiscal(String rfc, double saldoDisponible){
        this.rfc = rfc;
        if (saldoDisponible >= 0) {
            this.saldoDisponible = saldoDisponible;
        } else {
            System.out.println("⚠️ Saldo insuficiente ");
            this.saldoDisponible = 0;
        }
    }

    // Getters
    public String getRfc() {
        return rfc;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    // Un metodo validarRFC
    public boolean validarRFC(DeclaracionImpuestos d){
        return Objects.equals(this.rfc, d.rfccontribuyente());
    }
}

