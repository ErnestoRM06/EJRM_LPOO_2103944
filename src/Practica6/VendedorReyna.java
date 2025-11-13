package Practica6;

public class VendedorReyna  extends EmpleadoER implements Bonificable21, Promovible3944{
    private double totalDeVentas;

    public VendedorReyna(String nombre, int edad, double salarioBase, double ventas) {
        super(nombre, edad, salarioBase);
        totalDeVentas = ventas;
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + calcularBono(15);
    }

    @Override
    public void mostrarRol() {
        System.out.println(nombre + " es Vendedor y a ganado $" + totalDeVentas + " en ventas.");
    }

    @Override
    public double calcularBono(double porcentaje) {
        return totalDeVentas * (porcentaje / 100);
    }

    @Override
    public boolean esPromovible(double calificacion) {
        return calificacion > 8.5 && totalDeVentas > 10000;
    }
}
