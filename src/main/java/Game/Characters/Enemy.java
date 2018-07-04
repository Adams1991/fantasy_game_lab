package Game.Characters;

import Game.GameCharacter;

public class Enemy extends GameCharacter {

    private String name;

    public Enemy(int healthPoints, String name) {
        super(healthPoints);
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
