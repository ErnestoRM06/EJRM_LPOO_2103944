package Practica5;

public class CirculoReyna extends Figura21 {
    private double radio;

    public CirculoReyna(double radio) {
        super("Círculo", 1);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio*radio;
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI * radio*2;
    }
    
    public double calcularArea(double diametro) {
        return Math.PI * diametro*diametro/4;
    }

    public double calcularPerimetro(double diametro) {
        return Math.PI * diametro;
    }
    
    public double calcularArea(double radio1, double radio2) {
        return Math.PI * radio1 * radio2;
    }
    
    public void mostrarInfo(String mensaje) {
        System.out.println(mensaje + ": Radio = " + radio);
    }
    
}
