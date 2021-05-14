package Player;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaView;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.*;
import javafx.scene.web.HTMLEditor;
import javafx.fxml.FXMLLoader;

import java.io.File;

public class playerController{

    @FXML
    private Button SubmitButton;

    @FXML
    private HTMLEditor CommentBar;

    @FXML
    private Label DefaultLabel1;

    @FXML
    private Label DefaultLabel2;

    @FXML
    private Label DefaultLabel3;

    @FXML
    private Label DefaultLabel4;

    @FXML
    private Slider Slider2;

    @FXML
    private Slider Slider1;

    @FXML
    private Slider Slider3;

    @FXML
    private Slider Slider4;

    @FXML
    private TextField ScoreField_1;

    @FXML
    private TextField ScoreField_2;

    @FXML
    private TextField ScoreField_3;

    @FXML
    private TextField ScoreField_4;

    @FXML
    void onSliderChanged(javafx.scene.input.MouseEvent event) {
        /*int sliderValue_1 = (int) Slider1.getValue();
        int sliderValue_2= (int) Slider1.getValue();
        int sliderValue_3= (int) Slider1.getValue();
        int sliderValue_4= (int) Slider1.getValue();*/
        //System.out.println(sliderValue_1 + " ");
        ScoreField_1.setText(Slider1.getValue() + " ");
        ScoreField_2.setText(Slider2.getValue() + " ");
        ScoreField_3.setText(Slider3.getValue() + " ");
        ScoreField_4.setText(Slider4.getValue() + " ");

    }

    @FXML
    private Label Ename;

    @FXML
    private Label Aname;

    @FXML
    private Label Tname;

    @FXML
    private Button BackButton;



    @FXML
    public MediaView videoPlayer;// = new MediaView(mediaPlayer);

    public MediaView getVideoPlayer() {
        return this.videoPlayer;
    }

    @FXML
    private Slider ProgressBar;

    @FXML
    private Button PlayButton;

    @FXML
    private Button PauseButton;

    //Instantiating mediaView



}

