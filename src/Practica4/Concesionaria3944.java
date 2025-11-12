package Practica4;

public class Concesionaria3944 {

    private VehiculoBaseEJRM[] inventario;

    public Concesionaria3944() {
        this.inventario = new VehiculoBaseEJRM[0];
    }

    public void agregarVehiculo(VehiculoBaseEJRM vehiculoNuevo) {
        VehiculoBaseEJRM[] nuevo = new VehiculoBaseEJRM[inventario.length + 1];

        System.arraycopy(inventario, 0, nuevo, 0, inventario.length);
        nuevo[inventario.length] = vehiculoNuevo;

        inventario = nuevo;
    }

    public void mostrarInventario() {
        System.out.println("--- Inventario Concesionaria 3944 ---");
        for (VehiculoBaseEJRM v : inventario) {
            System.out.println(v.describir());
        }
    }

}
