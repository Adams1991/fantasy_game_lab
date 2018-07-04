package Game.Characters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarlockTest {
   
    Warlock warlock;

    @Before
    public void before(){
        warlock = new Warlock(100, 100, AttackType.AXE);
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(100, warlock.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints(){
        warlock.setHealthPoints(40);
        assertEquals(40, warlock.getHealthPoints());
    }


    @Test
    public void spellReturnsHitPoints(){
        assertEquals(20, warlock.fireball());
        assertEquals(30, warlock.lightningStrike());
    }

    @Test
    public void creatureReturnsHitPoints(){
        assertEquals(20, warlock.ogre());
        assertEquals(30, warlock.dragon());
    }
}