package ohm.softa.a05.utils;

import ohm.softa.a05.PlantBed;
import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantColor;

import java.util.HashMap;
import java.util.Map;

public abstract class PlantBedUtility {
    private PlantBedUtility(){

    }

    public static <T extends Plant> Map<PlantColor, SimpleList<T>> splitBedByColor(PlantBed<T> bed){
        Map<PlantColor, SimpleList<T>> map = new HashMap<>();
        for(PlantColor color: PlantColor.values()){
            map.put(color, bed.getPlantsByColor(color));
        }
        return map;
    }

}
