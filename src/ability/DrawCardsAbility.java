package ability;


import card.Card;
import card.CardEffect;

public class DrawCardsAbility implements CardAbility {


    @Override
    public CardEffect act(Card card) {
        CardEffect cardEffect = new CardEffect();
        if (card.getColor().equals("Wild")) {
            cardEffect.setNumOfDraws(4);
        } else cardEffect.setNumOfDraws(2);

        return cardEffect;
    }
}
