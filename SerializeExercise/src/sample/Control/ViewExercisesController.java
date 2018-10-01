package sample.Control;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import sample.Controller;

public class ViewExercisesController {
    private Controller controller;

    @FXML private AnchorPane anchorBase;

    ViewExercisesController(){

    }

    public Node getBaseNode(){
        return anchorBase;
    }
}
