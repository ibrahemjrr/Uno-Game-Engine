package ability;


import card.Card;
import card.CardEffect;

import java.util.Scanner;

public class ChaneColorAbility implements CardAbility {


    @Override
    public CardEffect act(Card card) {
        CardEffect cardEffect = new CardEffect();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter color to change: type (Red, Blue, Yellow, Green) ");
        String clr = scan.next();
        cardEffect.setColor(clr);
        return cardEffect;

    }
}
