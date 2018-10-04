import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class SimpleShapeExample extends Application{

  public void start(Stage stage) {
    stage.setWidth(700);
    stage.setHeight(600);

    Rectangle rect = new Rectangle(10, 20, 60, 40);
    rect.setFill(Color.PINK);

    Circle circle = new Circle(120, 40, 25);
    circle.setFill(Color.BLUE);

    Group root = new Group();
    root.getChildren().addAll(rect, circle);

    Scene scene = new Scene(root);

    stage.setScene(scene);

    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }

}