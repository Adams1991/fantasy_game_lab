package Game.Characters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnemyTest {

    Enemy enemy;
    Dwarf dwarf;

    @Before
    public void before(){
        enemy = new Enemy(100, "Troll", 100);
        dwarf = new Dwarf(100, 100);
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


    @Test
    public void weaponReturnsHitPoints(){
        assertEquals(20, enemy.Axe());
        assertEquals(30, enemy.Club());
        assertEquals(10, enemy.Sword());
    }

    @Test
    public void canBeAttacked(){
        enemy.beAttacked(dwarf.Axe());
        assertEquals(70,enemy.getHealthPoints());

    }
}