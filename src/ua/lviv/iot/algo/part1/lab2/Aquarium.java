package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@Getter
@ToString
@NoArgsConstructor

public class Aquarium extends AbstractAnimalHome{
    private int costPerDayPerFish;
    private int numberOfFishInOneAquarium;
    private int numberOfAquariums;

    public Aquarium(String name, String location, double area, int costPerDayPerFish, int numberOfFishInOneAquarium, int numberOfAquariums) {
        super(name, location, area);
        this.costPerDayPerFish = costPerDayPerFish;
        this.numberOfFishInOneAquarium = numberOfFishInOneAquarium;
        this.numberOfAquariums = numberOfAquariums;
    }

    @Override
    public int calculateCostPerMonth() {
        return costPerDayPerFish * 30 * numberOfFishInOneAquarium * numberOfAquariums;
    }
    
}
