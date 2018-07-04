package Game.Characters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnemyTest {

    Enemy enemy;

    @Before
    public void before(){
        enemy = new Enemy(100, "Troll");
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(100, enemy.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints(){
        enemy.setHealthPoints(40);
        assertEquals(40, enemy.getHealthPoints());
    }

    @Test
    public void canGetName(){
        assertEquals("Troll", enemy.getName());
    }

    @Test
    public void canSetName(){
        enemy.setName("Ogre");
        assertEquals("Ogre", enemy.getName());

    }

}