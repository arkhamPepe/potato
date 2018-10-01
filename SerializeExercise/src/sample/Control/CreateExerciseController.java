package sample.Control;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import sample.Controller;
import sample.Exercise;
import sample.ExerciseType;
import sample.Main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CreateExerciseController implements Initializable {
    private Controller controller;



    @FXML private TextField txtName;
    @FXML private Spinner<Integer> spinnerDifficulty;
    @FXML private TextField txtEquipment;
    @FXML private RadioButton radStrengthExercise;
    @FXML private RadioButton radCardioExercise;
    @FXML private RadioButton radStretchExercise;
    @FXML private Button btnSave;
    @FXML private Button btnHome;

    private ToggleGroup radioButtons;

    public CreateExerciseController(){

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        controller = Controller.getInstance();

        radioButtons = new ToggleGroup();
        radCardioExercise.setToggleGroup(radioButtons);
        radStrengthExercise.setToggleGroup(radioButtons);
        radStretchExercise.setToggleGroup(radioButtons);
    }

    @FXML
    private void goHome(){
        controller.frontHome();
    }

    @FXML
    private void save() throws IOException {
        String name = txtName.getText();
        Integer difficultyValue = spinnerDifficulty.getValue();
        double difficulty = difficultyValue.doubleValue();
        String equipment = txtEquipment.getText();
        ExerciseType exerciseType;

        try {
            exerciseType = getExerciseType();
            Exercise exercise = new Exercise(difficulty, name, equipment, exerciseType);

            Main.addExercise(exercise);
            Main.printExercises();
        }
        catch (IOException e){
            System.out.println("Save failed!");
        }


    }

    private ExerciseType getExerciseType() throws IOException {
        if(radCardioExercise.isSelected()){
            return ExerciseType.CARDIO_EXERCISE;
        }
        else if(radStrengthExercise.isSelected()){
            return ExerciseType.STRENGTH_EXERCISE;
        }
        else if(radStretchExercise.isSelected()){
            return ExerciseType.STRETCH_EXERCISE;
        }
        else {
            throw new IOException();
        }
    }






    /*private static CreateExerciseController createExerciseController;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        createExerciseController = this;
    }

    public static CreateExerciseController getInstance() {
        return createExerciseController;
    }

    private CreateExerciseController(){

    }*/
}
