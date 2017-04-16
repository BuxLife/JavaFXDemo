package com.buxlife.javafxdemo.Windows;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Bux_Life on 2017/04/10.
 */
public class MainWindow extends Application{
    Stage window;
    Button button;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("Bux Life");
        window.setOnCloseRequest(event -> {
                    event.consume();        //Take over method
                    closeApp();
        });


        button = new Button("DO NOT CLICK.. the button.");
        button.setOnAction(e -> {
            boolean result;

            AlertBox.display("Big Mistake", "Alert! \nYou did it..\nFoolish Mortal!");
            result = ConfirmBox.display("Consequences ", "Will you live with this consequences?");
            if (!result)
            {
                AlertBox.display("Hmmm", "Hmm.. \nYou will be granted one last chance.\nBegone!");
                System.out.println(result);
            }
            else
            {
                AlertBox.display("Big Mistake", "No no no");
                System.out.println(result);
            }
        });

        Button closeButton = new Button("Close");
        closeButton.setOnAction(e ->{
            closeApp();

        });
        StackPane layout = new StackPane();
        layout.getChildren().addAll(button, closeButton);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    public void closeApp(){
        Boolean answer = ConfirmBox.display("Exiting..", "Are you sure?");
        if (answer){
            System.out.println("Exiting...");
            window.close();
        }
    }

}
