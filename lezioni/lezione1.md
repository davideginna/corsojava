# Who is?

Davide Ginnasio

Full stack developer & DevOps

<img src="attachments/td.png" alt="td" width="50">
<img src="attachments/docker.png" alt="docker" width="50">
<img src="attachments/spring.png" alt="spring" width="50">
<img src="attachments/quarkus.png" alt="quarkus" width="50">
<img src="attachments/angular.png" alt="angular" width="50">

---

# Argomenti trattati
___
<h3 style="text-align: left;">
- Casting Java</br>
- Utilizzo di operatori e costrutti (if-else, while, switch, for)</br>
- Array</br>
___
<h3 style="text-align: left;">
- Interfaccia</br>
- Classe astratta</br>
</h3>
___
<h3 style="text-align: left;">
- Gestione errori ed eccezioni</br>
- Lombok</br>
- Esercitazione finale</br>
</h3>
---
# premessa
Principi fondamentali di Java:

- Astrazione;
- Incapsulamento;
- Ereditarietà;
- Modularità.
___
### Astrazione

"L’astrazione ci consente di evidenziare le caratteristiche fondamentali di un oggetto e di classificarlo simile ad altri dello stesso tipo e distinto da tutti gli altri tipi e quindi ci consente di tracciare confini concettuali ben definiti per descriverlo all’interno di un certo contesto di osservazione che ci interessa."
___
### Esempio astrazione

Sistema di trasporto di oggetti: peso, dimensione.
Uno strumento musicale puo' essere classificato anche come strumento a corda o fiato. Classificazione non necessaria nel nostro sistema di trasporti.
___
### Incapsulamento

"L’incapsulamento è il processo di suddivisione degli elementi di un’astrazione che ne costituiscono la struttura e il comportamento; incapsulamento serve a separare l’interfaccia costruita per un certo tipo di astrazione e la sua attuazione."
___
### Esempio Incapsulamento

Sistema di trasporto oggetti.

Per i colli fragili il calcolo del massimo peso sostenibile e' diverso da oggetto ad oggetto.
___
### Ereditarietà
L'ereditarietà consiste in una relazione padre filgio fra le varie classi utilizzate. Se la classe B eredita dalla classe A, si dice che B è una sottoclasse di A e che A è una superclasse di B. L'ereditarietà può essere ereditarietà singola (ogni classe può avere al più una superclasse diretta) o multipla (ogni classe può avere più superclassi dirette).
___
### Esempio Ereditarietà
Cerchio e' figlio dellla classe Figura ed eredita quindi le proprieta della figura come area e perimetro.
___
### Modularità
Paradigma di programmazione che consiste nella realizzazione di programmi suddivisi in moduli, ognuno dei quali svolge precise funzioni.
___
### Modularità
I punti cardine della programmazione modulare sono:
- suddivisione del programma in singoli moduli,
- indipendenza dei moduli tra loro,
- interazione minima di ciascun modulo con il mondo esterno,
- facile testabilità dei moduli come entità isolate,
- dichiarazione esplicita e semplificazione delle interfacce mediante le quali i moduli comunicano tra loro.
___
### Modularità
I principali vantaggi della programmazione modulare sono:
- riutilizzabilità dei moduli,
- sviluppo separato (minima interazione tra sviluppatori).
---
# Casting Java
Java è un linguaggio “fortemente tipato”, vale a dire che e' presente uno stretto controllo sull’utilizzo dei tipi.

Quindi non è possibile assegnare un carattere ad un intero o anche assegnare un double ad un float, senza un esplicito casting.
___
Casting, forzare un valore di un tipo ad assumere un tipo diverso
```java
public class Main{
	public static void main(String[] args) {
        int n = 5;
        float f = (float) n;
        System.out.println(n); 
        System.out.println(f);
    }
}
```
```sh
output
5
5.0
```
___
Casting, forzare un valore di un tipo ad assumere un tipo diverso
```java
public class Main{
	public static void main(String[] args) {
        int n = 5;
        String s = Integer.toString(n);
        int i = Integer.parseInt(s);  
        System.out.println(s); 
        System.out.println(i);
    }
}
```
```sh
output
"5"
5
```
___
Casting, forzare un valore di un tipo ad assumere un tipo diverso
```java
public class Main{
	public static void main(String[] args) {
        int n = 5;
        String s = "23.6";  
        float f = Float.parseFloat(s);  
        System.out.println(s); 
        System.out.println(n);
    }
}
```
```sh
output
"23.6"
23.6
```
___
Esempio
```java
double v1 = 10.0;
float v2;
int v3 = 5;

v2 = v1;
v1 = v3;
```
___
Esempio
```java
double v1 = 10.0;
float v2;
int v3 = 5;

v2 = v1; // non si può assegnare un double a un float
v1 = v3; // non si può assegnare un intero a un double
```
___
Per rendere possibili questi assegnamenti, dobbiamo "castarli" al tipo specifico
```java
double v1 = 10.0;
float v2;
int v3 = 5;

v2 = (float) v1;
v1 = (double) v3;
```
---
# Utilizzo di operatori e costrutti
___
### operatori aritmetici (+, -, *, /, %)

Le operazioni sono tipate, quindi se sommiamo due interi otteniamo un valore intero, così per tutte le operazioni, in questo modo possiamo sempre prevedere il tipo del risultato di una certa espressione.
___

```java
public class Main{
	public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(a+b); 
    }
}
```
```sh
output
3
```
___
```java
public class Main{
	public static void main(String[] args) {
	    int x = 50;
        int y = 2;  
        System.out.println(x%y); 
    }
}
```
```sh
0
```

___
```java
public class Main{
	public static void main(String[] args) {
	    int n = 5;
        String s = "23.6";  
        System.out.println(5/s); 
    }
}
```
```sh
Main.java:9: error: bad operand types for binary operator '/'
        System.out.println(5/s); 
                            ^
  first type:  int
  second type: String
1 error
```
___
La divisione tra interi, a differenza di altri linguaggi, ritorna un valore intero.

Quindi se vogliamo ottenere il numero reale derivato dalla divisione dei due numeri interi x e y, bisogna prima trasformarli in reali.
```java
public class Main{
	public static void main(String[] args) {
        int x = 13;
        int y = 3;
        float risultato= (float) x / (float) y;
        System.out.println(risultato); 
    }
}
```
```sh
output
4.3333335
```
___
### “punto” (.)
Accesso a campi e metodi di classi e oggetti. 
``` java
persona.nome
persona.cognome
persona.dataNascita
persona.eta(persona.dataNascita)
```
___

### operatori logici abbreviati

```java
// esteso
a = a + 5;

// abbreviato
a += 5;
```
Vale lo stesso per ogni operatore binario
___
altre abbreviazioni
```java
x++; // valuta X, poi incrementa X di 1

x--; // valuta X, poi decrementa X di 1

++x; // incrementa X di 1, poi valuta X

--x; // decrementa X di 1, poi valuta X
```
___

L’espressione X++ è un comando di assegnamento, ma anche una espressione che restituisce un risultato.
___

- Se l’operatore segue la variabile (x++), l’espressione restituisce il valore attuale della variabile prima di modificarlo;
```java
public class Main{
	public static void main(String[] args) {
        int x = 1;
        System.out.println(x++); 
    }
}
```
```sh
output
1
```
___
- Se l’operatore precede la variabile (++x), l’espressione restituisce il valore della variabile già modificato.
```java
public class Main{
	public static void main(String[] args) {
        int x = 1;
        System.out.println(++x); 
    }
}
```
```sh
output
2
```
___
Esempio
```java
public class Main{
    public static void main(String [] a){
        int X,Y,Z,W,V;
        X = 10;
        System.out.println("X="+X);
        Y = X++;
        System.out.println("Y=X++: ho X="+X+",Y="+Y);
        Z = ++Y;
        System.out.println("Z=++Y: ho Z="+Z+",Y="+Y);
        W = Z--;
        System.out.println("W=Z--: ho W="+W+",Z="+Z);
        V = --W;
        System.out.println("V=--W: ho V="+V+",W="+W);
    }
}
```
___
Esempio
```java
public class Main{
    public static void main(String [] a){
        int X,Y,Z,W,V;
        X = 10;
        System.out.println("X="+X);
        Y = X++;
        System.out.println("Y=X++: ho X=" + X + ",Y=" + Y);
        Z = ++Y;
        System.out.println("Z=++Y: ho Z=" + Z + ",Y=" + Y);
        W = Z--;
        System.out.println("W=Z--: ho W=" + W + ",Z=" + Z);
        V = --W;
        System.out.println("V=--W: ho V=" + V + ",W=" + W);
    }
}
```
```sh
output
X=10
Y=X++: ho X=11,Y=10
Z=++Y: ho Z=11,Y=11
W=Z--: ho W=11,Z=10
V=--W: ho V=10,W=10
```
___

### operatori su stringhe

Per le stringhe esiste un operatore di concatenamento:
```java
public class Main{
    public static void main(String [] a){
        String a = "corso " ;
        String b = a + "java";
        String b += ":)"
    }
}
```
```sh
ouput
"corso java:)"
```
L’operatore "+" appende ad una stringa anche caratteri e numeri come visto prima.
___
```java
public class Main{
	public static void main(String[] args) {
	    int n = 5;
        String s = "23.6";  
        System.out.println(5+s); 
    }
}
```
```sh
output
523.6
```
"Ma avevamo detto che le espressioni Java sono ben tipate! Come e' possibile questa cosa??
___
Questo avviene però perché il sistema effettua delle conversioni implicite di tipi primitivi e oggetti in stringhe.

Ad esempio definendo un qualsiasi oggetto, se ne definisco un metodo "toString()".

Quindi il sistema che si troverà a lavorare con stringhe e con quest’oggetto ne invocherà automaticamente il metodo "toString()".
___

### Operatori di confronto

<table style="border-collapse:collapse;border-spacing:0" class="tg"><thead><tr><th style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:24px;font-weight:bold;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Operatore</th><th style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:24px;font-weight:bold;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Descrizione</th><th style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:24px;font-weight:bold;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">espressione</th><th style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:24px;font-weight:bold;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Cosa restituisce</th></tr></thead><tbody><tr><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">&gt;</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">maggiore di</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">x&gt;y</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">true se x è strettamente maggiore di y. false altrimenti</td></tr><tr><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">&gt;=</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">maggiore o uguale di</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">x&gt;=y</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">true se x è maggiore o uguale di y. false altrimenti</td></tr><tr><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">&lt;</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">minore di</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">x&lt;y</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">true se x è strettamente minore di y. false altrimenti</td></tr><tr><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">&lt;=</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">minore o uguale di</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">x&lt;=y</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">true se x è minore o uguale di y. false altrimenti</td></tr><tr><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">==</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">uguale</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">x==y</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">true se x è uguale a y. false altrimenti</td></tr><tr><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">!=</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">diverso</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">x!=y</td><td style="border-color:inherit;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">true se x è diverso da y. false altrimenti</td></tr></tbody></table>

___
### Operatori logici

<table style="border-collapse:collapse;border-spacing:0" class="tg"><thead><tr><th style="border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:24px;font-weight:normal;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Operatore</th><th style="border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:24px;font-weight:normal;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Descrizione</th><th style="border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:24px;font-weight:normal;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">espressione</th><th style="border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:24px;font-weight:normal;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">Cosa restituisce</th></tr></thead><tbody><tr><td style="border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">&amp;&amp;</td><td style="border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">and</td><td style="border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">x&amp;&amp;y</td><td style="border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">true se x e y sono entrambe vere. false altrimenti (almeno una delle due false)</td></tr><tr><td style="border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">||</td><td style="border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">or</td><td style="border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">x||y</td><td style="border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">true se almeno una tra x e y è vera (o entrambe). false altrimenti (entrambe false)</td></tr><tr><td style="border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">!</td><td style="border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">not</td><td style="border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">!x</td><td style="border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:20px;overflow:hidden;padding:10px 5px;text-align:left;vertical-align:top;word-break:normal">true se x è falsa e false se x è vera.</td></tr></tbody></table>
___

### L’Operatore condizionale in Java
```java
expBool ? expVero : expFalso;
```
___

### if-else
Eseguire una certa porzione di codice in base ad una “scelta”.
```
if(condizione1) {
    // ...
} else if (condizione2) {
    // ...
} else {
    //...
}
```
___
### if-else
Esempio
```java
public class Main{
	public static void main(String[] args) {
        int a = 2;
        int b = 5;
	    if (a == b){
            System.out.println("numeri diversi");
        }else{
            System.out.println("numeri uguali");
        }
    }
}
```
```sh
"numeri diversi"
```
___
### if-else
- La condizione deve essere sempre un boolean.
- L'else e non è obbligatorio.
- Possono essere nidificati
___

### switch
```
switch(c) {
    case value1:
        ...
    break;
    case value2:
        ...
    break;
        // eventuali altri case
    case valueN:
        ...
    default:
}
```
___

### switch
Esempio
```java
public class Main{
	public static void main(String[] args) {
        int c = 1;
        switch (c) {
            case 1:
                System.out.print("numero 1");
                break;
            case 2:
                System.out.print("numero 2");
                break;
            default:
                System.out.println("altro numero");
        }
    }
}
```
___

### tabelle di verita'
0 falso  1 vero

AND

| X | Y | X ∧ Y |
|:-:|:-:|:-----:|
| 0 | 0 |   0   |
| 0 | 1 |   0   |
| 1 | 0 |   0   |
| 1 | 1 |   1   |
___

### tabelle di verita'
0 falso  1 vero

OR

| X | Y | X ∧ Y |
|:-:|:-:|:-----:|
| 0 | 0 |   0   |
| 0 | 1 |   1   |
| 1 | 0 |   1   |
| 1 | 1 |   1   |
___
### tabelle di verita'
0 falso  1 vero

NOT

| X | ¬X |
|:-:|:-:|
| 0 | 1 |
| 1 | 0 |
___
### while

Il ciclo while esegue una istruzione o un blocco di codice finché rimane verificata una certa condizione

```
while(condizione) {
	// ...
}
```
___

### do-while
Simile al while ma in questo caso prima si esegue il blocco tra graffe e poi si valuta la condizione

```
do {
	// ...
} while(condizione);
```
___

### for

- inizializzazione eseguita solo una volta prima di iniziare il ciclo;
- incremento da eseguire al termine di ogni esecuzione del blocco;
- condizione di terminazione (o uscita) dall’esecuzione iterativa.
```
for(inizializzazione; condizione; incremento) {
	// ...
}
```
___

### while identico a for

```java
int i=0;
while(i < 10) {
	// ...
	i++;
}
```

```java
for(int i=0; i<10; i++) {
	// ...
}
```
___
### cicli infiniti
```
for(;;) {
	// ...
}
```
```
while (true){
    // ...
}
```
___

### iteratori
```java
Queue<String> queue = new LinkedList<String>();

for(Iterator<String> it = queue.iterator(); it.hasNext(); ) {
  String tmp = it.next();
  // ... qui fa qualcosa
}
```
Si deve effettuare il cast su it.next() con il rischio di un’eccezione a runtime.

In realtà questa iterazione non è pulita in quanto ci obbliga a utilizzare una struttura dati (Iterator) che di fatto non utilizziamo.
___

### for each
```java 
for(String tmp:queue) {
  //...
}
```
Permette una definizione automatica di tutto ciò in un solo comando integrato

---
# Array
Un array in Java è un contenitore che permette di gestire una sequenza di lunghezza fissa di elementi tutti del medesimo tipo.

Il numero di elementi in un array, detto lunghezza dell’array, deve essere dichiarato al momento della sua allocazione e non può essere cambiato.
___
### Allocazione array
<img src="attachments/array.gif" alt="array" width="500">

```java
int n = 10;
Tipo nome = new Tipo[n];
nome[8]; // indica il terzo elemento della collezione

```
___

Esempio
```java
public static void main (String[] args) {         
    int[] arr;
    arr = new int[5];
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;
    arr[3] = 40;
    arr[4] = 50;
    for (int i = 0; i < arr.length; i++){
        System.out.println("Element at index " 
                                + i + " : "+ arr[i]);
    }
}
```
```
output
Element at index 0 : 10
Element at index 1 : 20
Element at index 2 : 30
Element at index 3 : 40
Element at index 4 : 50
```
___
Altri tipi di array
```java
byte byteArray[];
short shortsArray[];
boolean booleanArray[];
long longArray[];
float floatArray[];
double doubleArray[];
char charArray[];
MyClass myClassArray[]; 
```
___
Esempio
```java
class Student{
    public int matricola;
    public String name;
    Student(int matricola, String name){
        this.matricola = matricola;
        this.name = name;
    }
}
public static void main (String[] args){
    Student[] arr;
    arr = new Student[5];
    arr[0] = new Student(1,"rosa");
    arr[1] = new Student(2,"marina");
    arr[2] = new Student(3,"luca");
    arr[3] = new Student(4,"marco");
    arr[4] = new Student(5,"andrea");
    for (int i = 0; i < arr.length; i++)
        System.out.println("Element at " + i + " : " +
                    arr[i].matricola +" "+ arr[i].name);
    }
}
```
```
output
Element at 0 : 1 rosa
Element at 1 : 2 marina
Element at 2 : 3 luca
Element at 3 : 4 marco
Element at 4 : 5 andrea
```
___
### Errore in Array
```java
public class Main{
    public static void main(String args[]) {
        int[] a = new int[1];
        a[0]=0;
        System.out.println(a);
        System.out.println(a[0]);
    }
}
```
```
output
[I@2a139a55
0
```
___
### Errore in Array
Accesso a posizione di memoria non valide
```java
public class Main{
    public static void main(String args[]) {
        int[] a = new int[1];
        a[0]=0;
        System.out.println(a);
        System.out.println(a[0]);
        a[1]=0;
    }
}
```
```
output
[I@2a139a55
0
Exception in thread "main" java.lang.
        ArrayIndexOutOfBoundsException: 1
        at Main.main(Main.java:16)
```
___
### Array multidimensionali
Java permette l’utilizzo di array di array di profondità arbitraria (o con numero di dimensioni arbitrario) 
```java
int [][][] cubo = new int[10][10][10];
int[][] matrice = new int[10][10];
```
___
### java.util.Arrays
Gli array sono un costrutto classico di praticamente ogni linguaggio di programmazione e, nonostante il limite notevole di non poter cambiare dimensione (size) dopo la creazione il loro utilizzo è estremamente comune in molti ambiti.

Perciò Java mette a disposizione la classe **java.util.Arrays** con numerosi algoritmi per operare sugli array come la ricerca, ordinamento, copia ecc..

https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html

---
### Esercizio 1
Generatore di numeri random positivi.
<p style="font-size:30px;text-align:left;">
Plus 1: limitare i numeri estratti tra 0 e 100 non compresi.<br>
Plus 2: modifica del "seme" di randomizzazione.<br>
</p>
___
### Esercizio 2
Pallottoliere del bingo, estrazione di 90 numeri senza ripetizioni da 1 a 90.
<p style="font-size:30px;text-align:left;">
Plus 1: estrazione di un numero ogni secondo
</p>
___
### Esercizio 3
- Data una stringa del tipo "Lorem ipsum dolor sit amet", utilizzando i metodi delle stringhe, trasformare la stringa nei seguenti modi:
<p style="font-size:30px;text-align:left;">
LOREM IPSUM, DOLOR SIT AMET (tutto maiuscolo)<br>
lorem ipsum dolor sit amet (tutto minuscolo)<br>
Lorem Ipsum Dolor Sit Amet (prime lettere maiuscole, camel case)<br>
</p>
___
# Let's code
<img src="attachments/code.gif" alt="code" width="500">
___

<img src="attachments/successo.gif" alt="successo" width="750">

---
# Fonti
<p style="font-size:30px;text-align:left;">
https://www.html.it/pag/50730/principi-di-oop/<br>
https://www.html.it/pag/15103/operatori/<br>
https://www.html.it/pag/15104/istruzioni-e-costrutti-fondamentali/<br>
https://www.html.it/pag/18030/sintassi-del-ciclo-for/<br>
https://www.html.it/pag/50430/gli-array-in-java/<br>
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html<br>
https://www.geeksforgeeks.org/arrays-in-java/<br>
</p>

---

![gameover](attachments/gameover.gif)