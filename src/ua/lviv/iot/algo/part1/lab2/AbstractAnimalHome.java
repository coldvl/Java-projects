package ua.lviv.iot.algo.part1.lab2;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public abstract class AbstractAnimalHome {
    private String name;
    private String location;
    protected double area;

    public abstract int calculateCostPerMonth();
    public String getHeaders() {
        return "name, location, area";
    }
    public String toCSV() {
        return name + ", " + location + ", " + area;
    }
}
