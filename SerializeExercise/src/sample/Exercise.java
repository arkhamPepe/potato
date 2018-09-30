package sample;

import java.io.Serializable;

public class Exercise implements Serializable {
    private double difficulty;
    private String name;
    private String equipment;

    public Exercise(double difficulty, String name, String equipment){
        this.difficulty = difficulty;
        this.name = name;
        this.equipment = equipment;
    }

    public double getDifficulty() {
        return difficulty;
    }

    public String getName() {
        return name;
    }

    public String getEquipment() {
        return equipment;
    }
}
