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

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public Room getRoom() {
        return this.rooms.get(0);
    }

    public GameCharacter getCharacter() {
        return this.characters.get(0);
    }


    public void canHurtEnemy() {
        getRoom().getEnemy().beAttacked(getCharacter().getAttackType().getValue());
    }


    public void canBeHurt() {
        getCharacter().beAttacked(getRoom().getEnemy().getAttackType().getValue());
    }

    public void collectTreasure() {
        if (getRoom().getEnemy().getHealthPoints() == 0){
            getCharacter().collectTreasure(getRoom().getTreasure().getValue());
            getRoom().getTreasure().emptyTreasure();
        }else{
        getCharacter().beAttacked(getRoom().getEnemy().getAttackType().getValue());}
    }


    public void moveToNextRoom() {
        if (getRoom().getEnemy().getHealthPoints() == 0 && getRoom().getTreasure().getValue() == 0){
            getRooms().remove(0);
        } else {
            getCharacter().beAttacked(getRoom().getEnemy().getAttackType().getValue());}
        }

}
