package com.u1tramarinet.DesktopApplication.view.filer;

import com.u1tramarinet.DesktopApplication.BaseApplication;
import com.u1tramarinet.DesktopApplication.view.BasePage;
import javafx.scene.Parent;

public class FilerPage extends BasePage {
    private FilerPage(BaseApplication application) {
        super(application);
    }

    public static FilerPage newInstance(BaseApplication application) {
        return new FilerPage(application);
    }

    @Override
    public Parent onCreateView(String layoutBasePath) {
        return onCreateView(layoutBasePath, "layout_filer.fxml");
    }
}
