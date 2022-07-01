package functional;

public class Elemento {
    int valore;
    String s;

    public Elemento(int valore, String s) {
        this.valore = valore;
        this.s = s;
    }

    public int getValore() {
        return valore;
    }

    public void setValore(int valore) {
        this.valore = valore;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Elemento{" +
                "valore=" + valore +
                ", s='" + s + '\'' +
                '}';
    }
}
