package com.u1tramarinet.DesktopApplication.view;

import com.u1tramarinet.DesktopApplication.BaseApplication;
import com.u1tramarinet.DesktopApplication.TransitionManager;
import com.u1tramarinet.DesktopApplication.util.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;

public abstract class BasePage {
    private static final String TAG = BasePage.class.getName();
    private final BaseApplication application;
    private TransitionManager transitionManager;

    public BasePage(BaseApplication application) {
        this.application = application;
    }

    public abstract Parent onCreateView(String layoutBasePath);

    public void onViewCreated(Parent root) {
        Logger.d(TAG, "onViewCreated() root=" + root);
    }

    public void setTransitionManager(TransitionManager transitionManager) {
        this.transitionManager = transitionManager;
    }

    protected TransitionManager getTransitionManager() {
        return transitionManager;
    }

    protected Parent onCreateView(String layoutBasePath, String layoutFileName) {
        Logger.d(BasePage.class.getName(), "onCreateView() layoutBasePath=" + layoutBasePath + ", layoutFileName=" + layoutFileName);
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(layoutBasePath + layoutFileName));
            Parent root = loader.load();
            onControllerObtained(loader.getController());
            return root;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    protected BaseApplication getApplication() {
        return application;
    }

    protected void onControllerObtained(BaseController controller) {

    }
}
