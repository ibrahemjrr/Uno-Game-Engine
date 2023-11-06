package ability;


import card.Card;
import card.CardEffect;

public interface CardAbility {
    CardEffect act(Card card);
}
