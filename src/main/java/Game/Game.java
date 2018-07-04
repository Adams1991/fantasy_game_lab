package Game;

import Game.Characters.Dwarf;
import Game.Characters.Enemy;
import Game.Rooms.JungleRoom;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Game {

    private ArrayList<Room> rooms;
    private ArrayList<GameCharacter> characters;

    public Game(ArrayList<Room> rooms, ArrayList<GameCharacter> characters){
        this.rooms = rooms;
        this.characters = characters;
    }


    public int getCharacterArraySize() {
        return this.characters.size();
    }

    public void addCharacter(GameCharacter character) {
        this.characters.add(character);
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public int getRoomArraySize() {
        return this.rooms.size();
    }


    public Room getFirstRoom() {
        return this.rooms.get(0);
    }

    public GameCharacter getCharacter() {
        return this.characters.get(0);
    }


    public void canHurtEnemy() {
        getFirstRoom().getEnemy().beAttacked(getCharacter().getAttackType().getValue());
    }



}
