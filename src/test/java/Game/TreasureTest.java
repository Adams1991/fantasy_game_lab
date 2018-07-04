package Game;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreasureTest {

    Treasure treasure;

    @Before
    public void before(){
        treasure = new Treasure("Gold", 100);
    }

    @Test
    public void canGetType(){
        assertEquals("Gold", treasure.getType());
    }

    @Test
    public void canGetValue() {
        assertEquals(100, treasure.getValue());
    }


}