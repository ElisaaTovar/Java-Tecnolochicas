public class Main {
    public static void main(String[] args) {
        // Crea una declaración de impuestos
        DeclaracionImpuestos declaracion1 = new DeclaracionImpuestos("XAXX010101000", 8700.0);

        // Crea una cuenta fiscal
        CuentaFiscal cuenta1 = new CuentaFiscal("XAXX010101000", 9500.0);

        // Muestra la información de ambas
        System.out.println("📄 Declaración enviada por RFC:" + declaracion1.rfccontribuyente()+ " por $" + declaracion1.montoDeclarado());
        System.out.println("🏦 Cuenta fiscal registrada con RFC:" + cuenta1.getRfc() + " por $" + cuenta1.getSaldoDisponible());
        System.out.println("✅¿RFC válido para esta cuenta? " + cuenta1.validarRFC(declaracion1));
    }

}