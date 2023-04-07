package ua.lviv.iot.algo.part1.lab1;

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
public class Zoo {
    private static Zoo instance = new Zoo();
    private String name;
    private String location;
    private double area;
    private int capacity;

    public static Zoo getInstance() {
        return instance;
    }
    
    public void increaseCapacity(int count) {
        capacity += count;
    }

    public void splitArea() {
        area /= 2;
    }

    public void addNewRegion(double area) {
        this.area += area;
    }

    public static void main(String[] args) {
        int i = 0;
        Zoo[] zoos = new Zoo[4];

        zoos[0] = new Zoo();
        zoos[1] = new Zoo("ZooLand", "Kyiv", 25.4, 1000);
        zoos[2] = Zoo.getInstance();
        zoos[3] = Zoo.getInstance();

        for (Zoo zoo : zoos) {
            System.out.println(zoo);
        }

        System.out.println("While loop:");

        do {
            System.out.println(zoos[i]);
            i++;            
        } while (i<zoos.length);
    }
}
