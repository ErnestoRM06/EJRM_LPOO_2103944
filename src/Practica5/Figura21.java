package Practica5;

public abstract class Figura21 implements CalculableEJRM {
    
    protected String nombre;
    protected int cantidadLados;

    public Figura21(String nombre, int lados) {
        this.nombre = nombre;
        cantidadLados = lados;
    }

    @Override
    public abstract double calcularArea();
    @Override
    public abstract double calcularPerimetro();

    public void mostrarInfo() {
        System.out.println("Figura: " + nombre + "\nCantidad de lados: " + cantidadLados);
    }
    
}
