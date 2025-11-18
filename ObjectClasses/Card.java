package ObjectClasses;
import Enums.Suit;
import Enums.Value;

public class Card

{
    //Create Properties of Objects.Card
    // These need to be final since when we create a card,
    // it cant be turned it into a new card
    private final Value cardValue;
    private final Suit cardSuit;

    //Create Constructor with properties as arguments/parameters
    //So when an instance is created the properties/fields are required.
    public Card (Value cardValue, Suit cardSuit)
    {
        this.cardValue = cardValue;
        this.cardSuit = cardSuit;
    }
    //Add Getter for cardValue
    public Value getCardValue()

    {
        return cardValue;
    }

    //Add Getter for cardSuit
    public String getCardSuit()
    {
        return cardSuit.toString();
    }

}
