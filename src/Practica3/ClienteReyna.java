package Practica3;

import java.util.logging.Logger;

public class ClienteReyna {
    protected String nombre;
    protected String direccion;
    protected String telefono;
    private CuentaBancaria2110 cuenta;

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public CuentaBancaria2110 getCuenta() {
        return cuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCuenta(CuentaBancaria2110 cuenta) {
        this.cuenta = cuenta;
    }
    
    
    public ClienteReyna(String nombre, String direccion, String telefono, CuentaBancaria2110 cuenta) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cuenta = cuenta;
    }
    
    @Override
    public String toString() {
        return "Cliente: " + nombre + "\n" +
               "Dirección: " + direccion + "\n" +
               "Teléfono: " + telefono + "\n\n" +
               cuenta;
    }
}
