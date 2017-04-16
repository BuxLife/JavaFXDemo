package com.buxlife.javafxdemo.Scenes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Bux_Life on 2017/04/10.
 */
public class BasicGui extends Application{

    Stage window;
    Scene scene1, scene2, scene3;

    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Label label1 = new Label("The First Scene..");

        //Button 1
        Button button1 = new Button("Scene 2 launcher");
        button1.setOnAction(e -> window.setScene(scene2));

        //Button 2
        Button button2 = new Button("Scene 3 launcher");
        button2.setOnAction(e -> window.setScene(scene3));

        //Button 3
        Button button3 = new Button("Return to Scene 1");
        button3.setOnAction(e -> window.setScene(scene1));

        //Button 4
        Button button4 = new Button("Return to Scene 2");
        button4.setOnAction(e -> window.setScene(scene2));

        //Layout 1 - VBox Layout - Children are positioned vertically.
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 400, 400);

        //Layout 2 - StackPane Layout
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        //layout2.getChildren().add(label2);
        scene2 = new Scene(layout2, 400, 400);

        //Layout 3
        StackPane layout3 = new StackPane();
        layout3.getChildren().add(button3);
        scene3 = new Scene(layout3, 400, 400);

        window.setScene(scene1);
        window.setTitle("The Trilogy");
        window.show();

    }
}
