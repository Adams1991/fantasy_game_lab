package Game;

public abstract class Character {
    
    private int healthPoints;
    
    public Character(int healthPoints){
        this.healthPoints = healthPoints;
    }


    public int gethealthPoints(){
        return this.healthPoints;
    }
}
