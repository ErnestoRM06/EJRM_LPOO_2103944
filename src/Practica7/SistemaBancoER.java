package Practica7;

import java.io.FileWriter;
import java.io.IOException;

public class SistemaBancoER {

    private double saldo = 3944;
    private String usuario = "Ernesto";

    public SistemaBancoER() {
    }
    
    public SistemaBancoER(double saldo, String usuario) {
        this.saldo = saldo;
        this.usuario = usuario;
    }

    public void validarMatricula(String matricula)
            throws Matricula21InvalidaException {

        if (!matricula.endsWith("944")) {
            throw new Matricula21InvalidaException(
                    "La matrícula debe terminar en 944."
            );
        }
    }

    public void buscarUsuario(String nombre)
            throws Usuario3944NoEncontradoException {

        if (!nombre.equalsIgnoreCase(usuario)) {
            throw new Usuario3944NoEncontradoException(
                    "No se encontró el usuario: " + nombre
            );
        }
    }

    public void retirar(double monto)
            throws Saldo10InsuficienteException {

        if (monto > saldo) {
            throw new Saldo10InsuficienteException(
                    "Intento de retiro: " + monto + " > saldo: " + saldo
            );
        }

        saldo -= monto;
    }

    // Logging con try-with-resources
    public void logError(String mensaje) {
        try (FileWriter fw = new FileWriter("log_banco.txt", true)) {
            fw.write(mensaje + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método que combina manejo de excepciones
    public void procesarOperacion(String matricula, String usuario, double monto) {
        try {
            validarMatricula(matricula);
            buscarUsuario(usuario);
            retirar(monto);
            System.out.println("Operación exitosa");
        } catch (Matricula21InvalidaException
                | Usuario3944NoEncontradoException
                | Saldo10InsuficienteException ex) {

            System.out.println("EXCEPCIÓN CAPTURADA: " + ex.getMessage());
            logError(ex.getMessage());
        }
    }
}
