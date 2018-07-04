package Game.Characters;

import Game.Behaviours.IWeapon;
import Game.GameCharacter;


public class Barbarian extends GameCharacter implements IWeapon {




    public Barbarian(int healthPoints, int treasurePot, AttackType attackType) {
        super(healthPoints, treasurePot, attackType);
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
