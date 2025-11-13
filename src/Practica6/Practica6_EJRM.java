package Practica6;

public class Practica6_EJRM {
    public static void main(String[] args) {
        EmpresaTIE3944 empresa = new EmpresaTIE3944();

        GerenteReyna g = new GerenteReyna("Ernesto", 44, 30944, 5);
        DesarrolladorReyna d = new DesarrolladorReyna("Josué", 21, 20944, "Java");
        VendedorReyna v = new VendedorReyna("Reyna", 39, 18944, 13944);

        empresa.agregarEmpleado(g);
        empresa.agregarEmpleado(d);
        empresa.agregarEmpleado(v);

        empresa.mostrarEmpleados();
        
        Evaluable10[] ev = {g, d};
        Promovible3944[] pr = {g, v};
        
        for(Evaluable10 e : ev) {
            System.out.println("Desempeño: " + e.evaluarDesempenio(9));
        }
        
        for(Promovible3944 p : pr) {
            System.out.println("Es promovible: " + p.esPromovible(8.7));
        }
        
    }
}
