package ua.lviv.iot.algo.part1.lab2;

import org.junit.Test;
import ua.lviv.iot.algo.part1.lab2.models.AbstractAnimalHome;
import ua.lviv.iot.algo.part1.lab2.models.Aquarium;
import ua.lviv.iot.algo.part1.lab2.models.Zoo;
import ua.lviv.iot.algo.part1.lab2.utils.AnimalHomeToCSV;

import org.junit.Before;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestForAnimalHomeToCSV extends AnimalHomeToCSV{
    private List<AbstractAnimalHome> homes;
    private String filename;

    @Before
    public void setUp() {
        homes = new ArrayList<>();
        // Add some test data to homes
        homes.add(new Zoo("Friendly Farms", "Canada", 100, 10, Time.valueOf("11:00:00"), Time.valueOf("16:00:00"), 20));
        homes.add(new Aquarium("Aquarium of the Pacific", "USA", 100, 10, 10, 10));
        filename = "test.csv";
    }

    @Test
    public void testWriteToFile() throws IOException {
        AnimalHomeToCSV.writeToFile(homes, filename);
        List<String> actualLines = Files.readAllLines(Paths.get(filename));
        List<String> expectedLines = Files.readAllLines(Paths.get("expected.csv"));
        assertEquals(expectedLines.size(), actualLines.size());
        for (int i = 0; i < expectedLines.size(); i++) {
            assertEquals(expectedLines.get(i), actualLines.get(i));
        }
    }
}