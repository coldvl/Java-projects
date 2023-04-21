package ua.lviv.iot.algo.part1.lab2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class AnimalHomeToCSV {
    public static void writeToFile(List<AbstractAnimalHome> animalHomes) throws IOException {
        String defaultFileName ="result.csv";
        try (FileWriter writer = new FileWriter(defaultFileName)){
            for(AbstractAnimalHome animalHome:animalHomes){
                writer.write(animalHome.getHeaders());
                writer.write("\n");
                writer.write(animalHome.toCSV());
                writer.write("\n");
            }
        }
    }
}
