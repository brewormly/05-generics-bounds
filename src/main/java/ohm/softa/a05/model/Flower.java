package ohm.softa.a05.model;

public class Flower extends Plant {
    public Flower(double height, String family, String name, PlantColor color) {
        super(height, family, name, color);
        if (color == PlantColor.GREEN) {
            throw new IllegalArgumentException();
        }
    }


    @Override
    public int compareTo(Plant o) {
        if (this.getHeight() < o.getHeight()) {
            return -1;
        } else if (this.getHeight() == o.getHeight()) {
            return 0;
        }
        return 1;
    }

}
