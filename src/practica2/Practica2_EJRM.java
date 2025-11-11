package practica2;


public class Practica2_EJRM {

    public static void main(String[] args) {
        EstudianteEJRM estudiante1 = new EstudianteEJRM("Ernesto Reyna", 2103944, 19);
        EstudianteEJRM estudiante2 = new EstudianteEJRM("Josue Monrreal", 2203944, 18, "LCC", 5);
        EstudianteEJRM estudiante3 = new EstudianteEJRM(2303944, "LCC", 5);
        EstudianteEJRM estudiante4 = new EstudianteEJRM("EJRM", 2403944, 18, "LCC", 5);
        EstudianteEJRM estudiante5 = new EstudianteEJRM("Eduardo Reyna", 2503944, 18, "LCC", 5);
        
        estudiante3.setNombre("Jesus Monrreal");
        estudiante3.setEdad(20);
        
        EstudianteEJRM[] estudiantes = {estudiante1, estudiante2, estudiante3, estudiante4, estudiante5};
        
        Universidad3944 Universidad = new Universidad3944();
        
        Universidad.setEstudiantes(estudiantes);
        
        Universidad.buscarEstudiante(2103944).setCarrera("LCC");
        Universidad.buscarEstudiante(2103944).setSemestreActual(5);
        
        for(EstudianteEJRM est : Universidad.mostrarEstudiantes()) {
            System.out.println("Estudiante: " + est.getNombre() + ", edad: " + est.getEdad() + ". Matricula: " + est.getMatricula() + ", carrera: " + est.getCarrera() + ", semestre actual: " + est.getSemestreActual() + ".");
        }
        
    }
    
}
