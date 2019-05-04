package ohm.softa.a05;

import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.collections.SimpleListImpl;
import ohm.softa.a05.model.Plant;
import ohm.softa.a05.model.PlantColor;

public class PlantBed <T extends Plant> {
    private SimpleList<T> plants;

    public PlantBed (){
        plants = new SimpleListImpl<T>();
    }

    public void add(T plant){
        this.plants.add(plant);
    }
    public int size(){
        return this.plants.size();
    }
    public SimpleList<T> getPlantsByColor(PlantColor color){
        return this.plants.filter(x -> x.getColor() == color);
    }
}
