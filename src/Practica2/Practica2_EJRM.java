package Practica2;


public class Practica2_EJRM {

    public static void main(String[] args) {
        EstudianteEJRM estudiante1 = new EstudianteEJRM("Ernesto Reyna", 2103944, 17);
        EstudianteEJRM estudiante2 = new EstudianteEJRM("Josue Monrreal", 2203944, 18, "LCC", 5);
        EstudianteEJRM estudiante3 = new EstudianteEJRM(2303944, "LCC", 5);
        EstudianteEJRM estudiante4 = new EstudianteEJRM("EJRM", 2403944, 18, "LCC", 5);
        EstudianteEJRM estudiante5 = new EstudianteEJRM("Eduardo Reyna", 2503944, 16, "LCC", 5);
        
        estudiante3.nombre = "EJRM";
        estudiante3.edad = 19;
        
        EstudianteEJRM[] estudiantes = {estudiante1, estudiante2, estudiante3, estudiante4, estudiante5};
        
        Universidad3944 Universidad = new Universidad3944();
        
        Universidad.setEstudiantes(estudiantes);
        
        Universidad.buscarEstudiante(2103944).cambiarCarrera("LCC");
        
        for(EstudianteEJRM est : Universidad.mostrarEstudiantes()) {
            est.mostrarInfo();
        }
        
        Universidad.buscarEstudiante(2203944).cambiarCarrera("LMAT");
        Universidad.buscarEstudiante(2303944).avanzarSemestre();
        Universidad.buscarEstudiante(2403944).aumentarEdad();
        
        System.out.println("\nDespues de cambios:\n");
        
        for(EstudianteEJRM est : Universidad.mostrarEstudiantes()) {
            est.mostrarInfo();
            if(est.esMayorDeEdad()) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("Es menor de edad");
            }
        }
    }
    
}
