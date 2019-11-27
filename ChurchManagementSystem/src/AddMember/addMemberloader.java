package AddMember;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class addMemberloader extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("addMember.fxml"));
        primaryStage.setTitle("Add Member");
        primaryStage.setScene(new Scene(root, 700, 600));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
