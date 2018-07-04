package Game.Characters;

import Game.Behaviours.ICreature;
import Game.Behaviours.ISpell;
import Game.GameCharacter;

public class Wizard extends GameCharacter implements ISpell, ICreature {
    public Wizard(int healthPoints, int treasurePot, AttackType attackType) {
        super(healthPoints, treasurePot, attackType);
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
