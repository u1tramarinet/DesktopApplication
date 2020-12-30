package com.u1tramarinet.DesktopApplication.view.main;

import com.u1tramarinet.DesktopApplication.BaseApplication;
import com.u1tramarinet.DesktopApplication.util.Logger;
import com.u1tramarinet.DesktopApplication.view.BaseController;
import com.u1tramarinet.DesktopApplication.view.BasePage;
import javafx.scene.Parent;

public class MainPage extends BasePage implements MainController.Callback {
    private MainController controller;
    private MainPage(BaseApplication application) {
        super(application);
    }

    public static MainPage newInstance(BaseApplication application) {
        return new MainPage(application);
    }

    @Override
    public Parent onCreateView(String layoutBasePath) {
        return onCreateView(layoutBasePath, "layout_main.fxml");
    }

    @Override
    public void onViewCreated(Parent root) {
        super.onViewCreated(root);
    }

    @Override
    protected void onControllerObtained(BaseController controller) {
        super.onControllerObtained(controller);
        this.controller = (MainController) controller;
        this.controller.setCallback(this);
    }

    @Override
    public void onImageComparatorClicked() {
        Logger.d(MainPage.class.getName(), "onImageComparatorClicked()");
        getTransitionManager().startFilerPage();
    }
}
