package test.java.ua.lviv.iot.algo.part1.lab2;

import junit.framework.TestCase;
import main.java.ua.lviv.iot.algo.part1.lab2.AnimalHomeManager;
import main.java.ua.lviv.iot.algo.part1.lab2.models.Aquarium;
import main.java.ua.lviv.iot.algo.part1.lab2.models.Farm;
import main.java.ua.lviv.iot.algo.part1.lab2.models.Sanctuary;
import main.java.ua.lviv.iot.algo.part1.lab2.models.Zoo;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Time;



public class TestForAnimalHomeManager 
    extends AnimalHomeManager
{
    AnimalHomeManager animalHomeManager = new AnimalHomeManager();
    
    Farm farm = new Farm("Sky High Aviary", "USA", 150, 10, 15, "Parrots");
    Zoo zoo = new Zoo("Friendly Farms", "Canada", 100, 10, Time.valueOf("11:00:00"), Time.valueOf("16:00:00"), 20);
    Aquarium aquarium = new Aquarium("Friendly Farms", "Canada", 100, 10, 20, 20);
    Sanctuary sanctuary = new Sanctuary("Friendly Farms", "Canada", 100, 10, 20, 10, 20);
    

    @Test
    public void testFindCheapestAnimalHome() {
        animalHomeManager.addAnimalHome(farm);
        animalHomeManager.addAnimalHome(zoo);
        animalHomeManager.addAnimalHome(aquarium);
        animalHomeManager.addAnimalHome(sanctuary);
        assertEquals(zoo, animalHomeManager.findCheapestAnimalHome());
    }
    
    @Test
    public void testFindAnimalHomesWithAreaLessThan() {
        animalHomeManager.addAnimalHome(farm);
        animalHomeManager.addAnimalHome(zoo);
        animalHomeManager.addAnimalHome(aquarium);
        animalHomeManager.addAnimalHome(sanctuary);
        
        TestCase.assertEquals(animalHomeManager.getAnimalHomes(), animalHomeManager.findAnimalHomesWithAreaLessThan(2000));
    }
        
}
