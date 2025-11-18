package ObjectClasses;

public class Dealer
{
/*
Class contains:
Properties/fields: dealerHand
Method(s): dealDealerHand, showInitialDealerHand ,showDealerHand
 */
    //Create dealer hand object (empty)
    Hand dealerHand = new Hand();


    public void dealDealerHand(Deck draw)
    {
        dealerHand.addCard(draw);
        dealerHand.addCard(draw);
    }

    //Show and print dealers hand with the second card face down
    //Options here...Create method in hand class to call, or could I add a faceup/facedown bool in card....
    public void showInitialDealerHand()
    {
        System.out.println("The Dealers hand shows:");
        dealerHand.showInitialDealerHand();
        System.out.println("The Dealers second card is face down:");
        System.out.println(); //LineBreak
    }

    public void showFullDealerHand()
    {
        System.out.println("The Dealers hand is:");
        dealerHand.showFullHand();
    }

    public void playDealerHand()
    {
        showFullDealerHand();
        dealerHand.showScore("Dealer's");
    }

    public void showDealerScore()
    {

    }

}
