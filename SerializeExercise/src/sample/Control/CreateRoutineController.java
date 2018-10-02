package sample.Control;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import sample.Controller;

public class CreateRoutineController {
    private Controller controller;

    @FXML private AnchorPane anchorBase;

    public CreateRoutineController(){

    }

    public Node getBaseNode(){
        return anchorBase;
    }
}
