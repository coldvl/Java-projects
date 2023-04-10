package ua.lviv.iot.algo.part1.lab2;
import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public abstract class AbstractAnimalHome {
    private String name;
    private String location;
    protected double area;

    public abstract int calculateCostPerMonth();
    
}
