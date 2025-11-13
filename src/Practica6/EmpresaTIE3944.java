package Practica6;

public class EmpresaTIE3944 {
    private EmpleadoER[] empleados;

    public EmpresaTIE3944() {
        empleados = new EmpleadoER[0];
    }
    
    public EmpresaTIE3944(EmpleadoER[] empleados) {
        this.empleados = empleados;
    }

    public void agregarEmpleado(EmpleadoER e) {
        EmpleadoER[] nuevo = new EmpleadoER[empleados.length + 1];

        System.arraycopy(empleados, 0, nuevo, 0, empleados.length);
        nuevo[empleados.length] = e;

        empleados = nuevo;
    }

    public void mostrarEmpleados() {
        for (EmpleadoER e : empleados) {
            if (e != null) {
                e.mostrarInfo();
                e.mostrarRol();
                System.out.println("Salario final: " + e.calcularSalarioFinal());
                System.out.println("---------------");
            }
        }
    }
}
