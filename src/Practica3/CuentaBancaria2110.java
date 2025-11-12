package Practica3;

public class CuentaBancaria2110 {
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;
    private String titular;

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        if (numeroCuenta.endsWith("944")) {
            this.numeroCuenta = numeroCuenta;
        } else {
            System.out.println("Número de cuenta no válido.");
        }
    }

    public void setSaldo(double saldo) {
        if (saldo >= 944) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo inicial debe ser mayor o igual a 944");
        }
    }

    public void setTipoCuenta(String tipoCuenta) {
        if (tipoCuenta.equalsIgnoreCase("Ahorro") || 
            tipoCuenta.equalsIgnoreCase("Débito") || 
            tipoCuenta.equalsIgnoreCase("Crédito") || 
            tipoCuenta.equalsIgnoreCase("Corriente")) {
            this.tipoCuenta = tipoCuenta;
        } else {
            System.out.println("Tipo de cuenta no válido.");
        }
    }
    
    public void setTipoCuenta(int tipo) {
        switch(tipo) {
            case 1 :
                tipoCuenta = "Ahorro";
                break;
            case 2 :
                tipoCuenta = "Débito";
                break;
            case 3 :
                tipoCuenta = "Crédito";
                break;
            case 4 :
                tipoCuenta = "Corriente";
                break;
            default :
                System.out.println("Tipo de cuenta no válido.");
        }
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    @Override
    public String toString() {
        return "Cuenta Bancaria:\n" +
               "Titular: " + titular + "\n" +
               "Número: " + numeroCuenta + "\n" +
               "Saldo: $" + saldo + "\n" +
               "Tipo: " + tipoCuenta;
    }
    
}
