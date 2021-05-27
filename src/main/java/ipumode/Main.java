package ipumode;

import ipumode.Stage.MainStage;
import javafx.application.Application;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main{

    private final static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("开始启动程序");
        Application.launch(MainStage.class, args);
    }
}
