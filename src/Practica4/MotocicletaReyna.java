package Practica4;

public class MotocicletaReyna extends VehiculoBaseEJRM {

    private boolean dobleAsiento;

    public MotocicletaReyna(String marca, String modelo, int año, double precio, boolean dobleAsiento) {
        super(marca, modelo, año, precio);
        this.dobleAsiento = dobleAsiento;
    }

    @Override
    public String arrancar() {
        String base = super.arrancar();
        return base + "La motocicleta arranca facilmente.";
    }

    @Override
    public String frenar() {
        return super.frenar() + " Para frenar la motocicleta usa el freno con cuidado.";
    }

    @Override
    public String acelerar(int incremento) {
        return "La motocicleta acelera rápidamente " + incremento + " km/h, manteniendo su facilidad de manejo.";
    }

    @Override
    public String describir() {
        return "Motocicleta - " + super.describir() + String.format(" | Doble asiento: %b", dobleAsiento);
    }

}
