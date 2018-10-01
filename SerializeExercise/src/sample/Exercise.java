package sample;

import java.io.Serializable;

public class Exercise implements Serializable {
    private double difficulty;
    private String name;
    private String equipment;
    private ExerciseType exerciseType;

    public Exercise(double difficulty, String name, String equipment, ExerciseType type){
        this.difficulty = difficulty;
        this.name = name;
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return "[" + name + ": Type = " + exerciseType.toString() + "; Difficulty = " + String.valueOf(difficulty) + "; Equipment = " + equipment + "]";
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

    public ExerciseType getExerciseType(){
        return exerciseType;
    }
}
