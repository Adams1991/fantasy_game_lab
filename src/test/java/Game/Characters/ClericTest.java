package Game.Characters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClericTest {

    Cleric cleric;
    Enemy enemy;

    @Before
    public void before(){
        cleric = new Cleric(100);
        enemy = new Enemy(100, "Ogre");
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

    @Test
    public void healReturnsHealthPoints(){
        assertEquals(30, cleric.potion());
        assertEquals(20, cleric.herbs());
    }

    @Test
    public void canBeAttacked(){
        cleric.beAttacked(enemy.Sword());
        assertEquals(90, cleric.getHealthPoints());

    }
}