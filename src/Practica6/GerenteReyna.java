package Practica6;

public class GerenteReyna extends EmpleadoER implements Bonificable21, Evaluable10, Promovible3944 {
    private int personalACargo;

    public GerenteReyna(String nombre, int edad, double salarioBase, int personal) {
        super(nombre, edad, salarioBase);
        personalACargo = personal;
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + calcularBono(20);
    }

    @Override
    public void mostrarRol() {
        System.out.println(nombre + " es Gerente y tiene a su cargo a " + personalACargo + " personas.");
    }

    @Override
    public double calcularBono(double porcentaje) {
        return salarioBase * (porcentaje / 100);
    }

    @Override
    public String evaluarDesempenio(int puntuacion) {
        return puntuacion > 8 ? "Es excelente" : "Es regular";
    }

    @Override
    public boolean esPromovible(double calificacion) {
        return calificacion >= 9.0;
    }
    
}
