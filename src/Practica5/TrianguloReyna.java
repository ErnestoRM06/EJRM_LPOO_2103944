package Practica5;

public class TrianguloReyna extends Figura21{
    private double base;
    private double altura;
    
    public TrianguloReyna(double base, double altura) {
        super("Triángulo", 3);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura / 2;
    }

    @Override
    public double calcularPerimetro() {
        return base*3;
    }
    
    public double calcularArea(double A, double B, double C) {
        double s = (A + B + C) / 2;
        return Math.sqrt(s * (s-A) * (s-B) * (s*C));
    }
    
    public double calcularArea(double lado) {
        return (Math.sqrt(3) / 4) * lado * lado;
    }
    
    public double calcularPerimetro(double A, double B, double C) {
        return A + B + C;
    }
    
    public void mostrarInfo(String mensaje) {
        System.out.println(mensaje + ": Base = " + base + ", Altura = " + altura);
    }
}
