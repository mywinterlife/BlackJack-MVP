package ExecuableClasses;
import ObjectClasses.Dealer;
import ObjectClasses.Deck;
import ObjectClasses.Player;

public class main
{
/*
Class contains:
Properties/fields: deck(list)
Method(s): setDeck, shuffleDeck, swapCards
 */
    public static void main(String[] args)
    {
        //Declaration and instantiation of the Deck OBJECT.(draw)
        Deck draw = new Deck();

        //setDeck initializes by setting the values in the list.
        draw.setDeck();
        draw.shuffleDeck();

        // Declaration/Instantiation of Player (object).
        Player player1 = new Player();
        player1.setBet();
        player1.dealPlayerHand(draw);

        //showPlayer1Hand
        player1.showPlayerHand();

        // Declaration/Instantiation of Dealer (object).
        Dealer dealer = new Dealer();
        dealer.dealDealerHand(draw);
        dealer.showInitialDealerHand();

        //Show player options
        player1.playerOptions(draw);
        dealer.playDealerHand();

    }

}
