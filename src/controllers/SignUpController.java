package controllers;

import application.Main;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SignUpController implements Initializable {
    @FXML
    public TextField locationT;

    @FXML
    private TextField username;

    @FXML
    private TextField userpass;

    @FXML
    private RadioButton maleRadio;

    @FXML
    private ToggleGroup gender;

    @FXML
    private RadioButton femaleRadio;

    @FXML
    private Button signUpBtn;

    @FXML
    private Button signInBtn;

    @FXML
    private ProgressBar progressBar;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        progressBar.setVisible(false);
        username.setStyle("--fx-text-inner-color: #A0A2AB");
        userpass.setStyle("--fx-text-inner-color: #A0A2AB");
        locationT.setStyle("--fx-text-inner-color: #A0A2AB");
    }

    @FXML
    public void signUpAction(ActionEvent event) throws IOException {
        progressBar.setVisible(true);
        PauseTransition pauseTransition = new PauseTransition();
        pauseTransition.setDuration(Duration.seconds(3));
        pauseTransition.setOnFinished(actionEvent -> {
            System.out.println("Login Successful");
            System.out.println("Username: " + username.getText());
            System.out.println("Password: " + userpass.getText());
            System.out.println("Location: " + locationT.getText());
        });
        pauseTransition.play();
    }

    @FXML
    public void signInBtnAction(ActionEvent event) throws IOException {
        signUpBtn.getScene().getWindow().hide();

        Stage loginStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/LoginController.fxml"));
        Scene loginScene = new Scene(root);
        loginStage.setScene(loginScene);
        loginStage.show(); loginStage.setTitle("Login - Car Review");
        loginStage.setResizable(false);
    }
}
