package functional;

public class Persona {
    private String cf;
    private String nome;
    private int eta = 0;
    private String comuneDiNascita;

    public Persona() {

    }

    public Persona(String cf, String nome) {
        this.cf = cf;
        this.nome = nome;
    }

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String getComuneDiNascita() {
        return comuneDiNascita;
    }

    public void setComuneDiNascita(String comuneDiNascita) {
        this.comuneDiNascita = comuneDiNascita;
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public boolean isMaggiorenne() {
        return this.eta >= 18;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Persona other = (Persona) obj;
        if (cf == null) {
            return other.cf == null;
        }
        return cf.equals(other.cf);
    }

    /**
     * restituisce l'istanza con il valore massimo di eta'
     */
    public static Persona getMax(Persona p1, Persona p2) {
        if (p1.getEta() > p2.getEta()) {
            return p1;
        }
        return p2;
    }
}