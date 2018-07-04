package Game.Characters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before(){
        wizard = new Wizard(100);
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(100, wizard.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints(){
        wizard.setHealthPoints(40);
        assertEquals(40, wizard.getHealthPoints());
    }


    @Test
    public void spellReturnsHitPoints(){
        assertEquals(30, wizard.fireball());
        assertEquals(20, wizard.lightningStrike());
    }

    @Test
    public void creatureReturnsHitPoints(){
        assertEquals(30, wizard.ogre());
        assertEquals(20, wizard.dragon());
    }
}