package Practica7;

public class Practica7_EJRM {
    
    public static void main(String[] args) {
        SistemaBancoER us = new SistemaBancoER();
        
        us.procesarOperacion("213943", "Ernesto", 944);
        us.procesarOperacion("213944", "EJRM", 944);
        us.procesarOperacion("213944", "Ernesto", 103944);
        
        us.procesarOperacion("213944", "Ernesto", 944);
    }
}
