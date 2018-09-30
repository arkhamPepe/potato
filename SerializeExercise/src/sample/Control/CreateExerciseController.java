package sample.Control;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import sample.Controller;

import java.net.URL;
import java.util.ResourceBundle;

public class CreateExerciseController implements Initializable {
    private Controller controller;

    @FXML private RadioButton radStrengthExercise;
    @FXML private RadioButton radCardioExercise;
    @FXML private RadioButton radStretchExercise;

    private ToggleGroup homeButtons;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        homeButtons = new ToggleGroup();
        radCardioExercise.setToggleGroup(homeButtons);
        radStrengthExercise.setToggleGroup(homeButtons);
        radStretchExercise.setToggleGroup(homeButtons);
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
