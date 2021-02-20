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
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private PasswordField userpass;

    @FXML
    private TextField username;

    @FXML
    private Button signInBtn;

    @FXML
    private Button signUpBtn;

    @FXML
    private CheckBox rememberMe;

    @FXML
    private Button forgotPassBtn;

    @FXML
    private ProgressBar progressBar;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        progressBar.setVisible(false);
        username.setStyle("--fx-text-inner-color: #A0A2AB");
        userpass.setStyle("--fx-text-inner-color: #A0A2AB");
    }

    @FXML
    public void loginAction(ActionEvent event) {
        progressBar.setVisible(true);
        PauseTransition pauseTransition = new PauseTransition();
        pauseTransition.setDuration(Duration.seconds(3));
        pauseTransition.setOnFinished(actionEvent -> {
            System.out.println("Login Successful");
            System.out.println("Username: " + username.getText());
            System.out.println("Password: " + userpass.getText());
        });
        pauseTransition.play();
    }

    @FXML
    public void signUpBtnAction(ActionEvent event) throws IOException {
        signInBtn.getScene().getWindow().hide();

        Stage signUpStage = new Stage();
        Parent root = FXMLLoader.load(Main.class.getResource("/fxml/SignUp.fxml"));
        Scene scene = new Scene(root);
        signUpStage.setScene(scene);
        signUpStage.setResizable(false);
        signUpStage.show();

    }
}
