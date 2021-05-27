package ipumode.Stage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainStage extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../Layout/MainSecene.fxml"));
        primaryStage.setTitle("IPUMode");
        primaryStage.getIcons().add(new Image("Logo.jpg"));
        primaryStage.setMaximized(true);
        primaryStage.setScene(new Scene(root, 600, 500));  //如果不支持全屏
        primaryStage.show();
    }
}
