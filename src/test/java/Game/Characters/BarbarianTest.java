package Game.Characters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {


    Barbarian barbarian;
    Enemy enemy;

    @Before
    public void before(){
        barbarian = new Barbarian(100);
        enemy = new Enemy(100, "Troll");
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

    @Test
    public void weaponReturnsHitPoints(){
        assertEquals(10, barbarian.Axe());
        assertEquals(30, barbarian.Club());
        assertEquals(20, barbarian.Sword());
    }

    @Test
    public void canBeAttacked(){
        barbarian.beAttacked(enemy.Axe());
        assertEquals(80,barbarian.getHealthPoints());

    }
}
