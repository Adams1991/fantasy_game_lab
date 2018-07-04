package Game;

import Game.Characters.AttackType;
import Game.Characters.Cleric;
import Game.Characters.Dwarf;
import Game.Characters.Enemy;
import Game.Rooms.JungleRoom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GameTest {

    Game game;
    Treasure treasure;
    Treasure treasure2;
    Enemy enemy;
    Enemy enemy2;
    JungleRoom room;
    JungleRoom room2;
    ArrayList<Room> rooms;
    ArrayList<GameCharacter> characters;
    Dwarf dwarf;

    @Before
    public void before() {
        dwarf = new Dwarf(50, 100, AttackType.AXE);
        enemy = new Enemy(50, "Troll", 100, AttackType.CLUB);
        enemy2 = new Enemy(50, "Dragon", 100, AttackType.FIREBALL);
        treasure = new Treasure("Gem", 100);
        treasure2 = new Treasure("Gold", 150);
        room = new JungleRoom(treasure, enemy);
        room2 = new JungleRoom(treasure2, enemy2);
        rooms = new ArrayList<>();
        characters = new ArrayList<>();
        game = new Game(rooms, characters);
    }

    @Test
    public void canAddCharacter(){
        game.addCharacter(dwarf);
        assertEquals(1,  game.getCharacterArraySize());
    }

    @Test
    public void canAddRoom(){
        game.addRoom(room);
        assertEquals(1,  game.getRoomArraySize());
    }

    @Test
    public void canGetFirstRoom(){
        game.addRoom(room);
        game.addCharacter(dwarf);
        assertEquals(room, game.getRoom());
    }

    @Test
    public void canGetCharacter(){
        game.addCharacter(dwarf);
        assertEquals(dwarf, game.getCharacter());
    }



    @Test
    public void canCauseDamageBothWays(){
        game.addRoom(room);
        game.addCharacter(dwarf);
        game.canHurtEnemy();
        game.canBeHurt();
        assertEquals(30, enemy.getHealthPoints());
        assertEquals(20, dwarf.getHealthPoints());
    }

    @Test
    public void canOnlyCollectTreasureWhenEnemyDeadOrWillGetAttacked___dead(){
        game.addRoom(room);
        game.addCharacter(dwarf);
        game.getRoom().getEnemy().setHealthPoints(0);
        game.collectTreasure();
        assertEquals(0, game.getRoom().getTreasure().getValue());
        assertEquals(200, game.getCharacter().getTreasurePot());
        assertEquals(50, dwarf.getHealthPoints());
    }

    @Test
    public void canOnlyCollectTreasureWhenEnemyDeadOrWillGetAttacked___alive(){
        game.addRoom(room);
        game.addCharacter(dwarf);
        game.collectTreasure();
        assertEquals(100, game.getRoom().getTreasure().getValue());
        assertEquals(100, game.getCharacter().getTreasurePot());
        assertEquals(20, dwarf.getHealthPoints());
    }

    @Test
    public void canMoveRoomOnceComplete(){
        game.addRoom(room);
        game.addRoom(room2);
        game.addCharacter(dwarf);
        game.getRoom().getTreasure().emptyTreasure();
        game.getRoom().getEnemy().setHealthPoints(0);
        game.moveToNextRoom();
        assertEquals(room2, game.getRoom());
    }


}