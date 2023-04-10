import java.sql.Time;

import org.junit.Test;
import junit.framework.TestCase;
import ua.lviv.iot.algo.part1.lab2.Zoo;



public class TestForZoo 
    extends Zoo
{
    Zoo zoo = new Zoo("Friendly Farms", "Canada", 100, 10, Time.valueOf("11:00:00"), Time.valueOf("16:00:00"), 20);

    // test for method calculateCostPerMonth
    @Test
    public void testCalculateCostPerMonth() {
        TestCase.assertEquals(600, zoo.calculateCostPerMonth());
    }
    
    //test getters
    @Test
    public void testGetters() {
        TestCase.assertEquals("Friendly Farms", zoo.getName());
        TestCase.assertEquals(100.0, zoo.getArea());
        TestCase.assertEquals("Canada", zoo.getLocation());
        TestCase.assertEquals(20, zoo.getCostPerDay());
        TestCase.assertEquals(Time.valueOf("11:00:00"), zoo.getOpeningTime());
        TestCase.assertEquals(Time.valueOf("16:00:00"), zoo.getClosingTime());
        
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

}
