import java.sql.Time;

import org.junit.Test;
import junit.framework.TestCase;
import ua.lviv.iot.algo.part1.lab2.AnimalHomeManager;
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
    public void testAddNewRegion() {
        double initialArea = 1000;
        double newArea = 500;
        this.zoo.addNewRegion(newArea);
        double expectedArea = initialArea + newArea;
        double actualArea = animalHome.getArea();
        assertEquals(expectedArea, actualArea, 0.01);
    }
}
