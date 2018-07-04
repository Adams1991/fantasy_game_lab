package Game;

import Game.Behaviours.IWeapon;

public abstract class GameCharacter {

        private int healthPoints;
        private int treasurePot;

        public GameCharacter(int healthPoints, int treasurePot){
            this.healthPoints = healthPoints;
            this.treasurePot = treasurePot;
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

        public void collectTreasure(int treasureInRoom){
            this.treasurePot += treasureInRoom;
        }

        public int getTreasurePot() {
            return this.treasurePot;
        }


}


