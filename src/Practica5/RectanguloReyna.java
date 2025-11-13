package Practica5;

public class RectanguloReyna extends Figura21 {
    private double base;
    private double altura;
    
    public RectanguloReyna(double base, double altura) {
        super("Rectángulo", 4);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
    
    public double calcularArea(double lado) {
        return lado * lado;
    }
    
    public double calcularPerimetro(double lado) {
        return lado*4;
    }
    
    public void mostrarInfo(String mensaje) {
        System.out.println(mensaje + ": Base = " + base + ", Altura = " + altura);
    }
    
}
