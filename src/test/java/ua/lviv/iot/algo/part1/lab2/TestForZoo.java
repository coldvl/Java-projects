import java.sql.Time;

import org.junit.Test;
import junit.framework.TestCase;
import ua.lviv.iot.algo.part1.lab2.Zoo;



public class TestForZoo 
    extends Zoo
{
    Zoo zoo = new Zoo("Friendly Farms", "Canada", 100, 10, Time.valueOf("11:00:00"), Time.valueOf("16:00:00"), 20);

    @Test
    public void testCalculateCostPerMonth() {
        TestCase.assertEquals(600, zoo.calculateCostPerMonth());
    }
    
    @Test
    public void testIncreaseCapacity() {
        int initialCapacity = zoo.getCapacity();
        int count = 10;
        zoo.increaseCapacity(count);
        int newCapacity = zoo.getCapacity();
        TestCase.assertEquals(initialCapacity + count, newCapacity);
    }

    @Test
    public void testSplitArea() {
        double initialArea = zoo.getArea();
        zoo.splitArea();
        double newArea = zoo.getArea();
        TestCase.assertEquals(initialArea / 2, newArea, 0.001);
    }

    @Test
    public void testAddNewRegion() {
        double initialArea = zoo.getArea();
        double additionalArea = 10.0;
        zoo.addNewRegion(additionalArea);
        double newArea = zoo.getArea();
        TestCase.assertEquals(initialArea + additionalArea, newArea, 0.001);
    }

    @Test
    public void testGetHeaders() {
        TestCase.assertEquals("name, location, area, capacity, openingTime, closingTime, costPerDay", zoo.getHeaders());
    }

    @Test
    public void testToCSV() {
        TestCase.assertEquals("Friendly Farms, Canada, 100.0, 10, 11:00:00, 16:00:00, 20", zoo.toCSV());
    }

}
