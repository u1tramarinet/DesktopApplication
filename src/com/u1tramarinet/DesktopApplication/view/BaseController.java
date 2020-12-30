package com.u1tramarinet.DesktopApplication.view;

import com.u1tramarinet.DesktopApplication.util.Logger;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class BaseController implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Logger.d("BaseController", "initialize() location=%s, resources=%s", location, resources);
    }
}
