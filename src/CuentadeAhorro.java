class CuentadeAhorro extends CuentaBancaria{
    double tasaInteres;
    double interes;
    public CuentadeAhorro(int numeroCuenta, double tasaInteres){
        super(numeroCuenta);
        this.tasaInteres = tasaInteres;
        this.interes = interes;
    }
    public void calcularInteres(){
        interes = saldo * tasaInteres;
        saldo += interes;
        System.out.print("Interes total es de: $ "+interes);
    }
}