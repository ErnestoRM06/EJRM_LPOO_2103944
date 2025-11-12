package Practica4;

public class Practica4_EJRM {
    
    public static void main(String[] args) {
        VehiculoBaseEJRM vehiculo = new VehiculoBaseEJRM("Chevrolet", "Bocho", 2010, 20000);
        AutoReyna auto = new AutoReyna("BMW", "Automatico", 2017, 35000, 4);
        MotocicletaReyna moto = new MotocicletaReyna("Kawasaki", "Pequeña", 2017, 35000, false);
        CamionReyna camion = new CamionReyna("Toyota", "Estatal", 2009, 50000, "Flexible", 1000);
        
        System.out.println(auto.abrirMaletero());
        System.out.println(camion.acoplarCarga() + "\n");
        
        VehiculoBaseEJRM[] coleccion = {vehiculo, auto, moto, camion};
        
        Concesionaria3944 con = new Concesionaria3944();
        
        for(VehiculoBaseEJRM v : coleccion) {
            v.arrancar();
            v.acelerar(20);
            v.frenar();
            System.out.println(v);
            con.agregarVehiculo(v);
        }
        
        System.out.println("\n");
        con.mostrarInventario();
        
    }
}
