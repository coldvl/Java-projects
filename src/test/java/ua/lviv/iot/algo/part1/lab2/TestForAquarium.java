package ua.lviv.iot.algo.part1.lab2;


import org.junit.Test;
import junit.framework.TestCase;
import ua.lviv.iot.algo.part1.lab2.models.Aquarium;


public class TestForAquarium
    extends Aquarium
{
    
    Aquarium aquarium = new Aquarium("Aquarium of the Pacific", "USA", 100, 10, 10, 10);
    @Test
    public void testCalculateCostPerMonth() {
        TestCase.assertEquals(30000, aquarium.calculateCostPerMonth());
    }

    @Test
    public void testGetHeaders() {
        TestCase.assertEquals("name, location, area,costPerDayPerFish,numberOfFishInOneAquarium,numberOfAquariums", aquarium.getHeaders());
    }

    @Test
    public void testToCSV() {
        TestCase.assertEquals("Aquarium of the Pacific, USA, 100.0,10,10,10", aquarium.toCSV());
    }
    
}