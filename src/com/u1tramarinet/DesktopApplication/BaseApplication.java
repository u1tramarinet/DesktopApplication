package com.u1tramarinet.DesktopApplication;

import com.u1tramarinet.DesktopApplication.view.BasePage;
import com.u1tramarinet.DesktopApplication.util.Logger;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public abstract class BaseApplication extends Application {
    private static final String TAG = BaseApplication.class.getName();
    private static final String LAYOUT_PATH_BASE = "/com/u1tramarinet/DesktopApplication/resources/layout/";
    private static final double DEFAULT_WIDTH = 1000;
    private static final double DEFAULT_HIGHT = 500;
    private Stage stage;

    @Override
    public void init() throws Exception {
        super.init();
        Logger.threadInfo(TAG);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        start();
        Logger.threadInfo(TAG);
    }

    public void start() throws Exception {

    }

    @Override
    public void stop() throws Exception {
        super.stop();
        Logger.threadInfo(TAG);
    }

    protected void setPage(BasePage page) {
        Parent parent = page.onCreateView(LAYOUT_PATH_BASE);
        page.onViewCreated(parent);
        setScene(new Scene(parent, DEFAULT_WIDTH, DEFAULT_HIGHT));
    }

    protected void setScene(Scene scene) {
        stage.setScene(scene);
    }

    public void setTitle(String title) {
        stage.setTitle(title);
    }

    protected void show() {
        stage.show();
    }

    protected void close() {
        stage.close();
    }
}
