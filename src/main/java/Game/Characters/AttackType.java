package Game.Characters;

public enum AttackType {

    SWORD(10),
    AXE(20),
    CLUB(30),
    FIREBALL(30),
    LIGHTING(30),
    DRAGON(30),
    OGRE(30);

    private int value;

    AttackType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int newValue){
        this.value = newValue;
    }


}
