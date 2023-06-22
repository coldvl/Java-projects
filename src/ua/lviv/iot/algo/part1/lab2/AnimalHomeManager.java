package ua.lviv.iot.algo.part1.lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
import lombok.Getter;

@Getter

public class AnimalHomeManager {
    private List<AbstractAnimalHome> animalHomes = new ArrayList<>();

    public void addAnimalHome(final AbstractAnimalHome animalHome) {
        this.animalHomes.add(animalHome);
    }

    public AbstractAnimalHome findCheapestAnimalHome() {
        return animalHomes.stream().min((animalHome1, animalHome2) -> animalHome1.calculateCostPerMonth() - animalHome2.calculateCostPerMonth()).get();
    }
    public List<AbstractAnimalHome> findAnimalHomesWithAreaLessThan(final double area) {
        return animalHomes.stream().filter(animalHome -> animalHome.getArea() < area).collect(Collectors.toList());
    }   
}
