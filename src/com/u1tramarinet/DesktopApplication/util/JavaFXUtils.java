package com.u1tramarinet.DesktopApplication.util;

import com.sun.istack.internal.NotNull;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFXUtils {
    private JavaFXUtils() {
    }

    public static void setScene(@NotNull Stage stage, @NotNull Scene newScene) {
        stage.setScene(newScene);
        stage.show();
    }
}
