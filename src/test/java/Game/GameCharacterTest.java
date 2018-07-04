package Game;

import Game.Characters.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameCharacterTest {

    Dwarf dwarf;

    @Before
    public void setUp() {
       dwarf = new Dwarf(100, 199);
    }


}