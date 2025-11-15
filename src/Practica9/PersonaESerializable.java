package Practica9;

import java.io.Serializable;

public class PersonaESerializable implements Serializable {

    private String nombre;
    private int edad;
    private String matricula;

    public PersonaESerializable(String nombre, int edad, String matricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return nombre + " (" + matricula + ")";
    }
}
