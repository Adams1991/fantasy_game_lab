package Game.Characters;

import Game.Behaviours.IWeapon;
import Game.GameCharacter;

public class Dwarf extends GameCharacter implements IWeapon {

    public Dwarf(int healthPoints, int treasurePot, AttackType attackType) {
        super(healthPoints, treasurePot, attackType);
    }

    @Override
    public int Sword() {
        return 10;
    }

    @Override
    public int Axe() {
        return 30;
    }

    @Override
    public int Club() {
        return 20;
    }


    public void lapidary(String type) {
        int doublePot = 0;
        if (type == "Gem" || type == "Gold"){
            doublePot = super.getTreasurePot() * 2;
        }
        super.collectTreasure(doublePot);
    }
}
