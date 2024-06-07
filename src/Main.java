public class Main {
    public static void main(String[] args) {
        // Crear una cuenta bancaria
        CuentaBancaria cuenta1 = new CuentaBancaria(220665446);
        cuenta1.depositar(1000);
        cuenta1.retirar(500);
        System.out.println("Saldo de la cuenta bancaria 1: $" + cuenta1.getSaldo());

        // Crear una cuenta corriente
        CuentaCorriente cuentacorr = new CuentaCorriente(987654321, 500);
        cuentacorr.depositar(2000);
        cuentacorr.retirar(2500);
        System.out.println("Saldo de la cuenta corriente: $" + cuentacorr.getSaldo());

        // Crear una cuenta de ahorro
        CuentadeAhorro cuentaahorro = new CuentadeAhorro(456789123, 3.4);
        cuentaahorro.depositar(3000);
        cuentaahorro.calcularInteres();
        System.out.println("Saldo de la cuenta de ahorro: $" + cuentaahorro.getSaldo());
    }
}
