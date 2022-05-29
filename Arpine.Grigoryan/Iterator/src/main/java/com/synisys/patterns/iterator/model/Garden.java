package com.synisys.patterns.iterator.model;

import com.synisys.patterns.iterator.Collection;
import com.synisys.patterns.iterator.Iterator;
import java.util.HashMap;
import java.util.Map;

public class Garden {
    private Map<String, Collection> plantsCollection = new HashMap<>();


    public void addNewPlantCollection(Collection plantCollection) {
        if (this.plantsCollection.containsKey(plantCollection.getClass().getSimpleName())) {
            throw new RuntimeException("Existing plant collection");
        }
        this.plantsCollection.put(plantCollection.getClass().getSimpleName(), plantCollection);
    }


    public String waterAllPlants() {
        if (this.plantsCollection.isEmpty()) {
            return "--- There is no plant in this Garden ---";
        } else {
            System.out.println("----- The watering of all plants is started -----");
            for (Collection collection : this.plantsCollection.values()) {
                Iterator iterator = collection.createIterator();
                System.out.println("** Water The " + collection.getClass().getSimpleName() + "  **");
                while (iterator.hasNext()) {
                    Plant plant = (Plant) iterator.next();
                    System.out.println(plant.toString());
                }

            }
            System.out.println("---The watering of all plants is completed ---");
            System.out.println();
        }
        return "--- The watering of all plants is completed ---";
    }

    public String waterPlantsByType(Collection plantCollection) {
        if (plantCollection == null) {
            return "--- There is no such plant in this Garden ---";
        }
        String collectionName = plantCollection.getClass().getSimpleName();
        if(! this.plantsCollection.containsKey(collectionName)) {
            return "--- There is no such plant in this Garden ---";

        } else {
            Collection collection = this.plantsCollection.get(collectionName);
            Iterator iterator = collection.createIterator();
            System.out.println( String.format("--- The watering of the %s plant is started ---",collectionName));
            while (iterator.hasNext()) {
                Plant plant = (Plant) iterator.next();
                System.out.println(plant.toString());
            }
        }
        return String.format("--- The watering of the %s plant is completed ---",collectionName);
    }


}
