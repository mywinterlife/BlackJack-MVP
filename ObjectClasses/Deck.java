package ObjectClasses;
import Enums.Suit;
import Enums.Value;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
Class contains:
Properties/fields: deck(list)
Method(s): setDeck, shuffleDeck, swapCards
 */

public class Deck
{
    // Create the list of 52 cards.
    private List<Card> deck = new ArrayList<>(52);
    //cardCount is how many cards have been played -1, (its the index)
    private int cardCounter = -1;

    //Populate  the list with the 52 unique cards
    //This should be "nested/enhanced" for loops
    public void setDeck()
    {
        //First loop should go through each Enums.Suit enum.
        //The body will be repeated 4 times total, once for each value in Enums.Suit
        for (Suit cardSuit : Suit.values())
        {
            //Second loop once per Enums.Suit goes through the 13 values in the Enums.Value enum
            for (Value cardValue : Value.values())
            {
                //once per suit:value pair, add a new Objects.Card object to the list
                //the suit comes from the first loop, the value comes from the second
                //this code runs 52 times in total, filling the deck
                deck.add(new Card(cardValue, cardSuit));
                //^This is crazy efficient & compact. I'll remember getting stuck here with structure
                //This creates 52 Card objects and add(s) each of those to the "deck" list.
                //".add" is a method in the utility class.
                // Card is not a constructor, it calls the constructor in the Card Class.
            }
        }
    }

    //Randomize/Shuffle the placement of each Object.Card in the list
    public void shuffleDeck()
    {
        System.out.println("You are using a newly shuffled deck");
        //for each Object.Card, swap it with a random Objects.Card
        int cardCount = deck.size();
        //Much Wow!! There is a util for random (datatype)
        Random random = new Random();
        //Create for loop to go through each card in the deck
        //cardCount can be the used for size/number with the previously established deck.size
        for (int i = 0; i<cardCount; i++)
        {
            int j = random.nextInt(cardCount);
            swapCards(i, j);
        }
    }
    //Take two numbers(ints) as parameters and swap the values of the Cards at those indexes
    private void swapCards(int i, int j)
    {
        Card temp = deck.get(i);
        deck.set(i, deck.get(j));
        deck.set(j, temp);
    }

    public void printDeckInfo()
    {
        //iterate through the deck
        for (Card card : deck)
        {
            String cardOutput = card.getCardValue() + " of " + card.getCardSuit();
            System.out.println(cardOutput);

            //String cardOutput = toString(deck.get(i).getCardSuit());
        }
        //println what card is
        //System.out.println(());
    }

    //private String toString(Suit cardSuit)
    //String cardOutput = card.getCardValue() + " of " + card.getCardSuit();
    //System.out.println(cardOutput);

    public Card pullnextcard()
    {
        cardCounter++;
        return deck.get(cardCounter);
    }
    public void checkForShuffle()
    {
        if(cardCounter >42) shuffleDeck();
    }
}

    /*
    TODO - figure out how to have dealer deal cards from the deck...
    TODO #2 - Here in Deck class we could create a getter method that will return the next Card from the deck?
    deck is private so instead of the Dealer taking a Card
    We need to use a getter so the Dealer can request a Card from the Deck
    anytime we need to give information from one class or object to another,
    we use a getter with a return type of the data type that matches the "getter" name.
    Critical part of access/scope
    */

/*
    for (int i=0; i<deck.size(); i++)
        {
        System.out.println(deck.get(i).getCardSuit());
        System.out.println(deck.get(i).getCardValue());
        //String cardOutput = toString(deck.get(i).getCardSuit());
*/









