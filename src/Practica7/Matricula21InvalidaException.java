package Practica7;

public class Matricula21InvalidaException extends ExceptionReynaBase {
    public Matricula21InvalidaException(String mensaje) {
        super("Error de matrícula (No válida): " + mensaje);
    }
}
