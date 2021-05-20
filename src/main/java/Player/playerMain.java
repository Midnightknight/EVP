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
        String Spath = "C:/Dev/Test.mp4";
        playerController view = new playerController();
        view.setVideoPlayer(Spath);

        Parent root = FXMLLoader.load(getClass().getResource("frames/EVP.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Media Player");
        stage.setScene(scene);
        stage.show();
    }

}
