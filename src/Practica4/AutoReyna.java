package Practica4;

public class AutoReyna extends VehiculoBaseEJRM {

    private int puertas;

    public AutoReyna(String marca, String modelo, int año, double precio, int puertas) {
        super(marca, modelo, año, precio);
        this.puertas = puertas;
    }

    @Override
    public String arrancar() {
        String base = super.arrancar();
        return base + "El motor se enciende y el auto arranca.";
    }

    @Override
    public String acelerar(int incremento) {
        return "El auto acelera " + incremento + " km/h, esto se puede hacer de gran forma gracias a su motor.";
    }

    @Override
    public String frenar() {
        return "El auto frena.";
    }

    public String abrirMaletero() {
        return "Maletero abierto.";
    }
    
    @Override
    public String describir() {
        return "Automóvil - " + super.describir() + String.format(" | Cantidad de puertas: %d.", puertas);
    }
    
}
