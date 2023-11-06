package ability;

import card.Card;
import card.CardEffect;

public class NoAbility implements CardAbility {


    @Override
    public CardEffect act(Card card) {
        return new CardEffect();
    }
}
