package sample.Control;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class CreateExerciseController implements Initializable {
    private static CreateExerciseController createExerciseController;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        createExerciseController = this;
    }

    public static CreateExerciseController getInstance() {
        return createExerciseController;
    }

    private CreateExerciseController(){

    }
}
