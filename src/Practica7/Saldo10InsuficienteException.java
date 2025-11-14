package Practica7;

public class Saldo10InsuficienteException extends ExceptionReynaBase {
    public Saldo10InsuficienteException(String mensaje) {
        super("Error de saldo (insuficiente): " + mensaje);
    }
}
