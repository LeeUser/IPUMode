package ipumode.Controller;

import ipumode.Main;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MainSeceneController extends RootController{

    private final static Logger logger = LogManager.getLogger(MainSeceneController.class);

    //全局定时器
    Timer timer = new Timer();

    //系统时间显示
    @FXML
    public Label systemTimeStamp;

    //定义界面对象
    LeftSeceneController leftSeceneController;
    CenterSeceneController centerSeceneController;
    RightSeceneController rightSeceneController;

    //控件定时更新
    @FXML
    private void initialize() {

        //初始化控件对象
        leftSeceneController = (LeftSeceneController) Context.controllers.get(LeftSeceneController.class.getSimpleName());
        centerSeceneController = (CenterSeceneController) Context.controllers.get(CenterSeceneController.class.getSimpleName());
        rightSeceneController = (RightSeceneController) Context.controllers.get(RightSeceneController.class.getSimpleName());

        //执行更新
        UpdateDataToUI();
    }

    //定时更新控件
    public void UpdateDataToUI()
    {
        logger.info("开始定时更新控件");
        timer.schedule(new TimerTask() {
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        systemTimeStamp.setText((new Date()).toString());;  //开始更新ui代码
                    }
                });
            }
        }, 0, 1000); //定时器的延迟时间及间隔时间
    }

}
