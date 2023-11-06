package ability;


import card.Card;
import card.CardEffect;

public class ReverseAbility implements CardAbility {


    @Override
    public CardEffect act(Card card) {
        CardEffect cardEffect = new CardEffect();
        cardEffect.setReversible(true);
        return cardEffect;

    }
}
