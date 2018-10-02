package sample.Control;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import sample.Controller;

public class ViewRoutinesController {
    private Controller controller;

    @FXML private AnchorPane anchorBase;

    public ViewRoutinesController(){

    }

    public Node getBaseNode(){
        return anchorBase;
    }
}
