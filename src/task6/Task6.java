package task6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Task6 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        Button openBtn = new Button("OPEN");
        Button closeBtn = new Button("CLOSE");
        HBox top = new HBox(20);
        top.setPadding(new Insets(60, 150, 30, 150));
        //top.setAlignment(Pos.CENTER);
        top.getChildren().add(openBtn);
        top.getChildren().add(closeBtn);
        pane.getChildren().add(top);

        Line left = new Line(50, 150, 50, 280);
        Line topLeft = new Line(50, 150, 200, 150);
        Line b1 = new Line(200.0, 140.0, 200, 170.0);
        Line b2 = new Line(210.0, 145.0, 210, 160.0);
        Line topRight = new Line(210.0, 150.0, 350, 150.0);
        Line RightTop = new Line(350.0, 150.0, 350, 200.0);
        Circle light = new Circle(350, 215, 15);
        light.setFill(Color.WHITE);
        light.setStroke(Color.BLACK);
        Line RightBottom = new Line(350, 230, 350, 280);
        Line BottomRight = new Line(350, 280, 200, 280);
        Line BottomLeft = new Line(50, 280, 130, 280);
        Circle c1 = new Circle(135, 280, 5);
        Circle c2 = new Circle(205, 280, 5);
        Line Switch = new Line(135, 280, 180, 250);
        Switch.setStrokeWidth(3);
        pane.getChildren().addAll(left, topLeft, b1, b2, topRight,
                RightTop, light, RightBottom, BottomRight, BottomLeft, c1, c2, Switch);

        
        openBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Switch.setStartX(135);
                Switch.setStartY(280);
                Switch.setEndX(180);
                Switch.setEndY(250);
                Switch.setStroke(Color.RED);
                light.setFill(Color.WHITE);

            }
        });

        closeBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Switch.setStartX(135);
                Switch.setStartY(280);
                Switch.setEndX(200);
                Switch.setEndY(280);
                light.setFill(Color.YELLOW);
            }
        });

        Scene scene = new Scene(pane, 400, 350);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
