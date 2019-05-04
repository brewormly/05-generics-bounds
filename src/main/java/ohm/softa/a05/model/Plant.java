package ohm.softa.a05.model;

import java.util.Objects;

public abstract class Plant implements Comparable<Plant> {

    private double height;
    private String family;
    private String name;
    private PlantColor color;

    protected Plant(double height, String family, String name, PlantColor color) {
        this.height = height;
        this.family = family;
        this.name = name;
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public PlantColor getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "height=" + height +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plant)) return false;
        Plant plant = (Plant) o;
        return Double.compare(plant.getHeight(), getHeight()) == 0 &&
                Objects.equals(getFamily(), plant.getFamily()) &&
                Objects.equals(getName(), plant.getName()) &&
                getColor() == plant.getColor();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getFamily(), getName(), getColor());
    }
}
