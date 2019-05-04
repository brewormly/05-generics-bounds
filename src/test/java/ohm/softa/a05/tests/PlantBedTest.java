package ohm.softa.a05.tests;

import ohm.softa.a05.PlantBed;
import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;
import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantColor;
import ohm.softa.a05.model.Shrub;
import ohm.softa.a05.utils.PlantBedUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlantBedTest {
    private final Logger logger = LogManager.getLogger();
    private PlantBed<Plant> asdf;

    @BeforeEach
    void setup() {
        asdf = new PlantBed();
        asdf.add(new Flower(2.0, "TOll", "asf", PlantColor.RED));
        asdf.add(new Flower(2.0, "TOll", "asf", PlantColor.BLUE));
        asdf.add(new Flower(2.0, "TOll", "asf", PlantColor.YELLOW));
        asdf.add(new Flower(2.0, "TOll", "asf", PlantColor.YELLOW));
        asdf.add(new Shrub(2.0, "TOll", "asf", PlantColor.GREEN));
    }

    @Test
    void testAddElements() {
        logger.info("Testing if adding and iterating elements is implemented correctly");
        int counter = 0;
        SimpleList<Plant> filtered =  asdf.getPlantsByColor(PlantColor.YELLOW);
        for (Object o : filtered) {
            counter++;
        }
        assertEquals(filtered.size(), counter);
    }

    @Test
    void testUtility() {
        System.out.println(PlantBedUtility.splitBedByColor(asdf));
    }

}
