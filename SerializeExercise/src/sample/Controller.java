package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.AnchorPane;
import sample.Control.CreateExerciseController;
import sample.Control.CreateRoutineController;
import sample.Control.ViewExercisesController;
import sample.Control.ViewRoutinesController;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private static Controller controller;

    private CreateExerciseController createExerciseController;
    private CreateRoutineController createRoutineController;
    private ViewExercisesController viewExercisesController;
    private ViewRoutinesController viewRoutinesController;

    @FXML private AnchorPane base;

    @FXML private AnchorPane anchorHome;
    @FXML private AnchorPane anchorSubpage;
    @FXML private SplitPane splitSubpage;
    @FXML private AnchorPane subpageHeader;
    @FXML private AnchorPane subpageContent;

    @FXML private AnchorPane anchorCE;
    @FXML private AnchorPane anchorCR;
    @FXML private AnchorPane anchorVE;
    @FXML private AnchorPane anchorVR;

    @FXML private Button btnHome;
    @FXML private Button btnCreateExercise;
    @FXML private Button btnCreateRoutine;
    @FXML private Button btnViewExercises;
    @FXML private Button btnViewRoutines;

    @FXML private Label lblTitle;

    public Controller(){
        controller = this;
    }

    public static Controller getInstance(){
        return controller;
    }

    @FXML
    public void frontHome(){
        anchorHome.toFront();
        anchorHome.setVisible(true);
        anchorSubpage.setVisible(false);
    }

    @FXML
    public void frontSubpage(){
        anchorSubpage.toFront();
        anchorHome.setVisible(false);
        anchorSubpage.setVisible(true);
    }

    @FXML
    public void showCreateExercise(){
        frontSubpage();
        anchorCE.toFront();
        lblTitle.setText("Skapa en övning");
    }

    @FXML
    public void showCreateRoutine(){
        frontSubpage();
        anchorCR.toFront();
        lblTitle.setText("Bygg ett träningspass");
    }

    @FXML
    public void showViewExercises(){
        frontSubpage();
        anchorVE.toFront();
        lblTitle.setText("Alla övningar");
    }

    @FXML
    public void showViewRoutines(){
        frontSubpage();
        anchorVR.toFront();
        lblTitle.setText("Alla träningspass");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        frontHome();
    }
}
