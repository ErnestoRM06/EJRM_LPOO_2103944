package practica2;


public class Universidad3944 {
    private EstudianteEJRM[] estudiantes = new EstudianteEJRM[0];

    public EstudianteEJRM[] mostrarEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(EstudianteEJRM[] estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    public void agregarEstudiante(EstudianteEJRM estudianteNuevo) {
        EstudianteEJRM[] nuevo = new EstudianteEJRM[estudiantes.length + 1];

        System.arraycopy(estudiantes, 0, nuevo, 0, estudiantes.length);
        nuevo[estudiantes.length] = estudianteNuevo;

        estudiantes = nuevo;
    }
    
    public EstudianteEJRM buscarEstudiante(int matriculaBuscar) {
        for (EstudianteEJRM estudiante : estudiantes) {
            if (estudiante.getMatricula() == matriculaBuscar) {
                return estudiante;
            }
        }
        return null;
    }
    
}
