package Practica5;

public class Practica5_EJRM {
    
    public static void main(String[] args) {
        CalculadoraGeometrica3944 calculadora = new CalculadoraGeometrica3944();

        CirculoReyna circulo = new CirculoReyna(06);
        RectanguloReyna rectangulo = new RectanguloReyna(21, 10);
        TrianguloReyna triangulo = new TrianguloReyna(39, 44);

        calculadora.agregarFigura(circulo);
        calculadora.agregarFigura(rectangulo);
        calculadora.agregarFigura(triangulo);
        
        System.out.println(circulo.calcularArea(21));
        System.out.println(rectangulo.calcularPerimetro(10));
        System.out.println(triangulo.calcularArea(10, 39, 44) + "\n");

        calculadora.mostrarAreas();

        for (Figura21 f : calculadora.getFiguras()) {
            if (f instanceof CirculoReyna) {
                CirculoReyna ci = (CirculoReyna) f;
                ci.mostrarInfo("La figura es un circulo");
            } else if (f instanceof RectanguloReyna) {
                ((RectanguloReyna) f).mostrarInfo("La figura es un rectangulo");
            } else if (f instanceof TrianguloReyna) {
                ((TrianguloReyna) f).mostrarInfo("La figura es un triangulo");
            }
        }
    }
}
