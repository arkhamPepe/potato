package sample;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML private AnchorPane base;
    @FXML private StackPane stack;

    @FXML private AnchorPane anchorHome;
    @FXML private AnchorPane anchorSubpage;
    @FXML private SplitPane splitSubpage;
    @FXML private AnchorPane subpageHeader;
    @FXML private AnchorPane subpageContent;

    @FXML private Button btnCreateExercise;
    @FXML private Button btnCreateRoutine;
    @FXML private Button btnViewExercises;
    @FXML private Button btnViewRoutines;



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
    public void frontCreateExercise(){

    }

    @FXML
    public void frontCreateRoutine(){

    }

    @FXML
    public void frontViewExercises(){

    }

    @FXML
    public void frontViewRoutines(){

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
