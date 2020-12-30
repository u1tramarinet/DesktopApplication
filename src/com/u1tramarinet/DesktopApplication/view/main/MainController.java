package com.u1tramarinet.DesktopApplication.view.main;

import com.u1tramarinet.DesktopApplication.util.Logger;
import com.u1tramarinet.DesktopApplication.view.BaseController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController extends BaseController {
    private Callback callback;
    @FXML
    public Button imageComparatorButton;

    @FXML
    public void onImageComparatorClicked(ActionEvent event) {
        Logger.d(MainController.class.getName(), "onImageComparatorClicked()");
        if (callback != null) {
            callback.onImageComparatorClicked();
        }
    }

    void setCallback(Callback callback) {
        this.callback = callback;
    }

    interface Callback {
        void onImageComparatorClicked();
    }
}
