package ObjectClasses;
import java.util.ArrayList;
import java.util.List;

public class Hand
//This can wait for refactor, hand details will first go into Dealer/Player
{
/*
Class contains:
Properties/fields: cardsInHand(list), currentScore(int)
Method(s): addCard, getCards, getScore, showHand, calculateScore
 */

    //possible arraylist of cards
    private List<Card> cardsInHand = new ArrayList<>();

    private int currentScore = 0;

    //METHODS
    public void addCard(Deck deck)
    {
        cardsInHand.add(deck.pullnextcard());
    }

    //important note: returns list does not display.
    public List<Card> getCards()
    {
        return new ArrayList<>(cardsInHand);
    }

    public int getScore()
    {
        return currentScore;
    }

    //Loop through the cards in the list and print them properly formatted.
    public void showFullHand()
    {
        for (int i=0; i<cardsInHand.size();i++)
        {
            String cardOutput = cardsInHand.get(i).getCardValue() + " of " + cardsInHand.get(i).getCardSuit();
            System.out.println(cardOutput);
        }

    }
    //Show initial dealer hand (hides second card)
    public void showInitialDealerHand()
    {
        String cardOutput = cardsInHand.get(0).getCardValue() + " of " + cardsInHand.get(0).getCardSuit();
        System.out.println(cardOutput);

    }

    //Print score
    public void showScore(String userTitle)
    {
        calculateScore();
        System.out.println(userTitle + " current score is " + currentScore);
        System.out.println();
    }

    //(calculate score)
    // Add the values of cards in hand(list) and Set currentScore to that value.
    // If greater than 21 declare bust
    public void calculateScore()
    {
        //Create runningScore and prepare for Ace.
        int runningScore = 0;
        boolean hasAce = false;

        //Loop through each index in the list. Use cardvalues!
        //for loop goes through each card in the hand
       for (int i=0; i<cardsInHand.size();i++)
       {
           //Create a switch to go through each possible value of a card. Detailing out each cards value!
           //Figure out the Ace last!
           switch (cardsInHand.get(i).getCardValue())
           {
               case King:
               case Queen:
               case Jack:
               case Ten:
                   runningScore += 10;
                   break;
               case Nine:
                   runningScore += 9;
                   break;
               case Eight:
                   runningScore += 8;
                   break;
               case Seven:
                   runningScore += 7;
                   break;
               case Six:
                   runningScore += 6;
                   break;
               case Five:
                   runningScore += 5;
                   break;
               case Four:
                   runningScore += 4;
                   break;
               case Three:
                   runningScore += 3;
                   break;
               case Two:
                   runningScore += 2;
                   break;
               case Ace:
                   runningScore += 1;
                   hasAce = true;
                   break;
           } //end switch.
       } //end for loop.

       //Still inside the method but outside the for loop
       //Above ace = 1, below apparently if() is like ==
       if(hasAce) //This has to be outside the forloop so that it is after all other cards have been calculated.
       {
            //Check if adding 10 would NOT bust.
           if (runningScore<12)
           {
               //turn one Ace into an 11 by adding 10 (to the 1).
               runningScore += 10;
           }
       }

       //Create link between current and running score
       currentScore = runningScore;
    }

    //create hit method that adds a card from the deck to the list.
    public void hit(Deck draw, String userTitle)
    {
        addCard(draw);
        showFullHand();
        showScore(userTitle);
    }

}
