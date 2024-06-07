class CuentaCorriente extends CuentaBancaria{
    double limiteDescubierto;
    public CuentaCorriente(int numeroCuenta, double limiteDescubierto){
        super(numeroCuenta);
        this.limiteDescubierto = limiteDescubierto;
    }
    @Override
    public void retirar (double monto){
        if (monto >0){
            if (monto <= saldo + limiteDescubierto){
                System.out.println("Has retirado la cantidad de $ "+monto);
            }else{
                System.out.print("Fondos Insuficientes, o superaste el limite");
            }
        }
    }
}

