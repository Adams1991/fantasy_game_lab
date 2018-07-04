package Game;

public abstract class Character {
    
    private int healthPoints;
    
    public Character(int healthPoints){
        this.healthPoints = healthPoints;
    }


    public int getHealthPoints(){
        return this.healthPoints;
    }

    public void setHealthPoints(int i) {
        this.healthPoints = i;
    }
}
