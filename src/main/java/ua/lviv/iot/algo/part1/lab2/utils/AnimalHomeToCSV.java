package main.java.ua.lviv.iot.algo.part1.lab2.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.java.ua.lviv.iot.algo.part1.lab2.models.AbstractAnimalHome;

public class AnimalHomeToCSV {
    public static void writeToFile(List<AbstractAnimalHome> animalHomes, String fileName) throws IOException {
        Map<Class<? extends AbstractAnimalHome>, List<AbstractAnimalHome>> animalHomeMap = new HashMap<>();
    
        for (AbstractAnimalHome animalHome : animalHomes) {
            Class<? extends AbstractAnimalHome> animalHomeClass = animalHome.getClass();
            if (!animalHomeMap.containsKey(animalHomeClass)) {
                animalHomeMap.put(animalHomeClass, new ArrayList<>());
            }
            animalHomeMap.get(animalHomeClass).add(animalHome);
        }
    
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            boolean wroteHeader = false;
            for (Map.Entry<Class<? extends AbstractAnimalHome>, List<AbstractAnimalHome>> entry : animalHomeMap.entrySet()) {
                List<AbstractAnimalHome> animalHomeList = entry.getValue();
    
                if (!wroteHeader) {
                    String headerRow = animalHomeList.get(0).getHeaders();
                    writer.write(headerRow);
                    writer.newLine();
                    wroteHeader = true;
                }
    
                for (AbstractAnimalHome animalHome : animalHomeList) {
                    String dataRow = animalHome.toCSV();
                    writer.write(dataRow);
                    writer.newLine();
                }
    
                wroteHeader = false;
            }
        }
    }
}
