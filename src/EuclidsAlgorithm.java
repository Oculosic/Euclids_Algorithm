import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class EuclidsAlgorithm extends Application {
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Interface.fxml"));

        Scene scene = new Scene(root, 300, 400);

        stage.setTitle("Euclid's Algorithm");
        stage.setScene(scene);
        stage.show();
    }
}
