package Player;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class playerMain extends Application {
    public static void main(String[] args) {
        Application.launch(playerMain.class, args);
    }

    @Override
    public void start(Stage stage) throws Exception {


        Parent root = FXMLLoader.load(getClass().getResource("frames/EVP.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Media Player");
        stage.setScene(scene);
        stage.show();
    }

}
