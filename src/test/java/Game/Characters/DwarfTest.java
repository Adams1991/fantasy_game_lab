package Game.Characters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void before(){
        dwarf = new Dwarf(50);
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(50, dwarf.gethealthPoints());
    }
}
