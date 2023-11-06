package ability;

import card.Card;
import card.CardEffect;

public class SkipPlayerAbility implements CardAbility {

    @Override
    public CardEffect act(Card card) {
        CardEffect cardEffect = new CardEffect();
        cardEffect.setSkippable(true);
        return cardEffect;
    }
}
