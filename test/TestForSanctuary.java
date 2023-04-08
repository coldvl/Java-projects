import org.junit.Test;
import junit.framework.TestCase;
import ua.lviv.iot.algo.part1.lab2.Sanctuary;



public class TestForSanctuary 
    extends Sanctuary
{
    Sanctuary sanctuary = new Sanctuary("Friendly Farms", "Canada", 100, 10, 20, 10, 20);

    // test for method calculateCostPerMonth
    @Test
    public void testCalculateCostPerMonth() {
        TestCase.assertEquals(12000, sanctuary.calculateCostPerMonth());
    }

    //test getters
    @Test
    public void testGetters() {
        TestCase.assertEquals("Friendly Farms", sanctuary.getName());
        TestCase.assertEquals(100.0, sanctuary.getArea());
        TestCase.assertEquals(20, sanctuary.getNumberOfAnimals());
        TestCase.assertEquals(10, sanctuary.getNumberOfEndangeredAnimals());
        TestCase.assertEquals("Canada", sanctuary.getLocation());
        TestCase.assertEquals(10, sanctuary.getCostPerDayPerAnimal());
        TestCase.assertEquals(20, sanctuary.getCostPerDayPerEndangeredAnimal());
        
    }
    
}
