import org.junit.Test;
import junit.framework.TestCase;
import ua.lviv.iot.algo.part1.lab2.Sanctuary;



public class TestForSanctuary 
    extends Sanctuary
{
    Sanctuary sanctuary = new Sanctuary("Friendly Farms", "Canada", 100, 10, 20, 10, 20);

    
    @Test
    public void testCalculateCostPerMonth() {
        TestCase.assertEquals(12000, sanctuary.calculateCostPerMonth());
    }
    
}
