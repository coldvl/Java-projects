package ua.lviv.iot.algo.part1.lab2;

import java.sql.Time;

import lombok.Getter;
import lombok.ToString;
import lombok.NoArgsConstructor;

@Getter
@ToString
@NoArgsConstructor
public class Zoo extends AbstractAnimalHome {
    private int capacity;
    private Time openingTime;
    private Time closingTime;
    private int costPerDay;
    public static final int DAYS_IN_MONTH = 30;

    
    public void increaseCapacity(final int count) {
        capacity += count;
    }

    public void splitArea() {
        area /= 2;
    }

    public void addNewRegion(final double area) {
        this.area += area;
    }

    public Zoo(String name, String location, double area, int capacity, Time openingTime, Time closingTime, int costPerDay) {
        super(name, location, area);
        this.capacity = capacity;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.costPerDay = costPerDay;
    }

    @Override
    public int calculateCostPerMonth() {
        return costPerDay * DAYS_IN_MONTH;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", capacity, openingTime, closingTime, costPerDay";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + capacity + ", " + openingTime + ", " + closingTime + ", " + costPerDay;
    }

}
