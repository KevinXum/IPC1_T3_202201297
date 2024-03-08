import java.util.ArrayList;

abstract class Figura {
    protected int numeroLados;

    public Figura(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public abstract double calcularArea();
}

class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super(3);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        super(4);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        super(0); // un círculo no tiene lados definidos, lo estableceremos como 0.
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        
        figuras.add(new Triangulo(5, 3));
        figuras.add(new Cuadrado(4));
        figuras.add(new Circulo(3));

        // Imprimir el nombre de la figura junto al área calculada
        for (Figura figura : figuras) {
            String nombreFigura = figura.getClass().getSimpleName();
            double area = figura.calcularArea();
            System.out.println("Figura: " + nombreFigura + ", Area: " + area);
        }
    }
}