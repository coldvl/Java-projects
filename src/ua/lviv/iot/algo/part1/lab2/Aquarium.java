package ua.lviv.iot.algo.part1.lab2;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor

public class Aquarium extends AbstractAnimalHome {
    private int costPerDayPerFish;
    private int numberOfFishInOneAquarium;
    private int numberOfAquariums;
    public static final int DAYS_IN_MONTH = 30;

    public Aquarium(String name, String location, double area, int costPerDayPerFish, int numberOfFishInOneAquarium, int numberOfAquariums) {
        super(name, location, area);
        this.costPerDayPerFish = costPerDayPerFish;
        this.numberOfFishInOneAquarium = numberOfFishInOneAquarium;
        this.numberOfAquariums = numberOfAquariums;
    }

    @Override
    public int calculateCostPerMonth() {
        return costPerDayPerFish * DAYS_IN_MONTH * numberOfFishInOneAquarium * numberOfAquariums;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + "costPerDayPerFish" + "," + "numberOfFishInOneAquarium" + "," + "numberOfAquariums";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + costPerDayPerFish + "," + numberOfFishInOneAquarium + "," + numberOfAquariums;
    }
}
