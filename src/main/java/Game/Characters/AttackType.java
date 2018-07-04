package Game.Characters;

public enum AttackType {

    SWORD(10),
    AXE(20),
    CLUB(30),
    FIREBALL(30),
    LIGHTING(30);

    private final int value;

    AttackType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


}
