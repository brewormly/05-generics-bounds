package ohm.softa.a05.tests.model;

import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.PlantColor;
import ohm.softa.a05.model.Shrub;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlantTest {

    private final Logger logger = LogManager.getLogger();

    @Test
    void testCreateFalsePlant(){
        assertThrows(IllegalArgumentException.class, () -> new Flower(2.0, "TOll", "asf", PlantColor.GREEN));
        assertThrows(IllegalArgumentException.class, () -> new Shrub(2.0, "TOll", "asf", PlantColor.RED));
    }
    @Test
    void testCreatePlant(){
        new Shrub(2.0, "TOll", "asf", PlantColor.GREEN);
        new Flower(2.0, "TOll", "asf", PlantColor.RED);
    }

    @Test
    void testEqualsPlant(){
        assertTrue(new Shrub(2.0, "TOll", "asf", PlantColor.GREEN).equals(new Shrub(2.0, "TOll", "asf", PlantColor.GREEN)));
        assertFalse(new Shrub(2.0, "asdf", "asf", PlantColor.GREEN).equals(new Shrub(2.0, "TOll", "asf", PlantColor.GREEN)));
    }
}
