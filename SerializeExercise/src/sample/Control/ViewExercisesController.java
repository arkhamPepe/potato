package sample.Control;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import sample.Controller;

import java.net.URL;
import java.util.ResourceBundle;

public class ViewExercisesController implements Initializable {
    private Controller controller;

    @FXML private AnchorPane anchorBase;

    public ViewExercisesController(){

    }

    public Node getBaseNode(){
        return anchorBase;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
