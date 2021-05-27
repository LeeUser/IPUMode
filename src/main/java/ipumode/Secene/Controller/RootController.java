package ipumode.Secene.Controller;

public class RootController {
    public RootController() {
        //初始化时保存当前Controller实例
        Context.controllers.put(this.getClass().getSimpleName(), this);
    }
}
