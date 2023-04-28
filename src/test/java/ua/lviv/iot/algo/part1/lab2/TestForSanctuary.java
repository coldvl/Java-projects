package ua.lviv.iot.algo.part1.lab2;

import junit.framework.TestCase;
import org.junit.Test;
import ua.lviv.iot.algo.part1.lab2.models.Sanctuary;



public class TestForSanctuary 
    extends Sanctuary
{
    Sanctuary sanctuary = new Sanctuary("Friendly Farms", "Canada", 100, 10, 20, 10, 20);

    
    @Test
    public void testCalculateCostPerMonth() {
        TestCase.assertEquals(12000, sanctuary.calculateCostPerMonth());
    }

    @Test
    public void testGetHeaders() {
        TestCase.assertEquals("name, location, area,numberOfEndangeredAnimals,numberOfAnimals,costPerDayPerAnimal,costPerDayPerEndangeredAnimal", sanctuary.getHeaders());
    }

    @Test
    public void testToCSV() {
        TestCase.assertEquals("Friendly Farms, Canada, 100.0,10,20,10,20", sanctuary.toCSV());
    }
    
}
