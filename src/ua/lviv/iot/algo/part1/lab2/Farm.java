package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@Getter
@ToString

public class Farm extends AbstractAnimalHome{
    private int capacity;
    private int costPerAnimalperDay;
    private String animalType;
    public static final int DAYS_IN_MONTH = 30;

    public Farm(String name, String location, double area, int capacity, int costPerAnimalperDay, String animalType) {
        super(name, location, area);
        this.capacity = capacity;
        this.costPerAnimalperDay = costPerAnimalperDay;
        this.animalType = animalType;
    }

    @Override
    public int calculateCostPerMonth() {
        return costPerAnimalperDay * DAYS_IN_MONTH * capacity;
    }
}
