import org.junit.Test;
import junit.framework.TestCase;
import ua.lviv.iot.algo.part1.lab2.Aquarium;



public class TestForAquarium 
    extends Aquarium
{
    
    Aquarium aquarium = new Aquarium("Aquarium of the Pacific", "USA", 100, 10, 10, 10);
    // test for method calculateCostPerMonth
    @Test
    public void testCalculateCostPerMonth() {
        TestCase.assertEquals(30000, aquarium.calculateCostPerMonth());
    }

    //test getters
    @Test
    public void testGetters() {
        TestCase.assertEquals("Aquarium of the Pacific", aquarium.getName());
        TestCase.assertEquals(100.0, aquarium.getArea());
        TestCase.assertEquals(10, aquarium.getNumberOfAquariums());
        TestCase.assertEquals("USA", aquarium.getLocation());
        TestCase.assertEquals(10, aquarium.getCostPerDayPerFish());
        TestCase.assertEquals(10, aquarium.getNumberOfFishInOneAquarium());
        
    }
    
}