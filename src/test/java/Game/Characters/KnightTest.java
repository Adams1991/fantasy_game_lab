package Game.Characters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KnightTest {

    Knight knight;
    Wizard wizard;

    @Before
    public void before(){
        knight = new Knight(100);
        wizard = new Wizard(100);
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(100, knight.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints(){
        knight.setHealthPoints(40);
        assertEquals(40, knight.getHealthPoints());
    }

    @Test
    public void weaponReturnsHitPoints(){
        assertEquals(20, knight.Axe());
        assertEquals(10, knight.Club());
        assertEquals(30, knight.Sword());
    }

    @Test
    public void canBeAttackedBySpell(){
        knight.beAttacked(wizard.fireball());
        assertEquals(70, knight.getHealthPoints());
    }

}