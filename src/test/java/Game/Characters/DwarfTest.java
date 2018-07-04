package Game.Characters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Enemy enemy;

    @Before
    public void before(){
        dwarf = new Dwarf(50);
        enemy = new Enemy(50, "Troll");
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(50, dwarf.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints(){
        dwarf.setHealthPoints(40);
        assertEquals(40, dwarf.getHealthPoints());
    }

    @Test
    public void weaponReturnsHitPoints(){
        assertEquals(30, dwarf.Axe());
        assertEquals(20, dwarf.Club());
        assertEquals(10, dwarf.Sword());
    }

    @Test
    public void canBeAttacked(){
        dwarf.beAttacked(enemy.Axe());
        assertEquals(30,dwarf.getHealthPoints());

    }
}
