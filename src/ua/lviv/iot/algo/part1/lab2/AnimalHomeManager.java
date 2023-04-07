package ua.lviv.iot.algo.part1.lab2;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class AnimalHomeManager {
    public List<AbstractAnimalHome> animalHomes = new ArrayList<>();

    public void addAnimalHome(AbstractAnimalHome animalHome) {
        this.animalHomes.add(animalHome);
    }

    // 1. Find the cheapest animal home
    public AbstractAnimalHome findCheapestAnimalHome() {
        return animalHomes.stream().min((animalHome1, animalHome2) -> animalHome1.calculateCostPerMonth() - animalHome2.calculateCostPerMonth()).get();
    }

    // 2. Find animal homes with the area less than the given one
    public List<AbstractAnimalHome> findAnimalHomesWithAreaLessThan(double area) {
        return animalHomes.stream().filter(animalHome -> animalHome.getArea() < area).collect(Collectors.toList());
    }
    

    public void printAllFarms() {
        System.out.println("Farms:");
        for (AbstractAnimalHome animalHome : animalHomes) {
            if (animalHome instanceof Farm) {
                System.out.println(animalHome);
            }
        }
    }

    public void printAllZoos() {
        System.out.println("Zoos:");
        for (AbstractAnimalHome animalHome : animalHomes) {
            if (animalHome instanceof Zoo) {
                System.out.println(animalHome);
            }
        }
    }

    public void printAllAquariums() {
        System.out.println("Aquariums:");
        for (AbstractAnimalHome animalHome : animalHomes) {
            if (animalHome instanceof Aquarium) {
                System.out.println(animalHome);
            }
        }
    }

    public void printAllSanctuaries() {
        System.out.println("Sanctuaries:");
        for (AbstractAnimalHome animalHome : animalHomes) {
            if (animalHome instanceof Sanctuary) {
                System.out.println(animalHome);
            }
        }
    }

    public static void main(String[] args) {
        AnimalHomeManager manager = new AnimalHomeManager();
        manager.addAnimalHome(new Farm("Wild Bluff Ranch", "USA", 200, 15, 10, "Cow"));
        manager.addAnimalHome(new Zoo("Limpopo", "Lviv", 100, 20, Time.valueOf("10:00:00"), Time.valueOf("18:00:00"), 30));
        manager.addAnimalHome(new Farm("Sunset Farms", "California", 300, 25, 10, "Pig"));
        manager.addAnimalHome(new Zoo("Lviv Zoo", "Lviv", 200, 30, Time.valueOf("10:00:00"), Time.valueOf("18:00:00"), 30));
        manager.addAnimalHome(new Farm("End of the World Fields", "California", 300, 25, 10, "Pig"));
        manager.addAnimalHome(new Farm("Coral Kingdom", "Australia", 500, 50, 100, "Tropical Fish"));
        manager.addAnimalHome(new Farm("Sky High Aviary", "USA", 150, 10, 15, "Parrots"));
        manager.addAnimalHome(new Zoo("Friendly Farms", "Canada", 100, 10, Time.valueOf("11:00:00"), Time.valueOf("16:00:00"), 20));
        manager.addAnimalHome(new Farm("Serengeti Plains", "Tanzania", 1000, 100, 45, "Elephants"));
        manager.addAnimalHome(new Farm("Dragon's Den", "USA", 200, 20, 30, "Snakes"));
        manager.addAnimalHome(new Aquarium("Aquarium of the Pacific", "USA", 100, 10, 10, 10));
        manager.addAnimalHome(new Aquarium("Shedd Aquarium", "USA", 200, 20, 20, 20));
        manager.addAnimalHome(new Aquarium("National Aquarium", "USA", 300, 30, 30, 30));
        manager.addAnimalHome(new Sanctuary("The Wild Animal Sanctuary", "USA", 100, 30, 10, 10, 50));
        manager.addAnimalHome(new Sanctuary("Sanctuary of the White Lion", "South Africa", 200, 60, 20, 20, 100));
        manager.addAnimalHome(new Sanctuary("The Elephant Sanctuary", "USA", 300, 90, 30, 30, 150));

        

        
        manager.printAllFarms();
        manager.printAllZoos();
        manager.printAllAquariums();
        manager.printAllSanctuaries();

        //new line
        System.out.println();

        System.out.println("The cheapest animal home is: " + manager.findCheapestAnimalHome());

        //new line  
        System.out.println();
        
        // print all animal homes with the area less than 200 each on a new line
        System.out.println("Animal homes with the area less than 201:");
        manager.findAnimalHomesWithAreaLessThan(201).forEach(System.out::println);
    }
    
    
}
