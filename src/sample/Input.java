package sample;

import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Input {
    Stage primaryStage;

    public Input(Stage thisStage){
        primaryStage = thisStage;
        buildingStage();
    }

    public void buildingStage(){
        Pane rootPane = new Pane();
        Pane buildingPane = new Pane();
        Pane inputPane = new Pane();

        inputPane.setLayoutX(0);
        inputPane.setLayoutY(0);
        inputPane.setPrefSize(200, 200);

        inputSite(inputPane);

        rootPane.getChildren().addAll(buildingPane, inputPane);
        Scene scene = new Scene(rootPane);

        primaryStage.setMaximized(true);
        primaryStage.setTitle("Skyline");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void inputSite(Pane inputPane){
        TextField startingPos = new TextField();
        startingPos.setLayoutX(20);
        startingPos.setLayoutY(50);
        startingPos.setPromptText("Starting Position");

        TextField width = new TextField();
        width.setLayoutX(20);
        width.setLayoutY(100);
        width.setPromptText("Width");

        TextField height = new TextField();
        height.setLayoutX(20);
        height.setLayoutY(150);
        height.setPromptText("Height");

        inputPane.getChildren().addAll(startingPos, width, height);
    }
}

