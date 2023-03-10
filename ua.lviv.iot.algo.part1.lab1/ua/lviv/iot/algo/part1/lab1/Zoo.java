import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Zoo {
    private static Zoo instance;
    private String name;
    private String location;
    private double area;
    private int capacity;


    public static Zoo getInstance() {
        instance = new Zoo();
        return instance;
    }

    public Zoo(String name, String location, double area, int capacity) {
        this.name = name;
        this.location = location;
        this.area = area;
        this.capacity = capacity;
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

    public static void println(Object object) {
        System.out.println(object);
    }

    public static void main(String[] args) {
        Zoo[] zoos = new Zoo[4];

        zoos[0] = new Zoo();
        zoos[1] = new Zoo("ZooLand", "Kyiv", 25.4, 1000);
        zoos[2] = Zoo.getInstance();
        zoos[3] = Zoo.getInstance();

        for (Zoo zoo : zoos) {
            println(zoo);
        }
    }
}
