package ua.lviv.iot.algo.part1.lab2;

import java.sql.Time;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import lombok.Getter;
import ua.lviv.iot.algo.part1.lab2.models.*;
import ua.lviv.iot.algo.part1.lab2.utils.AnimalHomeToCSV;


import java.io.IOException;

@Getter

public class AnimalHomeManager {
    private List<AbstractAnimalHome> animalHomes = new ArrayList<>();

    public void writeToFile() throws IOException {
        AnimalHomeToCSV.writeToFile(animalHomes, "result.csv");
    }

    public void addAnimalHome(final AbstractAnimalHome animalHome) {
        this.animalHomes.add(animalHome);
    }

    public AbstractAnimalHome findCheapestAnimalHome() {
        return animalHomes.stream().min((animalHome1, animalHome2) -> animalHome1.calculateCostPerMonth() - animalHome2.calculateCostPerMonth()).get();
    }
    public List<AbstractAnimalHome> findAnimalHomesWithAreaLessThan(final double area) {
        return animalHomes.stream().filter(animalHome -> animalHome.getArea() < area).collect(Collectors.toList());
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

        try {
            manager.writeToFile();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing data to file: " + e.getMessage());
        }
        
    }
}
