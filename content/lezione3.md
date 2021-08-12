# Errori ed eccezioni
___
<img src="attachments/java-exceptions-hierarchy.png" alt="java-exceptions-hierarchy" width="750">
___

### definizione errore
<ul>
    <li style="font-size:24px">"Errore" è una sottoclasse della classe built-in "Throwable".</li>
    <li style="font-size:24px">Gli errori sono le condizioni critiche che si verificano a causa della mancanza delle risorse di sistema e non possono essere gestite dal codice del programma. </li>
    <li style="font-size:24px">Gli errori non possono essere recuperati con alcun mezzo perché non possono essere creati, lanciati, catturati o replicati.</li>
    <li style="font-size:24px">Gli errori sono causati a causa di un errore catastrofico che di solito non può essere gestito dal programma.</li>
    <li style="font-size:24px">Gli errori sono sempre di tipo non controllato, in quanto il compilatore non ha alcuna conoscenza in merito alla sua occorrenza.</li>
    <li style="font-size:24px">Gli errori si verificano sempre nell'ambiente di runtime.</li>
    <li style="font-size:24px">La conseguenza dell'errore è che il programma viene terminato in modo anomalo.</li>
</ul>
___

### definizione eccezione
<ul>
    <li style="font-size:24px">"Exception" è anche una sottoclasse di classe built-in "Throwable".</li>
    <li style="font-size:24px">Le eccezioni sono le condizioni eccezionali che si verificano in un ambiente di runtime. La maggior parte delle volte le eccezioni sono causate dal codice del nostro programma.</li>
    <li style="font-size:24px">Le eccezioni possono essere gestite dal programma stesso, poiché le eccezioni sono recuperabili.</li>
    <li style="font-size:24px">Le eccezioni vengono gestite utilizzando tre parole chiave "try", "catch", "throw". </li>
<ul>
___

### eccezione
```java
    try{
        // ...
    }catch ("tipo eccezione 1"){
        // ...
    }catch ("tipo eccezione 2"){
        // ...
    }
```
___
### esempio senza "try" "catch"

```java
public class Main {
  public static void main(String[ ] args) {
    int[] myNumbers = {1, 2, 3};
    System.out.println(myNumbers[10]); // errore
  }
}
```
```
output
Exception in thread "main" 
        java.lang.ArrayIndexOutOfBoundsException: 10
        at Main.main(Main.java:4)
```
___

### esempio con "try" "catch"

```java
public class Main {
  public static void main(String[ ] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    }
  }
}
```
```output
"Something went wrong."
```
___
### "try" "catch" "finally"
```java
public class Main {
  public static void main(String[] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    } finally {
      System.out.println("The 'try catch' is finished.");
    }
  }
}
```
```
output
Something went wrong.
The 'try catch' is finished.

```

___
### differenza Errori ed eccezioni

<table style="border-collapse:collapse;border-spacing:0" class="tg"><thead><tr><th style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:22px;font-weight:bold;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Base per il confronto</th><th style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:22px;font-weight:bold;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Errore</th><th style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:22px;font-weight:bold;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Eccezione</th></tr></thead><tbody><tr><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Di base</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Un errore è causato dalla mancanza di risorse di sistema.</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Un'eccezione è causata dal codice.</td></tr><tr><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Recupero</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Un errore è irrecuperabile.</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Un'eccezione è recuperabile.</td></tr><tr><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Gestione</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Non c'è modo di gestire un errore dal codice del programma.</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Le eccezioni vengono gestite utilizzando tre parole chiave "try", "catch" e "throw".</td></tr><tr><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Conseguenze</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Quando viene rilevato l'errore, il programma termina in modo anomalo.</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Quando viene rilevata un'eccezione, viene lanciata e catturata dalle parole chiave "lancia" e "cattura" corrispondentemente.</td></tr><tr><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Tipi</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Gli errori sono classificati come tipo non controllato.</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Le eccezioni sono classificate come tipo spuntato o non controllato.</td></tr><tr><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Pacchetto</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">In Java, gli errori sono definiti pacchetto "java.lang.Error".</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">In Java, sono definite eccezioni in "java.lang.Exception".</td></tr><tr><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Esempio</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">OutOfMemory, StackOverFlow.</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Eccezioni controllate: NoSuchMethod, ClassNotFound.<br>Eccezioni non selezionate: NullPointer, IndexOutOfBounds.</td></tr></tbody></table>
___
### Conclusione
<img src="attachments/programmer.jpg" alt="programmer" width="500">

"In conclusione il vero problema di solito si trova tra il computer e la sedia"
___


### Conclusione reale
Le eccezioni sono il risultato di errori commessi nella codifica del programma

Gli errori sono il risultato del cattivo funzionamento del sistema
___
### Esercizi
Scrivere un programma che vada in errore.

Scrivere un programma che restituisca una eccezione e che questa venga gestita.
___
# Let's code
<img src="attachments/code.gif" alt="code" width="500">

---
# Lombok
---

# Fonti
<p style="font-size:30px;text-align:left;">
https://rollbar.com/blog/java-exceptions-hierarchy-explained/<br>
https://it.gadget-info.com/difference-between-error<br>
https://www.w3schools.com/java/java_try_catch.asp<br>
https://docs.oracle.com/javase/7/docs/api/java/lang/Exception.html<br>
</p>
---

![gameover](attachments/gameover.gif)