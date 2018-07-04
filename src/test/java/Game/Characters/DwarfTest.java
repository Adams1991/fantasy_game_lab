package Game.Characters;

import Game.Room;
import Game.Rooms.JungleRoom;
import Game.Treasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Enemy enemy;
    Cleric cleric;
    JungleRoom room;
    Treasure treasure;


    @Before
    public void before(){
        dwarf = new Dwarf(50, 100, AttackType.AXE);
        enemy = new Enemy(50, "Troll", 100, AttackType.AXE);
        cleric = new Cleric(50, 100, AttackType.AXE);
        treasure = new Treasure("Gem", 100);
        room = new JungleRoom(treasure, enemy);
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

    @Test
    public void canBeHealed(){
        dwarf.beHealed(cleric.potion());
        assertEquals(80, dwarf.getHealthPoints());
    }

    @Test
    public void canCollectFromRoom(){
        dwarf.collectTreasure(room.getTreasure().getValue());
        assertEquals(200, dwarf.getTreasurePot());
    }

    @Test
    public void dwarfCanUseLapidary(){
        dwarf.lapidary(room.getTreasure().getType());
        assertEquals(300, dwarf.getTreasurePot());

    }
}
