package AddMember;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class addMembercontroller implements Initializable {
    @FXML
    private AnchorPane container;

    @FXML
    private VBox vbox;

    @FXML
    private JFXTextField id;

    @FXML
    private JFXTextField surname;

    @FXML
    private JFXTextField middlename;

    @FXML
    private JFXTextField firstname;

    @FXML
    private DatePicker dob;

    @FXML
    private Label location;

    @FXML
    private JFXComboBox<?> country;

    @FXML
    private JFXComboBox<?> city;

    @FXML
    private JFXComboBox<?> Town;

    @FXML
    private JFXButton img;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
       saveButton();
    }

    @FXML
    private void saveButton() {
        String idText = id.getText();
        String lastName = surname.getText();
        String  middleNameText   = middlename.getText();
        String firstNameText = firstname.getText();
        EventHandler<? super MouseEvent> DOB = dob.getOnMouseClicked();
        EventHandler<? super MouseEvent> countryText = country.getOnMouseClicked();


    }
}
