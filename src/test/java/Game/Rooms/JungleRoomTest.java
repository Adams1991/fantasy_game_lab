package Game.Rooms;

import Game.Characters.Enemy;
import Game.Treasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JungleRoomTest {

    JungleRoom jungleRoom;
    Treasure treasure;
    Enemy enemy;

    @Before
    public void before()  {
        enemy = new Enemy(100, "Lion", 100);
        treasure = new Treasure("Gems", 100);
        jungleRoom = new JungleRoom(treasure, enemy);
    }

    @Test
    public void canGetTreasure(){
        assertEquals(treasure, jungleRoom.getTreasure());
    }

    @Test
    public void canGetEnemy(){
        assertEquals(enemy, jungleRoom.getEnemy());
    }

}