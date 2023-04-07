package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Sanctuary extends AbstractAnimalHome{
    private int numberOfEndangeredAnimals;
    private int numberOfAnimals;
    private int costPerDayPerAnimal;
    private int costPerDayPerEndangeredAnimal;

    public Sanctuary(String name, String location, double area, int numberOfEndangeredAnimals, int numberOfAnimals, int costPerDayPerAnimal, int costPerDayPerEndangeredAnimal) {
        super(name, location, area);
        this.numberOfEndangeredAnimals = numberOfEndangeredAnimals;
        this.numberOfAnimals = numberOfAnimals;
        this.costPerDayPerAnimal = costPerDayPerAnimal;
        this.costPerDayPerEndangeredAnimal = costPerDayPerEndangeredAnimal;
    }

    @Override
    public int calculateCostPerMonth() {
        return (costPerDayPerAnimal * numberOfAnimals + costPerDayPerEndangeredAnimal * numberOfEndangeredAnimals) * 30;
    }
    
}
