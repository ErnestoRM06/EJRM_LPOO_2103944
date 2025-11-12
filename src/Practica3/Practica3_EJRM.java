package Practica3;

public class Practica3_EJRM {
    
    public static void main(String[] args) {
        CuentaBancaria2110 cuenta = new CuentaBancaria2110();
        
        cuenta.setSaldo(900);
        cuenta.setNumeroCuenta("2103945");
        cuenta.setTipoCuenta(0);
        cuenta.setTipoCuenta("EJRM");
        
        cuenta.setNumeroCuenta("2103944");
        cuenta.setSaldo(1500);
        cuenta.setTipoCuenta(2);
        cuenta.setTitular("Ernesto");
        System.out.println("\n" + cuenta + "\n");
        
        ClienteReyna cliente = new ClienteReyna(cuenta.getTitular(), "Monterrey, N.L.", "811-210-3944", cuenta);
        System.out.println("\n" + cliente + "\n");
        
        try {
            cuenta.saldo = 1000;
        } catch (RuntimeException e) {
            System.out.println("ERROR: el parametro es privado, no se puede modificar directamente.");
        }
    }
}
