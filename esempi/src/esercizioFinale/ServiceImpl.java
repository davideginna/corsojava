package esercizioFinale;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;


public class ServiceImpl implements Service {


    @Override
    public List<Prodotto> riempiCatalogo() {
        System.out.println("Inizializzazione del catalogo prodotti");
        List<Prodotto> catalogo = new ArrayList<>();
        var result =
                Collections.addAll(
                        catalogo,
                        Prodotto.builder()
                                .codice("001")
                                .nome("sedia gaming")
                                .prezzo(119.99)
                                .peso(25.06)
                                .dataCreazione(new Date())
                                .dataModifica(new Date())
                                .build(),
                        Prodotto.builder()
                                .codice("002")
                                .nome("borraccia")
                                .prezzo(6.00)
                                .peso(1)
                                .dataCreazione(new Date())
                                .dataModifica(new Date())
                                .build(),
                        Prodotto.builder()
                                .codice("003")
                                .nome("scrivania")
                                .prezzo(80.00)
                                .peso(15)
                                .dataCreazione(new Date())
                                .dataModifica(new Date())
                                .build(),
                        Prodotto.builder()
                                .codice("004")
                                .nome("notebook")
                                .prezzo(699.99)
                                .peso(4.7)
                                .dataCreazione(new Date())
                                .dataModifica(new Date())
                                .build(),
                        Prodotto.builder()
                                .codice("005")
                                .nome("monitor")
                                .prezzo(130.79)
                                .peso(7.12)
                                .dataCreazione(new Date())
                                .dataModifica(new Date())
                                .build()
                );
        return catalogo;
    }

    @Override
    public void stampaLogin() {
        System.out.println("=== LOGIN ===\n" + "0 - accesso come venditore\n" + "1 - accesso come cliente\n" + "2 - chiudi");
    }

    @Override
    public void stampaCatalogo(List<Prodotto> catalogo) {
        System.out.println("\n=== stampaCatalogo ===\n" + catalogo + "\n=== stampaCatalogo ===\n");
    }

    @Override
    public void stampaCarrello(List<Prodotto> carrello) {
        System.out.println("\n=== stampaCarrello ===\n" + carrello + "\n=== stampaCarrello ===\n");
    }

    @Override
    public void stampaOrdine(List<Prodotto> ordine) {
        System.out.println("\n=== stampaOrdine ===\n" + ordine + "\n=== stampaOrdine ===\n");
    }

    @Override
    public void stampaLunghezzaCatalogo(List<Prodotto> catalogo) {

    }

    @Override
    public void stampaLunghezzaCarrello(List<Prodotto> carrello) {

    }

    @Override
    public void stampaLunghezzaOrdine(List<Prodotto> ordine) {

    }
}
