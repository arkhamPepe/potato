package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {

    private static List<Exercise> exercises;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Exercise Maker");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setResizable(false);

        Image image = new Image("/sample/Images/gym-icon.png");

        primaryStage.getIcons().add(image);
        primaryStage.show();
    }


    public static void main(String[] args) {
        exercises = new ArrayList<>();
        launch(args);
    }

    public static void printAllExercises(){
        System.out.println();

        for(Exercise e : exercises){
            System.out.println(e.toString());
        }
    }

    public static void printExercise(Exercise exercise){
        System.out.println("\n" + exercise.toString());
    }

    public static void addExercise(Exercise exercise){
        exercises.add(exercise);
    }
}
