package ua.lviv.iot.algo.part1.lab2;

import java.sql.Time;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Zoo extends AbstractAnimalHome {
    
    private int capacity;
    private Time openingTime;
    private Time closingTime;
    private int costPerDay;

    
    public void increaseCapacity(int count) {
        capacity += count;
    }

    public void splitArea() {
        area /= 2;
    }

    public void addNewRegion(double area) {
        this.area += area;
    }

    public static void println(Object object) {
        System.out.println(object);
    }

    //create constructor
    public Zoo(String name, String location, double area, int capacity, Time openingTime, Time closingTime, int costPerDay) {
        super(name, location, area);
        this.capacity = capacity;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.costPerDay = costPerDay;
    }

    @Override
    public int calculateCostPerMonth() {
        return costPerDay * 30;
    }

}
