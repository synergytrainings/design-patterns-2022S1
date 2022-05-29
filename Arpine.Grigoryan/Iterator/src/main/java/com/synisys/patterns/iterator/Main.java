package com.synisys.patterns.iterator;

import com.synisys.patterns.iterator.helper.BushType;
import com.synisys.patterns.iterator.impl.BushCollection;
import com.synisys.patterns.iterator.impl.TreeCollection;
import com.synisys.patterns.iterator.model.Garden;
import com.synisys.patterns.iterator.model.Bush;
import com.synisys.patterns.iterator.model.Tree;

import static org.junit.Assert.assertEquals;


public class Main {
    public static void main(String[] args) {
        TreeCollection trees = null;
        Garden garden = new Garden();

        assertEquals(garden.waterAllPlants(), "--- There is no plant in this Garden ---");
        assertEquals(garden.waterPlantsByType(trees), "--- There is no such plant in this Garden ---");


        trees = new TreeCollection();
        trees.plant(new Tree("oak", 40));
        trees.plant(new Tree("birch", 6));
        trees.plant(new Tree("oring", 7));
        BushCollection bushes = new BushCollection();
        bushes.plant(new Bush("BlueBerry", BushType.Multi_Anual));
        bushes.plant(new Bush("Rose1", BushType.Multi_Anual));
        bushes.plant(new Bush("Rose2", BushType.Anual));

        Garden garden1 = new Garden();
        garden1.addNewPlantCollection(trees);
        garden1.addNewPlantCollection(bushes);


        assertEquals(garden1.waterAllPlants(), "--- The watering of all plants is completed ---");
        assertEquals(garden1.waterPlantsByType(bushes), "--- The watering of the BushCollection plant is completed ---");


    }
}
