package Practica6;

public abstract class EmpleadoER {
    
    protected String nombre;
    protected int edad;
    protected double salarioBase;

    public EmpleadoER(String nombre, int edad, double salarioBase) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    // Métodos abstractos (obligatorios en subclases)
    public abstract double calcularSalarioFinal();
    public abstract void mostrarRol();

    // Métodos concretos (compartidos)
    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + 
                           ". Edad: " + edad + 
                           ". Salario base: " + salarioBase);
    }

    public void aumentarSalario(double porcentaje) {
        salarioBase += salarioBase * (porcentaje / 100);
    }
}
