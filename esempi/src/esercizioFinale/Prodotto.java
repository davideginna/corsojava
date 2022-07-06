package esercizioFinale;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Prodotto {

    private String codice;

    private String nome;

    private double prezzo;

    private double peso;

    private Date dataCreazione;

    private Date dataModifica;

}
