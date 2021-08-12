package figura;

public class MainFigura {
    public static void main(String[] args) {
        Quadrato q = new Quadrato(2);
        q.stampaArea();
        q.stampaPerimetro();
        q.redux(50);
        q.stampaArea();
        q.stampaPerimetro();
    }
}
