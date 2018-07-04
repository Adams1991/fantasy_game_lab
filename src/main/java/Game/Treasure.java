package Game;

public class Treasure {

    private String type;
    private int value;

    public Treasure(String type, int value){
        this.type = type;
        this.value = value;
    }


    public String getType() {
        return this.type;
    }

    public int getValue() {
        return this.value;
    }

    public void emptyTreasure() {
        this.value = 0;
    }
}
