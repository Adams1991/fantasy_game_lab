package Game.Characters;

import Game.Behaviours.IWeapon;
import Game.GameCharacter;

public class Enemy extends GameCharacter implements IWeapon {

    private String name;

    public Enemy(int healthPoints, String name) {
        super(healthPoints);
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int Sword() {
        return 10;
    }

    @Override
    public int Axe() {
        return 20;
    }

    @Override
    public int Club() {
        return 30;
    }
}
