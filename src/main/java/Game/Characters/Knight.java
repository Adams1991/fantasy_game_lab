package Game.Characters;

import Game.Behaviours.IWeapon;
import Game.Fighter;

public class Knight extends Fighter implements IWeapon {
    public Knight(int healthPoints) {
        super(healthPoints);
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
