package Practica4;

public class VehiculoBaseEJRM {
    protected String marca;
    protected String modelo;
    protected int año;
    protected double precio;
    
    public VehiculoBaseEJRM(String marca, String modelo, int año, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }
        
    public String arrancar() {
        return "El vehículo está arrancando.";
    }

    public String frenar() {
        return "El vehículo se ha detenido.";
    }

    public String acelerar(int incremento) {
        return "El vehículo acelera " + incremento + " km/h.";
    }

    public String describir() {
        return String.format("%s %s (%d) - $%.2f", marca, modelo, año, precio);
    }


    @Override
    public String toString() {
        return describir();
    }
        
}
