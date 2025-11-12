package Practica2;


public class EstudianteEJRM {
    String nombre;
    int matricula;
    int edad;
    String carrera;
    int semestreActual;

    public EstudianteEJRM(String nombre, int matricula, int edad, String carrera, int semestreActual) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.edad = edad;
        this.carrera = carrera;
        this.semestreActual = semestreActual;
    }

    public EstudianteEJRM(String nombre, int matricula, int edad) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.edad = edad;
    }

    public EstudianteEJRM(int matricula, String carrera, int semestreActual) {
        this.matricula = matricula;
        this.carrera = carrera;
        this.semestreActual = semestreActual;
    }
    
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + ", edad: " + edad + ". Matricula: " + matricula + ", carrera: " + carrera + ", semestre actual: " + semestreActual + ".");
    }
    public void aumentarEdad() {
        edad++;
    }  
    public void avanzarSemestre() {
        semestreActual++;
    }
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
    public void cambiarCarrera(String nuevaCarrera) {
        carrera = nuevaCarrera;
        semestreActual = 1;
    }
    
}
