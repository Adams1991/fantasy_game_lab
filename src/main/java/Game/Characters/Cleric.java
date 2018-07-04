package Game.Characters;

import Game.Behaviours.IHeal;
import Game.GameCharacter;

public class Cleric extends GameCharacter implements IHeal {

    public Cleric(int healthPoints) {
        super(healthPoints);
    }

    @Override
    public int potion() {
        return 30;
    }

    @Override
    public int herbs() {
        return 20;
    }
}
