package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML private AnchorPane anchorHome;
    @FXML private AnchorPane subpages;

    @Override @FXML
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void frontHome(){
        anchorHome.toFront();
    }

    public void frontSubpages(){
        subpages.toFront();
    }
}
