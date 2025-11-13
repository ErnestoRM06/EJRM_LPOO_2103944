package Practica5;

public class CalculadoraGeometrica3944 {
    
    private Figura21[] figuras;
    
    public Figura21[] getFiguras() {
        return figuras;
    }

    public CalculadoraGeometrica3944() {
        figuras = new Figura21[0];
    }

    public void agregarFigura(Figura21 figuraNueva) {
        Figura21[] nuevo = new Figura21[figuras.length + 1];

        System.arraycopy(figuras, 0, nuevo, 0, figuras.length);
        nuevo[figuras.length] = figuraNueva;

        figuras = nuevo;
    }

    public void mostrarAreas() {
        for (Figura21 f : figuras) {
            if (f != null) {
                System.out.println(f.getClass().getSimpleName() +
                    "\n - Área: " + f.calcularArea() +
                    ", Perímetro: " + f.calcularPerimetro());
            }
        }
    }
}
