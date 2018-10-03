package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.*;
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

        /*try {
            Process p = Runtime.getRuntime().exec("cmd /c start cmd.exe");
            p.waitFor();
        }
        catch (IOException e){
            System.out.println("Caught IOException");
        }
        catch (InterruptedException e){
            System.out.println("Caught InterruptedException");
        }*/

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
        writeExerciseToFile(exercise, "/Saves/exercises.ser");
    }

    private static void writeExerciseToFile(Exercise exercise, String PATH){
        try {
            FileOutputStream fileOut = new FileOutputStream(PATH);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(exercise);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in " + PATH);
        } catch (IOException i) {
            System.out.println("Failed to save exercise!");
        }
    }

    private static Exercise readExerciseFromFile(String PATH){
        Exercise exercise = null;
        try {
            FileInputStream fileIn = new FileInputStream(PATH);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            exercise = (Exercise) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
        }

        return exercise;
    }
}
