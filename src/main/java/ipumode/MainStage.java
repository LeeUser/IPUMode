package ipumode;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainStage extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Layout/MainSecene.fxml"));
        primaryStage.setTitle("IPUMode");
        primaryStage.setMaximized(true);
        primaryStage.setScene(new Scene(root, 600, 500));  //如果不支持全屏
        primaryStage.show();
    }

}
