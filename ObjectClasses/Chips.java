package ObjectClasses;

import java.util.Scanner;

public class Chips
{
/*
Class contains:
Properties/fields: bet, initialBankRoll, currentBankRoll
Method(s):
 */
    private final Scanner scanner = new Scanner(System.in);

    int bet;
    int initialBankRoll = 100;
    int currentBankRoll = initialBankRoll;
    int betResponse;

    public void setBet()
    {
        //Print to console informing player how much money they have and asking how much they would like to bet
        //Take in an int (bet amount) then figure out how to set bet variable to that.
        System.out.println("Your Bankroll is " + currentBankRoll + ". How much would you like to bet?");

        betResponse = scanner.nextInt();
        bet = betResponse;
        System.out.println("Your bet is " + bet);
    }

    //Explore bankroll changes when player busts
    public void playerBust()
    {
        currentBankRoll -= bet;
        System.out.println("You have busted! Your new bankroll is " + currentBankRoll);
    }

}
