package practica2;


public class EstudianteEJRM {
    private String nombre;
    private int matricula;
    private int edad;
    private String carrera;
    private int semestreActual;

    public String getNombre() {
        return nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getSemestreActual() {
        return semestreActual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setSemestreActual(int semestreActual) {
        this.semestreActual = semestreActual;
    }

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
    
}
