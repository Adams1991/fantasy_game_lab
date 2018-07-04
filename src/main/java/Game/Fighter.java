package Game;

import Game.Behaviours.IWeapon;

public abstract class Fighter extends GameCharacter {


    public Fighter(int healthPoints) {
        super(healthPoints);
    }

//    public void beAttacked(int weaponUsed){
//        super.setHealthPoints(super.getHealthPoints() -= weaponUsed);
//    }


}
