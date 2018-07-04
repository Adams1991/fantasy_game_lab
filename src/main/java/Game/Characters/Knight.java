package Game.Characters;

import Game.Behaviours.IWeapon;
import Game.GameCharacter;

public class Knight extends GameCharacter implements IWeapon {
    public Knight(int healthPoints, int treasurePot, AttackType attackType) {
        super(healthPoints, treasurePot, attackType);
    }

    @Override
    public int Sword() {
        return 30;
    }

    @Override
    public int Axe() {
        return 20;
    }

    @Override
    public int Club() {
        return 10;
    }

//    public void armour(){
//        getHealthPoints() += 10;
//    }
}
