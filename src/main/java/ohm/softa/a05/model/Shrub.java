package ohm.softa.a05.model;

public class Shrub extends Plant{
    public Shrub(double height, String family, String name, PlantColor color) {
        super(height, family, name, color);
        if (color != PlantColor.GREEN) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public int compareTo(Plant o) {
        return 0;
    }
}
