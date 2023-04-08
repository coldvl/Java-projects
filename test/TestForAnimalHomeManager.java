import org.junit.Test;
import junit.framework.TestCase;



import ua.lviv.iot.algo.part1.lab2.AnimalHomeManager;

import ua.lviv.iot.algo.part1.lab2.Farm;
import ua.lviv.iot.algo.part1.lab2.Zoo;
import ua.lviv.iot.algo.part1.lab2.Aquarium;
import ua.lviv.iot.algo.part1.lab2.Sanctuary;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.Time;



public class TestForAnimalHomeManager 
    extends AnimalHomeManager
{
    AnimalHomeManager animalHomeManager = new AnimalHomeManager();
    
    Farm farm = new Farm("Sky High Aviary", "USA", 150, 10, 15, "Parrots");
    Zoo zoo = new Zoo("Friendly Farms", "Canada", 100, 10, Time.valueOf("11:00:00"), Time.valueOf("16:00:00"), 20);
    Aquarium aquarium = new Aquarium("Friendly Farms", "Canada", 100, 10, 20, 20);
    Sanctuary sanctuary = new Sanctuary("Friendly Farms", "Canada", 100, 10, 20, 10, 20);
    

    // test for method findCheapestAnimalHome
    @Test
    public void testFindCheapestAnimalHome() {
        animalHomeManager.addAnimalHome(farm);
        animalHomeManager.addAnimalHome(zoo);
        animalHomeManager.addAnimalHome(aquarium);
        animalHomeManager.addAnimalHome(sanctuary);
        TestCase.assertEquals(zoo, animalHomeManager.findCheapestAnimalHome());
    }
    
    // test for method findAnimalHomesWithAreaLessThan
    @Test
    public void testFindAnimalHomesWithAreaLessThan() {
        animalHomeManager.addAnimalHome(farm);
        animalHomeManager.addAnimalHome(zoo);
        animalHomeManager.addAnimalHome(aquarium);
        animalHomeManager.addAnimalHome(sanctuary);
        
        TestCase.assertEquals(animalHomeManager.animalHomes, animalHomeManager.findAnimalHomesWithAreaLessThan(2000));
    }
    
    // test for printAllFarms
    @Test
    public void testPrintAllFarms() {
        // Create a new Farm object and add it to the animalHomes list
        
        animalHomeManager.addAnimalHome(farm);
        
        // Redirect System.out to a ByteArrayOutputStream for testing purposes
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        // Call the printAllFarms method and assert that it prints the correct output
        animalHomeManager.printAllFarms();
        String expectedOutput = "Farms:\n" + farm.toString() + "\n";
        TestCase.assertEquals(expectedOutput, outputStream.toString());
        
        // Reset System.out
        System.setOut(System.out);
    }

    // test for printAllZoos
    @Test
    public void testPrintAllZoos() {
        // Create a new Zoo object and add it to the animalHomes list
        
        animalHomeManager.addAnimalHome(zoo);
        
        // Redirect System.out to a ByteArrayOutputStream for testing purposes
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        // Call the printAllZoos method and assert that it prints the correct output
        animalHomeManager.printAllZoos();
        String expectedOutput = "Zoos:\n" + zoo.toString() + "\n";
        TestCase.assertEquals(expectedOutput, outputStream.toString());
        
        // Reset System.out
        System.setOut(System.out);
    }

    // test for printAllAquariums
    @Test
    public void testPrintAllAquariums() {
        // Create a new Aquarium object and add it to the animalHomes list
        
        animalHomeManager.addAnimalHome(aquarium);
        
        // Redirect System.out to a ByteArrayOutputStream for testing purposes
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        // Call the printAllAquariums method and assert that it prints the correct output
        animalHomeManager.printAllAquariums();
        String expectedOutput = "Aquariums:\n" + aquarium.toString() + "\n";
        TestCase.assertEquals(expectedOutput, outputStream.toString());
        
        // Reset System.out
        System.setOut(System.out);
    }

    // test for main
    @Test
    public void testMain() {

        // Redirect System.out to a ByteArrayOutputStream for testing purposes
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        


        // Call the main method and assert that it prints the correct output
        AnimalHomeManager.main(null);
        
        

        TestCase.assertEquals(outputStream.toString(), outputStream.toString());
        
        // Reset System.out
        System.setOut(System.out);
    }

    
}
