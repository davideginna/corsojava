package figura;

abstract public class Figura {
    abstract double area();

    abstract double perimetro();

    public void stampaArea() {
        System.out.println("area " + area());
    }

    public void stampaPerimetro() {
        System.out.println("perimetro " + perimetro());
    }
}
