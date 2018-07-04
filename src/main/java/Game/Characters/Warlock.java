package Game.Characters;

import Game.Behaviours.ICreature;
import Game.Behaviours.ISpell;
import Game.Spellcaster;

public class Warlock extends Spellcaster implements ISpell, ICreature {
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

    @Override
    public int ogre() {
        return 20;
    }

    @Override
    public int dragon() {
        return 30;
    }
}
