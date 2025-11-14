package Practica7;

public class Usuario3944NoEncontradoException extends ExceptionReynaBase {
    public Usuario3944NoEncontradoException(String mensaje) {
        super("Error, usuario no encontrado: " + mensaje);
    }
}
