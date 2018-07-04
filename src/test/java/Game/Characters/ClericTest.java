package Game.Characters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClericTest {

    Cleric cleric;

    @Before
    public void before(){
        cleric = new Cleric(100);
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(100, cleric.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints(){
        cleric.setHealthPoints(40);
        assertEquals(40, cleric.getHealthPoints());
    }
}