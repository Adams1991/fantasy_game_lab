package Game;

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
    Enemy enemy;
    JungleRoom room;
    ArrayList<Room> rooms;
    ArrayList<GameCharacter> characters;
    Dwarf dwarf;

    @Before
    public void before() {
        dwarf = new Dwarf(50, 100);
        enemy = new Enemy(50, "Troll", 100);
        treasure = new Treasure("Gem", 100);
        room = new JungleRoom(treasure, enemy);
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
        assertEquals(room, game.getFirstRoom());
    }

    @Test
    public void canGetCharacter(){
        game.addCharacter(dwarf);
        assertEquals(dwarf, game.getCharacter());
    }

//    @Test
//    public void canPlay(){
//        game.addRoom(room);
//        game.addCharacter(dwarf);
//        game.canHurtEnemy();
//        assertEquals(40, enemy.getHealthPoints());
//    }
}