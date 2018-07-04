package Game.Characters;

import Game.Behaviours.ISpell;
import Game.Spellcaster;

public class Warlock extends Spellcaster implements ISpell {
    public Warlock(int healthPoints) {
        super(healthPoints);
    }

    @Override
    public int fireball() {
        return 20;
    }

    @Override
    public int lightningStrike() {
        return 30;
    }
}
