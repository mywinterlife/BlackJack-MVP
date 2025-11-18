package ObjectClasses;

import java.util.Scanner;

public class Player
{
/*
Class contains:
Properties/fields: bet, playerHand Hand, scanner Scanner()
Method(s): dealPlayerHand ,showPlayerHand , playerOptions
 */


    Chips bet = new Chips();

    private final Scanner scanner = new Scanner(System.in);

    //Create new hand object for Player
    Hand playerHand = new Hand();

    // Take in bet for player
    public void setBet()
    {
        bet.setBet();
    }

    //initialize with values
    public void dealPlayerHand(Deck draw)
    {
        playerHand.addCard(draw);
        playerHand.addCard(draw);
    }

    public void showPlayerHand()
    {
        System.out.println("Your current hand is:");
        playerHand.showFullHand();
        playerHand.showScore("Player");
    }
    //Create player options to hit/stand
    public void playerOptions(Deck draw)
    {
        System.out.println("Would you like to Stand(s) or Hit(h)?");

        String response = scanner.nextLine();
        if (response.contains("h"))
        {
            playerHand.hit(draw, "Player");
            if (playerHand.getScore()>21)
            {
                System.out.println("Your current score is BUST");
            }
            else
            {
                playerOptions(draw);
            }

        }

        // Explore Stand options
        else if (response.contains("s"))
        {
            playerHand.showScore("Player");
        }

        // accept only h/s or go back to player options.
        else
        {
            playerOptions(draw);
        }
    }

}
