package Practica6;

public class DesarrolladorReyna extends EmpleadoER implements Bonificable21, Evaluable10 {
    
    private String lenguajePrincipal;

    public DesarrolladorReyna(String nombre, int edad, double salarioBase, String lenguaje) {
        super(nombre, edad, salarioBase);
        lenguajePrincipal = lenguaje;
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + calcularBono(10);
    }

    @Override
    public void mostrarRol() {
        System.out.println(nombre + " es Desarrollador y se especializa en el lenguaje  " + lenguajePrincipal);
    }

    @Override
    public double calcularBono(double porcentaje) {
        return salarioBase * (porcentaje / 100);
    }

    @Override
    public String evaluarDesempenio(int puntuacion) {
        return puntuacion >= 7 ? "Es bueno" : "Debe mejorar";
    }
    
    
    
}
