package ipumode;

import ipumode.Secene.MainStage;
import javafx.application.Application;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StartMain {

    private final static Logger logger = LogManager.getLogger(StartMain.class);

    public static void main(String[] args) {
        logger.info("开始启动程序");
        Application.launch(MainStage.class, args);
    }
}
