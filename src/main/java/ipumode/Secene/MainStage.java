package ipumode.Secene;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainStage extends Application {

    private final static Logger logger = LogManager.getLogger(MainStage.class);

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Layout/MainSecene.fxml"));
        primaryStage.setTitle("IPUMode");
        primaryStage.getIcons().add(new Image("Logo.jpg"));
        primaryStage.setMaximized(true);
        primaryStage.setScene(new Scene(root, 600, 500));  //如果不支持全屏
        primaryStage.show();
        logger.info("Stage start 完成");
    }
}
