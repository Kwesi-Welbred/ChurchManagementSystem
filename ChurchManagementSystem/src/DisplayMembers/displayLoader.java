package DisplayMembers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class displayLoader extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("display.fxml"));
        primaryStage.setTitle("Member Display");
        primaryStage.setScene(new Scene(root, 700, 600));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
