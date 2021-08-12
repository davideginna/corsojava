package figura;

public class Quadrato extends Figura implements Scala {
    double lato;

    public Quadrato(double lato) {
        this.lato = lato;
    }

    @Override
    double area() {
        return lato * lato;
    }

    @Override
    double perimetro() {
        return lato * 4;
    }

    @Override
    public void redux(int scala) {
        lato = lato * scala / 100;
    }
}
