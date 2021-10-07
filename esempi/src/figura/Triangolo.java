package figura;

public class Triangolo extends Figura implements Scala {
    private double lato;

    public Triangolo(double lato) {
        this.lato = lato;
    }

    @Override
    double area() {
        return lato * lato / 2;
    }

    @Override
    double perimetro() {
        return lato * 3;
    }

    @Override
    public void redux(int scala) {
        lato = lato * scala / 100;
    }

    @Override
    public void aumentux(int aumento) {
        lato = lato * aumento * 50;
    }

    @Override
    public String toString() {
        return "Triangolo --> {" +
                "lato=" + lato +
                '}';
    }
}
