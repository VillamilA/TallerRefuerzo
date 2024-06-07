public class CuentaBancaria {
int numeroCuenta;
double saldo;

public CuentaBancaria (int numeroCuenta){
    this.numeroCuenta = numeroCuenta;
    this.saldo = 0.0;
}

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto){
    if (monto>0){
        saldo += monto;
        System.out.println("Se deposito la cantidad de "+monto);
    } else{
        System.out.println("Debe depositar un valor mayor que 0 ");
    }
    }

    public void retirar(double monto){
    if (monto >0){
        if (monto<= saldo){
            saldo -= monto;
            System.out.println("Se retiro $ "+monto+" dolares!");
        }else{
            System.out.println("Fondos insuficientes, o no es mayor que 0");
            }
        }
    }
}
