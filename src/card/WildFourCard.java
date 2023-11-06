package card;

import ability.ChaneColorAbility;
import ability.DrawCardsAbility;

public class WildFourCard extends Card {
    public WildFourCard(String color, String value, int score) {
        super(color, value, score);
        setAbility(new ChaneColorAbility());
        setAbility(new DrawCardsAbility());
    }

    @Override
    public String toString() {
        return "wildFourCard(" + super.toString() + ")";
    }


}