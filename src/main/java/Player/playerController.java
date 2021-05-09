package Player;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.media.Media;
import javafx.scene.media.MediaView;
import javafx.scene.media.MediaPlayer;
import javafx.scene.web.HTMLEditor;
import java.io.File;

public class playerController<mediaPlayer> {

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
    private Label Ename;

    @FXML
    private Label Aname;

    @FXML
    private Label Tname;

    @FXML
    private Button BackButton;

    @FXML
    public MediaView videoPlayer;

    @FXML
    private Slider ProgressBar;

    @FXML
    private Button PlayButton;

    @FXML
    private Button PauseButton;

    //Instantiating the media field.
    String Spath = "C:/Users/Kenneth/Videos/Twitch/Test.mp4";

    //Instantiating Media Class
    Media media = new Media(new File(Spath).toURI().toString());

    //Instantiating media player
    MediaPlayer mediaPlayer = new MediaPlayer(media);

    //Instantiating mediaView
     videoPlayer.setMediaPlayer(mediaPlayer);


}

