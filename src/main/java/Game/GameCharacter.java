package Game;

public abstract class GameCharacter {

        private int healthPoints;

        public GameCharacter(int healthPoints){
            this.healthPoints = healthPoints;
        }


        public int getHealthPoints(){
            return this.healthPoints;
        }

        public void setHealthPoints(int i) {
            this.healthPoints = i;
        }


        public void beAttacked(int weaponUsed){
       this.healthPoints -= weaponUsed;
        }

    public void beHealed(int toolUsed){
        this.healthPoints += toolUsed;
        }

}


