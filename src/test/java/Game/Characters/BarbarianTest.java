package Game.Characters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {


    Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian(100);
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(100, barbarian.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints(){
        barbarian.setHealthPoints(40);
        assertEquals(40, barbarian.getHealthPoints());
    }
}
