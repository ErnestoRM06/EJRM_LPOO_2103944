package Practica4;

public class CamionReyna extends VehiculoBaseEJRM {

    private String tipo;
    private double capacidadToneladas;

    public CamionReyna(String marca, String modelo, int anio, double precio, String tipo, double capacidadToneladas) {
        super(marca, modelo, anio, precio);
        this.capacidadToneladas = capacidadToneladas;
        this.tipo = tipo;
    }

    @Override
    public String arrancar() {
        String base = super.arrancar();
        return base + "El camión enciende gracias a su motor diésel.";
    }

    @Override
    public String frenar() {
        return "El camión frena gracias a sus frenos neumáticos.";
    }

    public String acoplarCarga() {
        return "Carga acoplada correctamente.";
    }
    
    @Override
    public String describir() {
        return "Camión - " + super.describir() + String.format(" | Tipo de camión: %s. Capacidad: %.2f t", tipo, capacidadToneladas);
    }

}

