package com.u1tramarinet.DesktopApplication;

import com.u1tramarinet.DesktopApplication.view.BasePage;
import com.u1tramarinet.DesktopApplication.view.filer.FilerPage;
import com.u1tramarinet.DesktopApplication.view.main.MainPage;

public class Main extends BaseApplication implements TransitionManager {

    @Override
    public void start() throws Exception {
        setTitle("Desktop Application");
        show();
        startMainPage();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void setPageWithTransitionManager(BasePage page) {
        page.setTransitionManager(this);
        setPage(page);
    }

    @Override
    public void startMainPage() {
        setPageWithTransitionManager(MainPage.newInstance(this));
    }

    @Override
    public void startFilerPage() {
        setPageWithTransitionManager(FilerPage.newInstance(this));
    }
}
