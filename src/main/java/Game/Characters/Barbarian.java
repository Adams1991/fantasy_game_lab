package Game.Characters;

import Game.Behaviours.IWeapon;
import Game.Fighter;

public class Barbarian extends Fighter implements IWeapon {
    public Barbarian(int healthPoints, int treasurePot) {
        super(healthPoints, treasurePot);
    }

    @Override
    public int Sword() {
        return 20;
    }

    @Override
    public int Axe() {
        return 10;
    }

    @Override
    public int Club() {
        return 30;
    }
}
