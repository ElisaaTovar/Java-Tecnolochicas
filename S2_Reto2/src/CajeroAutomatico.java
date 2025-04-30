public class CajeroAutomatico{

    // Consulta de saldo
    public void Consulta(double saldoinicial){
        System.out.println("Tu saldo es de: " + saldoinicial);
    }

    // Depositar dinero → Pedir monto a depositar y sumarlo al saldo.
    public double Deposito(double saldo, double SaldoADepositar){
        return saldo + SaldoADepositar;
    }

    // Retirar dinero → Pedir monto a retirar y:
    // Validar si hay saldo suficiente.
    // Si no hay suficiente, mostrar un mensaje y continuar sin restar.
    public double Retiro(double saldo, double retiro){
        double total;
        boolean suficiente = saldo >= retiro;
        total = suficiente ? saldo-retiro: saldo;
        if (suficiente){
            System.out.println("✅ Su saldo final es de: " + total);
        } else {
            System.out.println("⚠️ No cuenta con saldo suficiente.");
            System.out.println("Su saldo actual es de: " + total);
        }
        return total;
    }
}

