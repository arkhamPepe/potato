package sample;

import java.io.Serializable;

public class Exercise implements Serializable {
    private double difficulty;
    private String name;
    private String equipment;
    private ExerciseType exerciseType;

    public Exercise(double difficulty, String name, String equipment, ExerciseType exerciseType) {
        this.difficulty = difficulty;
        this.name = name;
        this.equipment = equipment;
        this.exerciseType = exerciseType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(name);
        sb.append(": Type = ");
        sb.append(exerciseType);
        sb.append("; Difficulty = ");
        sb.append(difficulty);
        sb.append("; Equipment = ");
        sb.append(equipment);
        sb.append("]");

        return sb.toString();
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
