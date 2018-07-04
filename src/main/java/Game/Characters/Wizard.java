package Game.Characters;

import Game.Behaviours.ISpell;
import Game.Spellcaster;

public class Wizard extends Spellcaster implements ISpell {
    public Wizard(int healthPoints) {
        super(healthPoints);
    }

    @Override
    public int fireball() {
        return 30;
    }

    @Override
    public int lightningStrike() {
        return 20;
    }
}
