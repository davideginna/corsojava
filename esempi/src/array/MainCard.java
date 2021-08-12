package array;

import java.util.*;

class Card {
    int number;
    String seed;

    public Card() {
    }

    public Card(int number, String seed) {
        this.number = number;
        this.seed = seed;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSeed() {
        return seed;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }
}


public class MainCard {
    //public static array.Card carte[]=new array.Card[20];

    public static List<Card> deck = new ArrayList<>();

    //carte di cuori > 2
    public static List<Card> deckA = new ArrayList<>();
    //carte di cuori <= 2
    public static List<Card> deckB = new ArrayList<>();
    //carte di quadri
    public static List<Card> deckC = new ArrayList<>();
    //carte di picche <= 2 e fiori > 4
    public static List<Card> deckD = new ArrayList<>();
    //carte di fiori comprese tra 2 e 4
    public static List<Card> deckE = new ArrayList<>();
    //altre carte
    public static List<Card> deckJunk = new ArrayList<>();

    public static void main(String[] args) {
        //popolaDeck2();
        popolaDeck();
        //stampaDeck(deck);

        for (Card card : deck) {
            switch (card.getSeed()) {
                case "C":
                    switch (card.getNumber()) {
                        case 1:
                        case 2:
                            deckB.add(card);
                            break;
                        case 3:
                        case 4:
                        case 5:
                            deckA.add(card);
                            break;
                        default:
                            deckJunk.add(card);
                            break;
                    }
                    break;
                case "Q":
                    deckC.add(card);
                    break;
                case "P":
                    switch (card.getNumber()) {
                        case 1:
                        case 2:
                            deckD.add(card);
                            break;
                        default:
                            deckJunk.add(card);
                            break;
                    }
                    break;
                case "F":
                    switch (card.getNumber()) {
                        case 5:
                            deckD.add(card);
                            break;
                        case 2:
                        case 3:
                        case 4:
                            deckE.add(card);
                            break;
                        default:
                            deckJunk.add(card);
                            break;
                    }
                    break;
                default:
                    break;

            }
        }
        stampaDeck("deckA", deckA);
        stampaDeck("deckB", deckB);
        stampaDeck("deckC", deckC);
        stampaDeck("deckD", deckD);
        stampaDeck("deckE", deckE);
        stampaDeck("deckJunk", deckJunk);
    }

    private static void stampaDeck(String nomeDeck, List<Card> deck) {
        System.out.print("\n" + nomeDeck + " ");
        for (Card card : deck) {
            System.out.print(card.number + card.seed + " ");
        }
    }

    private static void popolaDeck() {
        //carte[0]=new array.Card(1, "C");
        deck.add(new Card(1, "C"));
        deck.add(new Card(2, "C"));
        deck.add(new Card(3, "C"));
        deck.add(new Card(4, "C"));
        deck.add(new Card(5, "C"));
        deck.add(new Card(1, "Q"));
        deck.add(new Card(2, "Q"));
        deck.add(new Card(3, "Q"));
        deck.add(new Card(4, "Q"));
        deck.add(new Card(5, "Q"));
        deck.add(new Card(1, "P"));
        deck.add(new Card(2, "P"));
        deck.add(new Card(3, "P"));
        deck.add(new Card(4, "P"));
        deck.add(new Card(5, "P"));
        deck.add(new Card(1, "F"));
        deck.add(new Card(2, "F"));
        deck.add(new Card(3, "F"));
        deck.add(new Card(4, "F"));
        deck.add(new Card(5, "F"));
    }

    private static void popolaDeck2() {
        Set<Card> cardSet = new HashSet<>();
        Random r = new Random();
        String alphabet = "CQPF";
        while (cardSet.size() != 20) {
            Card card = new Card(r.nextInt(5) + 1, "" + alphabet.charAt(r.nextInt(alphabet.length())));
            if (!cardSet.contains(card)) {
                cardSet.add(card);
            }
        }
        //System.out.println(Arrays.toString(cardSet.toArray()));
        for (Card card : cardSet) {
            System.out.print(card.number + card.seed + " ");
        }
    }
}
