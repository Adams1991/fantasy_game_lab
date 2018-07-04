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
    }

