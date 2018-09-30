package sample.Control;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import sample.Controller;
import sample.Exercise;

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

    private ToggleGroup homeButtons;

    public CreateExerciseController(){

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        controller = Controller.getInstance();

        homeButtons = new ToggleGroup();
        radCardioExercise.setToggleGroup(homeButtons);
        radStrengthExercise.setToggleGroup(homeButtons);
        radStretchExercise.setToggleGroup(homeButtons);
    }

    @FXML
    private void goHome(){
        controller.frontHome();
    }

    @FXML
    private void save(){
        String name = txtName.getText();
        Integer difficultyValue = spinnerDifficulty.getValue();
        double difficult = difficultyValue.doubleValue();
        String equipment = txtEquipment.getText();


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
