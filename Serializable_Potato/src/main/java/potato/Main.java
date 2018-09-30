package potato;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import potato.Control.Controller;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("fxml/imat.fxml"));
        primaryStage.setTitle("iMat");
        primaryStage.setMaximized(true);
        primaryStage.setScene(new Scene(root, primaryStage.getWidth(), primaryStage.getHeight()));
        try {
            primaryStage.getIcons().add(new Image("imat/resources/frameIcon32.gif"));
        } catch (Exception ex) {
            System.err.println("Error: " + ex);
        }
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);

        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            public void run() {

            }
        }));
    }
}
