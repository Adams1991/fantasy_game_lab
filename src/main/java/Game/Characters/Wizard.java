package Game.Characters;

import Game.Behaviours.ICreature;
import Game.Behaviours.ISpell;
import Game.Behaviours.IWeapon;
import Game.Spellcaster;

public class Wizard extends Spellcaster implements ISpell, ICreature {
    public Wizard(int healthPoints, int treasurePot) {
        super(healthPoints, treasurePot);
    }

    @Override
    public int fireball() {
        return 30;
    }

    @Override
    public int lightningStrike() {
        return 20;
    }

    @Override
    public int ogre() {
        return 30;
    }

    @Override
    public int dragon() {
        return 20;
    }
}
