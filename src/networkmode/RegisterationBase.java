package tec_tac_toe;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

public abstract class RegisterationBase extends AnchorPane {

    protected final ImageView Background;
    protected final Glow glow;
    protected final TextField UserName;
    protected final Label NameLabel;
    protected final Label PassLabel;
    protected final TextField Password;
    protected final ImageView Logo;
    protected final Glow glow0;
    protected final Button Go;

    public RegisterationBase() {

        Background = new ImageView();
        glow = new Glow();
        UserName = new TextField();
        NameLabel = new Label();
        PassLabel = new Label();
        Password = new TextField();
        Logo = new ImageView();
        glow0 = new Glow();
        Go = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(500.0);
        setPrefWidth(442.0);

        Background.setFitHeight(500.0);
        Background.setFitWidth(442.0);
        Background.setLayoutX(1.0);
        Background.setPickOnBounds(true);
//        Background.setImage(new Image(getClass().getResource("../photo/1.jpg").toExternalForm()));
        Background.setImage(new Image("assets/bg.jpg"));

        glow.setLevel(0.0);
        Background.setEffect(glow);

        UserName.setLayoutX(72.0);
        UserName.setLayoutY(178.0);
        UserName.setPrefHeight(39.0);
        UserName.setPrefWidth(301.0);
        UserName.setPromptText("Please enter your name");

        NameLabel.setLayoutX(72.0);
        NameLabel.setLayoutY(143.0);
        NameLabel.setPrefHeight(27.0);
        NameLabel.setPrefWidth(120.0);
        NameLabel.setText("User Name");
        NameLabel.setTextFill(javafx.scene.paint.Color.valueOf("#ddd8d8"));
        NameLabel.setFont(new Font("System Bold Italic", 18.0));

        PassLabel.setLayoutX(72.0);
        PassLabel.setLayoutY(237.0);
        PassLabel.setPrefHeight(27.0);
        PassLabel.setPrefWidth(100.0);
        PassLabel.setText("Password");
        PassLabel.setTextFill(javafx.scene.paint.Color.valueOf("#ddd8d8"));
        PassLabel.setFont(new Font("System Bold Italic", 18.0));

        Password.setLayoutX(71.0);
        Password.setLayoutY(264.0);
        Password.setPrefHeight(39.0);
        Password.setPrefWidth(301.0);
        Password.setPromptText("Your Password");

        Logo.setFitHeight(109.0);
        Logo.setFitWidth(109.0);
        Logo.setLayoutX(167.0);
        Logo.setLayoutY(16.0);
        Logo.setPickOnBounds(true);
//        Logo.setImage(new Image(getClass().getResource("../photo/2.jpg").toExternalForm()));
        Logo.setImage(new Image("assets/logo.jpg"));
        glow0.setLevel(0.0);
        Logo.setEffect(glow0);

        Go.setLayoutX(167.0);
        Go.setLayoutY(363.0);
        Go.setMnemonicParsing(false);
        Go.setPrefHeight(37.0);
        Go.setPrefWidth(100.0);
        Go.setText("Go");
        Go.setTextFill(javafx.scene.paint.Color.valueOf("#430707"));
        Go.setFont(new Font("System Bold Italic", 18.0));

        getChildren().add(Background);
        getChildren().add(UserName);
        getChildren().add(NameLabel);
        getChildren().add(PassLabel);
        getChildren().add(Password);
        getChildren().add(Logo);
        getChildren().add(Go);

    }
}
