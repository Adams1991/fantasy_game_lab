package Game.Characters;

import Game.Behaviours.ICreature;
import Game.Behaviours.ISpell;
import Game.GameCharacter;

public class Warlock extends GameCharacter implements ISpell, ICreature {
    public Warlock(int healthPoints, int treasurePot, AttackType attackType) {
        super(healthPoints, treasurePot, attackType);
    }



    @Override
    public int ogre() {
        return 20;
    }

    @Override
    public int dragon() {
        return 30;
    }

    @Override
    public int ifAttackTypeIsSpellThenDouble() {
        int attackType = 0;
        if (super.getAttackType() == AttackType.FIREBALL || super.getAttackType() == AttackType.LIGHTING) {
           attackType = super.getAttackType().getValue() * 2;
        } else {
            attackType= super.getAttackType().getValue();
        }
        return attackType;
    }
}
