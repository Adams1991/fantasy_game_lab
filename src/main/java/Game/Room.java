package Game;

import Game.Characters.Enemy;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Room {

    private Treasure treasure;
    private Enemy enemy;

    public Room(Treasure treasure, Enemy enemy){
        this.treasure = treasure;
        this.enemy = enemy;
    }


    public Treasure getTreasure() {
        return this.treasure;
    }

    public Enemy getEnemy() {
        return this.enemy;
    }
}
