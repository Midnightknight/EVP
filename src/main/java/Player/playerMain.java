package Player;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.scene.media.MediaView;
import Player.playerController;

import java.io.File;


public class playerMain extends Application {
    public static void main(String[] args) {
        Application.launch(playerMain.class, args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        //Instantiating the media field.
        String Spath = "C:/Users/Kenneth/Videos/Twitch/Test.mp4";

        //Instantiating Media Class
        Media media = new Media(new File(Spath).toURI().toString());

        //Instantiating media player
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);
        playerController view = new playerController();

        view.videoPlayer = mediaView;

        //MediaView vp = view.getVideoPlayer();
        mediaPlayer.setAutoPlay(true);

        /*
        //setting group and scene
        Group root = new Group();
        root.getChildren().add(mediaView);
        int w = mediaPlayer.getMedia().getWidth();
        int h = mediaPlayer.getMedia().getHeight();
        Scene scene = new Scene(root,w,h);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Playing video");
        primaryStage.show();*/

        Parent root = FXMLLoader.load(getClass().getResource("frames/EVP.fxml"));
        //root.getChildren().add(mediaView);
        mediaPlayer.setAutoPlay(true);
        Scene scene = new Scene(root);
        stage.setTitle("Media Player");
        stage.setScene(scene);
        stage.show();
    }

}
