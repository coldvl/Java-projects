import org.junit.Test;
import junit.framework.TestCase;
import ua.lviv.iot.algo.part1.lab2.Aquarium;



public class TestForAquarium 
    extends Aquarium
{
    
    Aquarium aquarium = new Aquarium("Aquarium of the Pacific", "USA", 100, 10, 10, 10);
    @Test
    public void testCalculateCostPerMonth() {
        TestCase.assertEquals(30000, aquarium.calculateCostPerMonth());
    }
    
}