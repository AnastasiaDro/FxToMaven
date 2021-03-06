import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {


    public void start(Stage primaryStage) throws Exception {
        
        FXMLLoader loader = new FXMLLoader();
        Parent root = (Parent) loader.load(getClass().getResource("hello.fxml"));
        primaryStage.setTitle("JavaFX and Maven");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
