package task;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Task extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Circle circle = new Circle();
        circle.setRadius(150);
        circle.setCenterX(200);
        circle.setCenterY(220);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        pane.getChildren().add(circle);

        //Eyes
        Ellipse leftEye = new Ellipse(140, 160, 35, 15);
        Ellipse rightEye = new Ellipse(260, 160, 35, 15);
        pane.getChildren().add(leftEye);
        pane.getChildren().add(rightEye);
        
        //Nose
        Polygon nose = new Polygon();
        nose.getPoints().addAll(new Double[]{200.0, 190.0,160.0, 270.0,240.0, 270.0 });
        pane.getChildren().add(nose);
        
        
        //Mouth
        Arc mouth=new Arc(200,180,150,150,230,80);
        mouth.setType(ArcType.CHORD);
       // mouth.setFill(Color.RED);
        pane.getChildren().add(mouth);
        
        
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setResizable(false);

    }

    public static void main(String[] args) {
        launch(args);
    }

}
